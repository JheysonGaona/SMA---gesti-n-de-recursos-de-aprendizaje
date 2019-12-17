package agentes;

import BL.BLRecursos_Aprendizaje;
import clases.RecursosAprendizaje;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author jh3ys0n
 */
public class Agente_B extends Agent {

    BLRecursos_Aprendizaje objRA = new BLRecursos_Aprendizaje();
    ArrayList<RecursosAprendizaje> lista;
    private String mensaje;

    @Override
    public void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage aclMessage = receive();
                if (aclMessage != null) {
                    mensaje = aclMessage.getContent();
                    System.out.println(getLocalName() + ": acada de recibir el siguiente mensaje " + mensaje);
                    try {
                        lista = objRA.consultarRA(mensaje);
                        if (!lista.isEmpty()) {
                            aclMessage = new ACLMessage(ACLMessage.INFORM);
                            aclMessage.setContentObject((Serializable) lista);
                            aclMessage.addReceiver(new AID("Agente-I", AID.ISLOCALNAME));
                            send(aclMessage);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se ha encontrado resultados");
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        System.err.println(ex.getMessage());
                    
                    } catch (IOException ex) {
                        Logger.getLogger(Agente_B.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }
}