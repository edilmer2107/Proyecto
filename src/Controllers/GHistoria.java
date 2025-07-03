
package Controllers;

import BaseDatos.*;
import Entidades.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class GHistoria implements CRUD{
    private Connection con = null;

    @Override
    public ArrayList listar() throws Exception {
       ArrayList<Historia> arrHistoria = new ArrayList<>();
       ResultSet rs = null;
       PreparedStatement ps = null;
        try {
            this.con = Conexion.conectar();
            String sql = "SELECT " +
                "  h.id, p.nombres AS paciente_nombres, m.nombres AS medico_nombres, e.tipoE, h.fecha, h.motivo_consulta, h.observaciones " +
                "FROM Historia h " +
                "  INNER JOIN paciente p ON h.id_paciente = p.id_paciente " +
                "  INNER JOIN medico m ON h.id_medico = m.id_medico " +
                "  INNER JOIN especialidad e ON h.id_especialidad = e.id_especialidad " +
                "WHERE m.estado = 1 AND p.estado = 1";

            
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id_paciente"));
                paciente.setNombres(rs.getString("nombres"));
                
                Medico medico = new Medico();
                medico.setId(rs.getInt("id_medico"));
                medico.setNombres(rs.getString("nombres"));

                Especialidad especialidad = new Especialidad();
                especialidad.setId(rs.getInt("id_especialidad")); 
                especialidad.setTipoE(rs.getString("tipoE"));
                
                Date fecha = rs.getDate("fecha");
                String motivo_consulta = rs.getString("motivo_consulta");
                String observaciones = rs.getString("observaciones");
                

                Historia objH = new Historia(paciente, medico, especialidad, fecha.toLocalDate(), motivo_consulta, observaciones);
                objH.setId(id);

                arrHistoria.add(objH);
            }
            
        } catch (Exception e) {
            throw e;
        }
        return arrHistoria;
       
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
