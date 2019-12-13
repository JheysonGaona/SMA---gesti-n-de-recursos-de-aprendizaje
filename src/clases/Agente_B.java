package clases;

import BL.BLRecursos_Aprendizaje;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author jh3ys0n
 */
public class Agente_B extends Agent{
    
    BLRecursos_Aprendizaje objRA = new BLRecursos_Aprendizaje();
    private String mensaje;
    
    @Override
    public void setup(){
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage aclMessage = receive();
                if(aclMessage != null){
                    mensaje = aclMessage.getContent();
                    System.out.println(getLocalName() + ": acada de recibir el siguiente mensaje " + mensaje);
                    
                    
                    
                    
                    // buscarRA();
                    
                }
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }
    
    private void buscarRA() {
        try {
            ArrayList<String> resultados = objRA.consultarRA(mensaje);
            if (!resultados.isEmpty()) {
                System.out.println(resultados);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado resultados");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private void gestionarPalabras(){
        
    }
    
}
