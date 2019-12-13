package clases;

import GUI.GUI_principal;
import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;

/**
 * @author jh3ys0n
 */
public class Agente_I extends GuiAgent {

    GUI_principal gui;

    @Override
    public void setup() {
        gui = new GUI_principal(this);
    }

    @Override
    protected void onGuiEvent(GuiEvent ge) {
        int tipoElemento = ge.getType();
        if (tipoElemento == 1) {
            addBehaviour(new OneShotBehaviour() {
                @Override
                public void action() {
                    String txtBusqueda = (String) ge.getParameter(0);
                    ACLMessage aclMessage = new ACLMessage(ACLMessage.INFORM);
                    aclMessage.setContent(txtBusqueda);
                    aclMessage.addReceiver(new AID("Agente-B", AID.ISLOCALNAME));
                    send(aclMessage);
                    //throw new UnsupportedOperationException("Not supported yet.");
                }
            });
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
