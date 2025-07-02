
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

public class GMedico implements CRUD{
    private Connection con = null;

    @Override
    public ArrayList listar() throws Exception {
        ArrayList<Medico> arrMedico = new ArrayList();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            this.con = Conexion.conectar();
            String sql ="SELECT m.id, m.nombres,m.apellidos,m.dni,m.telefono,m.correo, " +
                     "es.tipoE " +
                     " FROM medico AS m " +
                     "INNER JOIN especialidad AS es ON  m.id_especialidad= es.id WHERE m.estado=1";
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();
            Medico objM = null;
            while(rs.next()){
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                
                Especialidad especialidad = new Especialidad();
                especialidad.setTipoE(rs.getString("tipoE"));
                
                objM = new Medico(especialidad, nombres, apellidos, dni, telefono, correo);
                
                objM.setId(id);
                arrMedico.add(objM);
            }
        } catch (Exception e) {
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
        String sql = "INSERT INTO medico (nombres, apellidos, dni, telefono, correo, id_especialidad) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
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

        int filas = ps.executeUpdate();
        if (filas > 0) {
            System.out.println("Médico actualizado correctamente.");
        } else {
            System.out.println("No se encontró el médico con ID: " + id);
        }

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

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Medico con ID " + id + " marcado como eliminado.");
            } else {
                System.out.println("No se encontró Medico con ID " + id);
            }
        } catch (Exception e) {
            throw e;
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

    
}
