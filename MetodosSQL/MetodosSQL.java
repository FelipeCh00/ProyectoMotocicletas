package ProyectoMotocicletas.MetodosSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MetodosSQL {

    public static ConexionBD conexion = new ConexionBD();

    public static PreparedStatement sentenciaPreparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNumero = 0;

    public int guardar(String nickname, String password) {

        int resultado = 0;
        Connection conexion = null;

        String sentenciaGuardar = ("INSERT INTO usuarios (nickname,password) VALUES (?,?)");

        try {
            conexion = ConexionBD.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            sentenciaPreparada.setString(1, nickname);
            sentenciaPreparada.setString(2, password);
            resultado = sentenciaPreparada.executeUpdate();
            sentenciaPreparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    // Busca el nombre del usuario
    public static String buscarUsuario(String nickname) {

        String busquedaNombre = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = ("SELECT nickname FROM usuarios WHERE nickname = '" + nickname + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                String usuario = resultado.getString("nickname");
                busquedaNombre = usuario;
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return busquedaNombre;
    }

    // Busca el usuario en la base de datos
    public static String buscarUserRegistrado(String usuario, String password) {

        String busquedaUsuario = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentenciaBuscarUsuario = ("SELECT nickname,password FROM usuarios WHERE nickname = '" + usuario + "' && password = '" + password + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscarUsuario);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                busquedaUsuario = "Usuario encontrado";
            } else {
                busquedaUsuario = "Usuario no encontrado";
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return busquedaUsuario;
    }
}
