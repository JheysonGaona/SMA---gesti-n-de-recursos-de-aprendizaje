package BL;

import DAT.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author jheys
 */
public class BLRecursos_Aprendizaje {

    DATRecursos_Aprendizaje objDatRA = new DATRecursos_Aprendizaje();
    DATConexion objDATConexion = new DATConexion();

        public ArrayList<String> consultarRA(String mensaje)throws ClassNotFoundException, SQLException {
        ArrayList<String> lista = new ArrayList<>();
        ResultSet rs = objDatRA.consultarRA(mensaje);
        while (rs.next()) {//si existe un registro 
            int idRA = rs.getInt("id_recurso");
            String tituloRA = rs.getString("titulo_recurso");
            String datos = String.format("%s'%s", idRA, tituloRA);
            lista.add(datos);
        }
        this.cerrarConexion();
        return lista;
    }

    public void cerrarConexion() throws SQLException {
        objDATConexion.cerrarConexion();
    }
}
