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
    String txtBusqueda;
    RecursosAprendizaje ra = new RecursosAprendizaje();

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
                            System.out.println(getLocalName() + ": recibio datos del Agente-RS\n\n");
                            gui.establecerLista(lista);
                        } else {
                            System.out.println(getLocalName() + ": no recibio datos del Agente-RS\n\n");
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
                    System.out.println(getLocalName() + ": recojio el siguiente mensaje: " + txtBusqueda);
                    ACLMessage aclMessage = new ACLMessage(ACLMessage.INFORM);
                    aclMessage.setContent(txtBusqueda.toLowerCase());
                    aclMessage.addReceiver(new AID("Agente-B", AID.ISLOCALNAME));
                    send(aclMessage);
                    System.out.println(getLocalName() + ": preparandose para enviar mensaje al Agente-B");
                    System.out.println("===============================================================\n");
                }
            });
        }
    }
}
