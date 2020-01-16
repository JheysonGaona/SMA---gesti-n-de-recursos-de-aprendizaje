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

/**
 * @author jh3ys0n
 */
public class Agente_RS extends Agent {

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
                    System.out.println(getLocalName() + ": acaba de recibir el siguiente mensaje: " + mensaje);
                    try {
                        System.out.println(getLocalName() + ": preparandose para realizar consulta hacia la base de datos");
                        lista = objRA.consultarRA(mensaje);
                        System.out.println(getLocalName() + ": finalizo la tarea de realizar consulta hacia la base de datos");
                        aclMessage = new ACLMessage(ACLMessage.INFORM);
                        aclMessage.setContentObject((Serializable) lista);
                        aclMessage.addReceiver(new AID("Agente-I", AID.ISLOCALNAME));
                        send(aclMessage);
                        System.out.println(getLocalName() + ": preparandose para enviar mensaje al Agente-I");
                        System.out.println("===============================================================\n");
                    } catch (ClassNotFoundException | SQLException ex) {
                        System.err.println(ex.getMessage());
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        });
    }
}
