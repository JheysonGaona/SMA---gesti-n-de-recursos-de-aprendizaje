package agentes;

import clases.RecursosAprendizaje;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.ArrayList;

/*
 * @author jh3ys0n
 */
public class Agente_B extends Agent {

    RecursosAprendizaje ra = new RecursosAprendizaje();
    ArrayList<String> sinonimos = new ArrayList<>();
    ACLMessage aclMessage;
    boolean relevante = false;

    @Override
    public void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                aclMessage = receive();
                if (aclMessage != null) {
                    String mensaje = aclMessage.getContent();
                    System.out.println(getLocalName() + ": acada de recibir el siguiente mensaje: " + mensaje);
                    sinonimos = ra.buscarRA(mensaje);
                    System.out.println(getLocalName() + ": preparandose para buscar palabra clave");
                    if (sinonimos != null) {
                        for (int i = 0; i < sinonimos.size(); i++) {
                            if (sinonimos.get(i).equals(mensaje)) {
                                consulta(sinonimos.get(0));
                                relevante = true;
                                break;
                            }
                        }
                    } else {
                        consulta(mensaje);
                    }
                }
            }
        });
    }

    private void consulta(String mensaje) {
        aclMessage = new ACLMessage(ACLMessage.INFORM);
        aclMessage.setContent(mensaje);
        aclMessage.addReceiver(new AID("Agente-RS", AID.ISLOCALNAME));
        send(aclMessage);
        System.out.println(getLocalName() + ": preparandose para enviar palabra clave al Agente-RS");
        System.out.println("===============================================================\n");
    }
}
