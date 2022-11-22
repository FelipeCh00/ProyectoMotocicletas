package ProyectoMotocicletas.MetodosSQL;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static String url = "jdbc:mysql://localhost/data";
    public static String usuario = "root";
    public static String password = "root";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {

        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
}
