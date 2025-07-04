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
    "  h.id, " +
    "  p.id AS id_paciente, p.nombres AS paciente_nombres, " +
    "  m.id AS id_medico, m.nombres AS medico_nombres, " +
    "  e.id AS id_especialidad, e.tipoE, " +
    "  h.fecha, h.motivo_consulta, h.observaciones " +
    "FROM historia h " +
    "  INNER JOIN paciente p ON h.id_paciente = p.id " +
    "  INNER JOIN medico m ON h.id_medico = m.id " +
    "  INNER JOIN especialidad e ON h.id_especialidad = e.id " +
    "WHERE m.estado = 1 AND p.estado = 1";


            
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");

Paciente paciente = new Paciente();
paciente.setId(rs.getInt("id_paciente"));
paciente.setNombres(rs.getString("paciente_nombres"));

Medico medico = new Medico();
medico.setId(rs.getInt("id_medico"));
medico.setNombres(rs.getString("medico_nombres"));

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
    
    
    public ArrayList<Historia> listarPorEspecialidad(int idEspecialidad) throws Exception {
    ArrayList<Historia> arrHistoria = new ArrayList<>();
    ResultSet rs = null;
    PreparedStatement ps = null;
    try {
        this.con = Conexion.conectar();
        String sql = "SELECT h.id, " +
                "p.id AS id_paciente, p.nombres AS paciente_nombres, " +
                "m.id AS id_medico, m.nombres AS medico_nombres, " +
                "e.id AS id_especialidad, e.tipoE, " +
                "h.fecha, h.motivo_consulta, h.observaciones " +
                "FROM historia h " +
                "INNER JOIN paciente p ON h.id_paciente = p.id " +
                "INNER JOIN medico m ON h.id_medico = m.id " +
                "INNER JOIN especialidad e ON h.id_especialidad = e.id " +
                "WHERE m.estado = 1 AND p.estado = 1 AND e.id = ?";

        ps = this.con.prepareStatement(sql);
        ps.setInt(1, idEspecialidad); // Aquí se filtra por el área
        rs = ps.executeQuery();

        while (rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setId(rs.getInt("id_paciente"));
            paciente.setNombres(rs.getString("paciente_nombres"));

            Medico medico = new Medico();
            medico.setId(rs.getInt("id_medico"));
            medico.setNombres(rs.getString("medico_nombres"));

            Especialidad especialidad = new Especialidad();
            especialidad.setId(rs.getInt("id_especialidad"));
            especialidad.setTipoE(rs.getString("tipoE"));

            Date fecha = rs.getDate("fecha");
            String motivo = rs.getString("motivo_consulta");
            String obs = rs.getString("observaciones");

            Historia h = new Historia(paciente, medico, especialidad, fecha.toLocalDate(), motivo, obs);
            h.setId(rs.getInt("id"));
            arrHistoria.add(h);
        }
    } catch (Exception e) {
        throw e;
    }
    return arrHistoria;
}
    
    @Override
public int crear(Object obj) throws SQLException {
    Historia historia = (Historia) obj;
    int idGenerado = -1;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        this.con = Conexion.conectar();
        String sql = "INSERT INTO historia (id_paciente, id_medico, id_especialidad, fecha, motivo_consulta, observaciones) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";

        ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, historia.getPaciente().getId());
        ps.setInt(2, historia.getMedico().getId());
        ps.setInt(3, historia.getEspecialidad().getId());
        ps.setDate(4, Date.valueOf(historia.getFecha()));
        ps.setString(5, historia.getMotivo_consulta());
        ps.setString(6, historia.getObservaciones());

        int filas = ps.executeUpdate();
        if (filas > 0) {
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
