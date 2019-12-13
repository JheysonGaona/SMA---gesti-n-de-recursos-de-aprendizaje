package DAT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jh3ys0n
 */
public class DATConexion {

    //Conectarse a la BDD
    private static Connection conexion;//obj tipo Conecction

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "1626";
        String url = "jdbc:mysql://localhost:3306/Recursos_Aprendizaje";
        Class.forName(driver);//Diver jdbc para trabajr conexion access
        conexion = DriverManager.getConnection(url, user, password);
        return conexion;//retorna la cioneccion url+ruta bd
    }

    //Objeto tipo Connection para majenar la conecion
    public Connection abrirConexion() throws ClassNotFoundException, SQLException {
        conexion = getConnection();
        return conexion;
    }

    //cerrar la coneccion 
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
}
