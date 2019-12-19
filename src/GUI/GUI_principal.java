package GUI;

import agentes.Agente_I;
import clases.RecursosAprendizaje;
import jade.gui.GuiEvent;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;

/**
 * @author jh3ys0n
 */
public class GUI_principal extends javax.swing.JFrame {

    private Agente_I agente;

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
        txtAreaResultados.setBorder(BorderFactory.createCompoundBorder(
                txtAreaResultados.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        //padding del input
        txtBusqueda.setBorder(BorderFactory.createCompoundBorder(
                txtBusqueda.getBorder(),
                BorderFactory.createEmptyBorder(0, 10, 0, 10)));

        Font font = new Font("Verdana", Font.PLAIN, 12);
        txtAreaResultados.setFont(font);
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

    public void presentarResultados(ArrayList<RecursosAprendizaje> lista) {
        this.txtAreaResultados.setText("");
        lista.forEach((actual) -> {
            this.txtAreaResultados.append(actual.toString());
        });
    }

    public void sinResultados(String msm) {
        this.txtAreaResultados.setText("");
        this.txtAreaResultados.setText(msm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultados = new javax.swing.JTextArea();
        lblFondoImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("PlainBlack", 0, 35)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Multiagente de Gestion de Recursos de Aprendizaje");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        txtBusqueda.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 660, 40));

        btnBuscar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 100, 40));

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("Mensaje de texto vacio a buscar");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtAreaResultados.setColumns(20);
        txtAreaResultados.setLineWrap(true);
        txtAreaResultados.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 770, 300));
        getContentPane().add(lblFondoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

//    public static void main(String args[]) {
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
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFondoImg;
    private javax.swing.JTextArea txtAreaResultados;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
