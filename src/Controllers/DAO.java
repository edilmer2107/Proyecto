package Controllers;

import BaseDatos.ConexionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean validarUsuario(String usuario, String contraseña) {
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND contraseña = ?";
        try (Connection con = ConexionDAO.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            
            return rs.next(); // true si hay coincidencia
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
