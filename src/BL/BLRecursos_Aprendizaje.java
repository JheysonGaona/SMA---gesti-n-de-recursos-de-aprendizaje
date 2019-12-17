package BL;

import DAT.*;
import clases.RecursosAprendizaje;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author jheys
 */
public class BLRecursos_Aprendizaje {

    DATRecursos_Aprendizaje objDatRA = new DATRecursos_Aprendizaje();
    DATConexion objDATConexion = new DATConexion();

    public ArrayList<RecursosAprendizaje> consultarRA(String mensaje) throws ClassNotFoundException, SQLException {
        ArrayList<RecursosAprendizaje> lista = new ArrayList<>();
        ResultSet rs = objDatRA.consultarRA(mensaje);
        RecursosAprendizaje nuevo;
        while (rs.next()) {//si existe un registro 
            int id_recurso = rs.getInt("id_recurso");
            String titulo_recurso = rs.getString("titulo_recurso");
            String detalle_recurso = rs.getString("detalle_recurso");
            String enlace_recurso = rs.getString("enlace_recurso");
            String categoria = rs.getString("categoria");
            nuevo = new RecursosAprendizaje(id_recurso, titulo_recurso, detalle_recurso,
            enlace_recurso, categoria);
            lista.add(nuevo);
        }
        this.cerrarConexion();
        return lista;
    }

    public void cerrarConexion() throws SQLException {
        objDATConexion.cerrarConexion();
    }
}
