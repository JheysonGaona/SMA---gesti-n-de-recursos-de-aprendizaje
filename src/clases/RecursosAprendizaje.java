package clases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author jh3ys0n
 */
public class RecursosAprendizaje implements Serializable{

    private int id_recurso;
    private String titulo_recurso;
    private String detalle_recurso;
    private String enlace_recurso;
    private String categoria;
    private LeerRepositoriaRA repositorio;

    public RecursosAprendizaje() {
    }

    public RecursosAprendizaje(int id_recurso, String titulo_recurso,
            String detalle_recurso, String enlace_recurso, String categoria) {
        this.id_recurso = id_recurso;
        this.titulo_recurso = titulo_recurso;
        this.detalle_recurso = detalle_recurso;
        this.enlace_recurso = enlace_recurso;
        this.categoria = categoria;
    }
    public RecursosAprendizaje(String titulo_recurso) {
        this.titulo_recurso = titulo_recurso;
    }

    public int getId_recurso() {
        return id_recurso;
    }

    public void setId_recurso(int id_recurso) {
        this.id_recurso = id_recurso;
    }

    public String getTitulo_recurso() {
        return titulo_recurso;
    }

    public void setTitulo_recurso(String titulo_recurso) {
        this.titulo_recurso = titulo_recurso;
    }

    public String getDetalle_recurso() {
        return detalle_recurso;
    }

    public void setDetalle_recurso(String detalle_recurso) {
        this.detalle_recurso = detalle_recurso;
    }

    public String getEnlace_recurso() {
        return enlace_recurso;
    }

    public void setEnlace_recurso(String enlace_recurso) {
        this.enlace_recurso = enlace_recurso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String sinResultados(String ruta) {
        String datos = "";
        try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(ruta));
            datos = (String) read.readObject();
            read.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return datos;
    }
    
    public ArrayList<String> buscarRA(String recursoAprendizaje){
        repositorio = new LeerRepositoriaRA();
        repositorio.abrirArchivo("Repositorio de RA.txt");
        ArrayList<String> lista = repositorio.leer_informacion(recursoAprendizaje);
        repositorio.cerrarArchivo();
        return lista;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n%s\n%s\nTipo de recurso: %s\n\n", getTitulo_recurso(),
                getEnlace_recurso(), getDetalle_recurso(), getCategoria());
    }
    
}