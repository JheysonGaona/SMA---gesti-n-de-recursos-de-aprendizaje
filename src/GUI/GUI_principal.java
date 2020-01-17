package GUI;

import agentes.Agente_I;
import clases.RecursosAprendizaje;
import jade.gui.GuiEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author jh3ys0n
 */
public class GUI_principal extends javax.swing.JFrame {

    private ArrayList<RecursosAprendizaje> lista;

    private final Agente_I agente;

    public GUI_principal(Agente_I agent) {
        super(agent.getLocalName());
        agente = agent;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        css();
    }

    private void css() {
        this.lblError.setText("");
        //padding del textArea
        txtAreaTodos.setBorder(BorderFactory.createCompoundBorder(
                txtAreaTodos.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        txtAreaLectura.setBorder(BorderFactory.createCompoundBorder(
                txtAreaLectura.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        txtAreaVideos.setBorder(BorderFactory.createCompoundBorder(
                txtAreaVideos.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        //padding del input
        txtBusqueda.setBorder(BorderFactory.createCompoundBorder(
                txtBusqueda.getBorder(),
                BorderFactory.createEmptyBorder(0, 10, 0, 10)));

//        Font font = new Font("Verdana", Font.PLAIN, 12);
//        txtAreaTodos.setFont(font);
//        txtAreaLectura.setFont(font);
//        txtAreaVideos.setFont(font);
    }

    private void cargarImg(String link, JLabel etiqueta) {
        ImageIcon fondo = new ImageIcon(getClass().getResource(link));
        ImageIcon Automatico = new ImageIcon(fondo.getImage().getScaledInstance(
                etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT));
        etiqueta.setIcon(Automatico);
    }

    private void buscar() {
        if (txtBusqueda.getText().length() != 0) {
            this.lblError.setText("");
            GuiEvent ge = new GuiEvent(this, 1);
            String txt = txtBusqueda.getText();
            ge.addParameter(txt);
            agente.postGuiEvent(ge);
        } else {
            this.lblError.setText("Ingrese datos a buscar");
        }
    }

    public void establecerLista(ArrayList<RecursosAprendizaje> lista) {
        this.lista = lista;
        presentarResultados();
    }

    public void presentarResultados() {
        this.txtAreaTodos.setText("");
        this.txtAreaLectura.setText("");
        this.txtAreaVideos.setText("");

        lista.forEach((actual) -> {
            this.txtAreaTodos.append(actual.toString());
            if (actual.getCategoria().equals("Lectura")) {
                this.txtAreaLectura.append(actual.toString());
            } else {
                this.txtAreaVideos.append(actual.toString());
            }
        });
    }

    public void sinResultados(String msm) {
        this.txtAreaTodos.setText("");
        this.txtAreaTodos.setText(msm);
        this.txtAreaLectura.setText("");
        this.txtAreaLectura.setText(msm);
        this.txtAreaVideos.setText("");
        this.txtAreaVideos.setText(msm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        containerPanel = new javax.swing.JTabbedPane();
        scrollPanelTodos = new javax.swing.JScrollPane();
        txtAreaTodos = new javax.swing.JTextArea();
        scrollPanelLectura = new javax.swing.JScrollPane();
        txtAreaLectura = new javax.swing.JTextArea();
        scrollPanelVideos = new javax.swing.JScrollPane();
        txtAreaVideos = new javax.swing.JTextArea();
        lblImgFondo = new javax.swing.JLabel();
        lblImgFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("PlainBlack", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 34, 21));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Gestion de Recursos de Aprendizaje");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, 50));

        txtBusqueda.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 143, 247)));
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 680, 40));

        btnBuscar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon.png"))); // NOI18N
        btnBuscar.setBorder(new javax.swing.border.MatteBorder(null));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 50, 40));

        lblError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("Mensaje de texto vacio a buscar");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setForeground(new java.awt.Color(0, 102, 204));
        containerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        containerPanel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        scrollPanelTodos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        txtAreaTodos.setEditable(false);
        txtAreaTodos.setColumns(20);
        txtAreaTodos.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtAreaTodos.setRows(5);
        txtAreaTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPanelTodos.setViewportView(txtAreaTodos);

        containerPanel.addTab("Todos", scrollPanelTodos);

        scrollPanelLectura.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        txtAreaLectura.setEditable(false);
        txtAreaLectura.setColumns(20);
        txtAreaLectura.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtAreaLectura.setRows(5);
        txtAreaLectura.setBorder(null);
        txtAreaLectura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPanelLectura.setViewportView(txtAreaLectura);

        containerPanel.addTab("Lectura", scrollPanelLectura);

        scrollPanelVideos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        txtAreaVideos.setEditable(false);
        txtAreaVideos.setColumns(20);
        txtAreaVideos.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        txtAreaVideos.setRows(5);
        txtAreaVideos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPanelVideos.setViewportView(txtAreaVideos);

        containerPanel.addTab("Videos", scrollPanelVideos);

        getContentPane().add(containerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 770, 300));

        lblImgFondo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblImgFondoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblImgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 850, 320));

        lblImgFondo2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblImgFondo2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblImgFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER) {
            buscar();
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void lblImgFondoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblImgFondoAncestorAdded
        cargarImg("/icon/fondo-blanco.png", lblImgFondo);
    }//GEN-LAST:event_lblImgFondoAncestorAdded

    private void lblImgFondo2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblImgFondo2AncestorAdded
        cargarImg("/icon/fondo2.jpg", lblImgFondo2);
    }//GEN-LAST:event_lblImgFondo2AncestorAdded

    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI_principal().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTabbedPane containerPanel;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblImgFondo;
    private javax.swing.JLabel lblImgFondo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scrollPanelLectura;
    private javax.swing.JScrollPane scrollPanelTodos;
    private javax.swing.JScrollPane scrollPanelVideos;
    private javax.swing.JTextArea txtAreaLectura;
    private javax.swing.JTextArea txtAreaTodos;
    private javax.swing.JTextArea txtAreaVideos;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
