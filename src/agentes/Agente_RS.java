package agentes;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/*
 * @author jh3ys0n
 */
public class Agente_RS extends Agent {

    @Override
    public void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage aclMessage = receive();
                if (aclMessage != null) {
                    String mensaje = aclMessage.getContent();
                    System.out.println(getLocalName() + ": acada de recibir el siguiente mensaje " + mensaje);
                }
            }
        });
    }


}
