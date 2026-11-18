package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=SISTEMA_VENTAS;encrypt=false;trustServerCertificate=true;";
    private static final String USER = "sa"; 
    private static final String PASSWORD = "123456789"; // AQUÍ VA TU CONTRASEÑA

    public static Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a SQL Server!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver no encontrado -> " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error SQL al conectar -> " + e.getMessage());
        }
        return cn;
    }

    public static void main(String[] args) {
        getConexion();
    }
}
