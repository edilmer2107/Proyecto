package BaseDatos;

import java.sql.*;

public class Conexion {
    private static String url = "jdbc:mysql://localhost/cs_system";
    private static String user = "root";
    private static String pas = "";
    
    public static Connection conectar() throws SQLException{
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url,user,pas);
            System.out.println("CONEXION");
        } catch (SQLException e) {
            throw e;
        }
        return conexion;
    }
}