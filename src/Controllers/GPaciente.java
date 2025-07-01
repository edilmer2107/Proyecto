
package Controllers;

import BaseDatos.CRUD;
import BaseDatos.Conexion;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            String sql = "SELECT * FROM paciente";
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
    public int crear(Object Object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    @Override
    public void actualizar(int id, Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void eliminar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    @Override
    public Object get(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
    
}
