package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jheys
 */
public class DATRecursos_Aprendizaje {

    DATConexion conectar = new DATConexion();

    public ResultSet consultarRA(String mensaje) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM recurso WHERE titulo_recurso = '"
                + mensaje + "';";
        //obj para poder manipular abre coneccion y crea unStatement
        PreparedStatement pst = conectar.abrirConexion().prepareStatement(sql);
        //recuper un un ResultSet y envio la varible a executeQuery
        ResultSet rs = pst.executeQuery();
        return rs;//retornma en un obj ResultSet rs
    }
}
