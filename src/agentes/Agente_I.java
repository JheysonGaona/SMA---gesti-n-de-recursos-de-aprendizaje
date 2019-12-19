package agentes;

import GUI.GUI_principal;
import clases.RecursosAprendizaje;
import jade.core.AID;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.ArrayList;

/**
 * @author jh3ys0n
 */
public class Agente_I extends GuiAgent {

    GUI_principal gui;
    RecursosAprendizaje ra = new RecursosAprendizaje();
    String txtBusqueda;

    @Override
    public void setup() {
        gui = new GUI_principal(this);
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage aclMessage = receive();
                if (aclMessage != null) {
                    try {
                        ArrayList<RecursosAprendizaje> lista
                                = (ArrayList<RecursosAprendizaje>) aclMessage.getContentObject();
                        if (lista.size() > 0) {
                            gui.presentarResultados(lista);
                        } else {
                            String msm = ra.sinResultados("Sin Resultados.txt").replace("%s", txtBusqueda);
                            gui.sinResultados(msm);
                        }
                    } catch (UnreadableException e) {
                        e.getMessage();
                    }
                }
            }
        });
    }

    @Override
    protected void onGuiEvent(GuiEvent ge) {
        int tipoElemento = ge.getType();
        if (tipoElemento == 1) {
            addBehaviour(new OneShotBehaviour() {
                @Override
                public void action() {
                    txtBusqueda = (String) ge.getParameter(0);
                    ACLMessage aclMessage = new ACLMessage(ACLMessage.INFORM);
                    aclMessage.setContent(txtBusqueda.toLowerCase());
                    aclMessage.addReceiver(new AID("Agente-B", AID.ISLOCALNAME));
                    send(aclMessage);
                }
            });
        }
    }
}
