package Controllers;

import BaseDatos.CRUD;
import BaseDatos.Conexion;
import Entidades.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GEspecialidad implements CRUD{
    private Connection con = null;

    @Override
public ArrayList listar() throws Exception {
    ArrayList<Especialidad> arrEspec = new ArrayList<>();
    ResultSet rs = null;
    PreparedStatement ps = null;

    try {
        this.con = Conexion.conectar();
        String sql = "SELECT * FROM especialidad WHERE estado = 1";
        ps = this.con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Especialidad objEs = new Especialidad(); // ✅ Crear dentro del while
            objEs.setId(rs.getInt("id"));
            objEs.setTipoE(rs.getString("tipoE"));
            arrEspec.add(objEs);
        }

    } catch (Exception e) {
        throw e;
    } finally {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (con != null) con.close();
    }

    return arrEspec;
}


    @Override
    public int crear(Object object) throws SQLException {
        Especialidad objEs = (Especialidad) object;
        ResultSet rs = null;
        PreparedStatement ps = null;
        int idGenerado = -1;
                
        try{
            this.con = Conexion.conectar();
            String sql = "INSERT INTO especialidad(id, tipoE)" 
                       + "VALUES (?, ?)";
            ps = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, objEs.getId());
            ps.setString(2, objEs.getTipoE());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            
            if(rs.next()){
               idGenerado = rs.getInt(1);
            }
        }catch(Exception e){
            throw e;
        }finally{
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } 
        return idGenerado;
    }

    @Override
    public void actualizar(int id, Object object) throws Exception {
        Especialidad objEs = (Especialidad) object;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            this.con = Conexion.conectar();
            String sql = "UPDATE especialidad SET tipoE = ? WHERE id = ?";
            ps = this.con.prepareStatement(sql);
            ps.setString(1, objEs.getTipoE());
            ps.setInt(2, id);
            
             ps.executeUpdate();

        }catch(Exception e){
            System.out.println("Error Actualizar: " + e.getMessage());
        }finally{
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } 
    }

    @Override
    public void eliminar(int id) throws Exception {
        PreparedStatement ps = null;
    try {
        this.con = Conexion.conectar();
        String sql = "UPDATE especialidad SET estado = 0 WHERE id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            System.out.println("Especialidad con ID " + id + " marcado como eliminado.");
        } else {
            System.out.println("No se encontró Especialidad con ID " + id);
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
        Especialidad objEs = new Especialidad();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM especialidad WHERE id = ? ";
            ps = this.con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                
                //objTC.setId(rs.getInt("id"));
                objEs.setTipoE(rs.getString("tipoE"));
                
            }else{
                objEs= null;
            }         
             
        }catch(Exception e){
            System.out.println("Error GET: " + e.getMessage());
        }finally{
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
        return objEs;
    }
    
}
