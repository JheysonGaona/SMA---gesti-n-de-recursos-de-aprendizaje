package clases;

import java.io.Serializable;

/**
 * @author jh3ys0n
 */
public class RecursosAprendizaje implements Serializable{

    private int id_recurso;
    private String titulo_recurso;
    private String detalle_recurso;
    private String enlace_recurso;
    private String categoria;

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
    
    
    @Override
    public String toString(){
        return String.format("%s\n%s\n%s\n\n", getTitulo_recurso(),
                getEnlace_recurso(), getDetalle_recurso(), getCategoria());
    }
    
}