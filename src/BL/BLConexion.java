package BL;

import DAT.DATConexion;
import java.sql.SQLException;

/**
 * @author jheys
 */
public class BLConexion {

    //para poder acceder a paquete DAT
    DATConexion manejadorConexion = new DATConexion();

    public void cerrarConexion() throws SQLException {
        manejadorConexion.cerrarConexion();
    }
}
