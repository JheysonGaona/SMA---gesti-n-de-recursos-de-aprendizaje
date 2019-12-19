package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author jh3ys0n
 */
public class LeerRepositoriaRA implements Serializable{

    private Scanner entrada;

    public void abrirArchivo(String ruta) {
        try {
            entrada = new Scanner(new File(ruta));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo. " + fileNotFoundException.getMessage());
            System.exit(1);
        }
    }

    public ArrayList<String> leer_informacion(String recursoAprendizaje) {
        ArrayList<String> linea_partes = null;
        ArrayList<String> sinonimos = null;
        try {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                linea_partes = new ArrayList<>(Arrays.asList(linea.split(",")));
                for (int i = 0; i < linea_partes.size(); i++) {
                    if (linea_partes.get(i).equals(recursoAprendizaje)) {
                        sinonimos = new ArrayList<>();
                        sinonimos = linea_partes;
                        break;
                    }
                }
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado. " + elementException.getMessage());
            entrada.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo. " + stateException.getMessage());
            System.exit(1);
        }
        return sinonimos;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }
    }
}
