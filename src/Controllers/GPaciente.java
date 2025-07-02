
package Controllers;

import BaseDatos.CRUD;
import BaseDatos.Conexion;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GPaciente implements CRUD{
    private Connection con = null;

    @Override
    public ArrayList listar() throws Exception {
       ArrayList<Paciente> arrPaciente = new ArrayList<>();
       ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM paciente WHERE estado = 1";
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();
            Paciente objP = null;
            while(rs.next()){
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String sexo = rs.getString("sexo");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");
                Date  fecha_nacimento = rs.getDate("fecha_nacimento");
                String lugar_nacimiento = rs.getString("lugar_nacimiento");
                String estado_civil = rs.getString("estado_civil");
                String Datos_del_Apoderado = rs.getString("Datos_del_Apoderado");
                Date fecha_registro = rs.getDate("fecha_registro");
                objP = new Paciente(
                nombres, apellidos, dni, telefono, correo, direccion,
                lugar_nacimiento, estado_civil, Datos_del_Apoderado,
                sexo, fecha_nacimento.toLocalDate(), fecha_registro.toLocalDate());
                
                objP.setId(id);
                arrPaciente.add(objP);
            }
        }catch (Exception e){
           // e.printStackTrace();
            throw e;
        } 
        return arrPaciente;
    }

    @Override
    public int crear(Object obj) throws SQLException {
        Paciente objP = (Paciente) obj;
    int idGenerado = -1;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        this.con = Conexion.conectar();
        String sql = "INSERT INTO paciente (nombres, apellidos, dni, sexo, telefono, correo, direccion, fecha_nacimento, lugar_nacimiento, estado_civil, Datos_del_apoderado, fecha_registro) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        ps = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, objP.getNombres());
        ps.setString(2, objP.getApellidos());
        ps.setString(3, objP.getDni());
        ps.setString(4, objP.getSexo());
        ps.setString(5, objP.getTelefono());
        ps.setString(6, objP.getCorreo());
        ps.setString(7, objP.getDireccion());
        ps.setDate(8, Date.valueOf(objP.getFecha_nacimento())); // LocalDate -> java.sql.Date
        ps.setString(9, objP.getLugar_nacimiento());
        ps.setString(10, objP.getEstado_civil());
        ps.setString(11, objP.getDatos_del_Apoderado());
        ps.setDate(12, Date.valueOf(objP.getFecha_registro())); // LocalDate -> java.sql.Date
        
        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                idGenerado = rs.getInt(1);
            }
        }
    } catch (SQLException e) {
        throw e;
    } finally {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (con != null) con.close();
    }
    return idGenerado;
    }

    @Override
    public void actualizar(int id, Object object) throws Exception {
        Paciente objP = (Paciente) object;
    PreparedStatement ps = null;

    try {
        this.con = Conexion.conectar();
        String sql = "UPDATE paciente SET nombres=?, apellidos=?, dni=?, sexo=?, telefono=?, correo=?, direccion=?, "
                   + "fecha_nacimento=?, lugar_nacimiento=?, estado_civil=?, Datos_del_apoderado=?, fecha_registro=? "
                   + "WHERE id=?";
        
        ps = this.con.prepareStatement(sql);
        ps.setString(1, objP.getNombres());
        ps.setString(2, objP.getApellidos());
        ps.setString(3, objP.getDni());
        ps.setString(4, objP.getSexo());
        ps.setString(5, objP.getTelefono());
        ps.setString(6, objP.getCorreo());
        ps.setString(7, objP.getDireccion());
        ps.setDate(8, Date.valueOf(objP.getFecha_nacimento()));
        ps.setString(9, objP.getLugar_nacimiento());
        ps.setString(10, objP.getEstado_civil());
        ps.setString(11, objP.getDatos_del_Apoderado());
        ps.setDate(12, Date.valueOf(objP.getFecha_registro()));
        ps.setInt(13, id);

        int filas = ps.executeUpdate();
        if (filas > 0) {
            System.out.println("Paciente actualizado correctamente.");
        } else {
            System.out.println("No se encontró un paciente con ID " + id);
        }

    } catch (Exception e) {
        throw e;
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
        String sql = "UPDATE paciente SET estado = 0 WHERE id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            System.out.println("Paciente con ID " + id + " marcado como eliminado (estado = 0).");
        } else {
            System.out.println("No se encontró Paciente con ID " + id);
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
        Paciente objP = new Paciente();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM paciente WHERE id = ? ";
            ps = this.con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
            objP = new Paciente();
            objP.setId(rs.getInt("id"));
            objP.setNombres(rs.getString("nombres"));
            objP.setApellidos(rs.getString("apellidos"));
            objP.setDni(rs.getString("dni"));
            objP.setSexo(rs.getString("sexo"));
            objP.setTelefono(rs.getString("telefono"));
            objP.setCorreo(rs.getString("correo"));
            objP.setDireccion(rs.getString("direccion"));
            Date fechaNacSql = rs.getDate("fecha_nacimento");
            if (fechaNacSql != null) {
                objP.setFecha_nacimento(fechaNacSql.toLocalDate());
            }
            objP.setLugar_nacimiento(rs.getString("lugar_nacimiento"));
            objP.setEstado_civil(rs.getString("estado_civil"));
            objP.setDatos_del_Apoderado(rs.getString("Datos_del_Apoderado"));
            Date fechaRegSql = rs.getDate("fecha_registro");
            if (fechaRegSql != null) {
                objP.setFecha_registro(fechaRegSql.toLocalDate());
            }  
        }
        } catch (Exception e) {
        }
        
        return objP;
    }
    public Paciente buscarPorDni(String dni) throws Exception {
    Paciente objP = null;
    String sql = "SELECT * FROM paciente WHERE dni = ? AND estado=1";
    try (Connection cn = Conexion.conectar(); PreparedStatement ps = cn.prepareStatement(sql)) {
        ps.setString(1, dni);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            objP = new Paciente();
            objP.setId(rs.getInt("id"));
            objP.setNombres(rs.getString("nombres"));
            objP.setApellidos(rs.getString("apellidos"));
            objP.setDni(rs.getString("dni"));
            objP.setSexo(rs.getString("sexo"));
            objP.setTelefono(rs.getString("telefono"));
            objP.setCorreo(rs.getString("correo"));
            objP.setDireccion(rs.getString("direccion"));
            Date fechaNacSql = rs.getDate("fecha_nacimento");
            if (fechaNacSql != null) {
                objP.setFecha_nacimento(fechaNacSql.toLocalDate());
            }
            objP.setLugar_nacimiento(rs.getString("lugar_nacimiento"));
            objP.setEstado_civil(rs.getString("estado_civil"));
            objP.setDatos_del_Apoderado(rs.getString("Datos_del_Apoderado"));
            Date fechaRegSql = rs.getDate("fecha_registro");
            if (fechaRegSql != null) {
                objP.setFecha_registro(fechaRegSql.toLocalDate());
            }  
        }
    }
    return objP;
}

    
}
