package Controllers;

import BaseDatos.CRUD;
import BaseDatos.Conexion;
import Entidades.Especialidad;
import Entidades.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GMedico implements CRUD {
    private Connection con = null;

    @Override
    public ArrayList listar() throws Exception {
        ArrayList<Medico> arrMedico = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            this.con = Conexion.conectar();
            String sql = "SELECT m.id, m.nombres, m.apellidos, m.dni, m.telefono, m.correo, m.id_especialidad, es.tipoE " +
                         "FROM medico AS m " +
                         "INNER JOIN especialidad AS es ON m.id_especialidad = es.id " +
                         "WHERE m.estado = 1";
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");

                Especialidad especialidad = new Especialidad();
                especialidad.setId(rs.getInt("id_especialidad")); // 👈 FALTA CRÍTICA
                especialidad.setTipoE(rs.getString("tipoE"));

                Medico objM = new Medico(especialidad, nombres, apellidos, dni, telefono, correo);
                objM.setId(id);

                arrMedico.add(objM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
        return arrMedico;
    }

    @Override
    public int crear(Object object) throws SQLException {
        Medico objM = (Medico) object;
        int idGenerado = -1;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            this.con = Conexion.conectar();
            String sql = "INSERT INTO medico (nombres, apellidos, dni, telefono, correo, id_especialidad) " +
                         "VALUES (?, ?, ?, ?, ?, ?)";
            ps = this.con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, objM.getNombres());
            ps.setString(2, objM.getApellidos());
            ps.setString(3, objM.getDni());
            ps.setString(4, objM.getTelefono());
            ps.setString(5, objM.getCorreo());
            ps.setInt(6, objM.getEspecialidad().getId());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    idGenerado = rs.getInt(1);
                }
            }
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }

        return idGenerado;
    }

    @Override
    public void actualizar(int id, Object object) throws Exception {
        Medico objM = (Medico) object;
        PreparedStatement ps = null;

        try {
            this.con = Conexion.conectar();
            String sql = "UPDATE medico SET nombres=?, apellidos=?, dni=?, telefono=?, correo=?, id_especialidad=? WHERE id=?";
            ps = this.con.prepareStatement(sql);
            ps.setString(1, objM.getNombres());
            ps.setString(2, objM.getApellidos());
            ps.setString(3, objM.getDni());
            ps.setString(4, objM.getTelefono());
            ps.setString(5, objM.getCorreo());
            ps.setInt(6, objM.getEspecialidad().getId());
            ps.setInt(7, id);

            ps.executeUpdate();

        } finally {
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
    }

    @Override
    public void eliminar(int id) throws Exception {
        PreparedStatement ps = null;
        try {
            this.con = Conexion.conectar();
            String sql = "UPDATE medico SET estado = 0 WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } finally {
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
    }

    @Override
    public Object get(int id) throws Exception {
        Medico objM = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            this.con = Conexion.conectar();
            String sql = "SELECT m.*, e.tipoE FROM medico m INNER JOIN especialidad e ON m.id_especialidad = e.id WHERE m.id = ?";
            ps = this.con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                Especialidad esp = new Especialidad();
                esp.setId(rs.getInt("id_especialidad"));
                esp.setTipoE(rs.getString("tipoE"));

                objM = new Medico(
                    esp,
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("dni"),
                    rs.getString("telefono"),
                    rs.getString("correo")
                );
                objM.setId(id);
            }

        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }

        return objM;
    }
    
    public Medico buscarPorDni(String dni) throws Exception{
        Medico objM = null;
        String sql = "SELECT m.*, e.tipoE FROM medico m INNER JOIN especialidad e ON m.id_especialidad = e.id   WHERE m.dni=? AND m.estado=1";
        //String sql = "SELECT * FROM medico WHERE dni=? AND estado=1";
        try(Connection cn = Conexion.conectar(); 
            PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                objM = new Medico();
                objM.setId(rs.getInt("id"));
                objM.setNombres(rs.getString("nombres"));
                objM.setApellidos(rs.getString("apellidos"));
                objM.setDni(rs.getString("dni"));
                objM.setTelefono(rs.getString("telefono"));
                objM.setCorreo(rs.getString("correo"));
                Especialidad esp = new Especialidad();
                esp.setId(rs.getInt("id_especialidad")); 
                esp.setTipoE(rs.getString("tipoE"));
                objM.setEspecialidad(esp);
            }
            
        }
        return objM;
    }
    public ArrayList<Medico> listarPorEspecialidad(int idEspecialidad) throws Exception {
    ArrayList<Medico> lista = new ArrayList<>();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        con = Conexion.conectar();
        String sql = "SELECT m.*, e.tipoE FROM medico m " +
                     "INNER JOIN especialidad e ON m.id_especialidad = e.id " +
                     "WHERE m.id_especialidad = ? AND m.estado = 1";

        ps = con.prepareStatement(sql);
        ps.setInt(1, idEspecialidad);
        rs = ps.executeQuery();

        while (rs.next()) {
            Especialidad esp = new Especialidad();
            esp.setId(rs.getInt("id_especialidad"));
            esp.setTipoE(rs.getString("tipoE"));

            Medico m = new Medico(
                esp,
                rs.getString("nombres"),
                rs.getString("apellidos"),
                rs.getString("dni"),
                rs.getString("telefono"),
                rs.getString("correo")
            );
            m.setId(rs.getInt("id"));

            lista.add(m);
        }

    } finally {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (con != null) con.close();
    }

    return lista;
}

   

}   