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
        txtAreaLectura.setBorder(BorderFactory.createCompoundBorder(
                txtAreaLectura.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        txtAreaVideo.setBorder(BorderFactory.createCompoundBorder(
                txtAreaVideo.getBorder(),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        //padding del input
        txtBusqueda.setBorder(BorderFactory.createCompoundBorder(
                txtBusqueda.getBorder(),
                BorderFactory.createEmptyBorder(0, 10, 0, 10)));

        Font font = new Font("Verdana", Font.PLAIN, 12);
        txtAreaLectura.setFont(font);
        txtAreaVideo.setFont(font);
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
      //  this.txtAreaResultados.setText("");
        this.txtAreaLectura.setText("");
        lista.forEach((actual) -> {
           // this.txtAreaResultados.append(actual.toString());
            this.txtAreaLectura.append(actual.toString());
        });
    }
    
    public void presentarResultadosVideo(ArrayList<RecursosAprendizaje> lista) {
      //  this.txtAreaResultados.setText("");
        this.txtAreaVideo.setText("");
        lista.forEach((actual) -> {
           // this.txtAreaResultados.append(actual.toString());
            this.txtAreaVideo.append(actual.toString());
        });
    }

    public void sinResultados(String msm) {
        this.txtAreaLectura.setText("");
        this.txtAreaLectura.setText(msm);
        this.txtAreaVideo.setText("");
        this.txtAreaVideo.setText(msm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaLectura = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaVideo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("PlainBlack", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Multiagente de Gestion de Recursos de Aprendizaje");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        txtBusqueda.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 660, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 50, 40));

        lblError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("Mensaje de texto vacio a buscar");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 204));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtAreaLectura.setColumns(20);
        txtAreaLectura.setRows(5);
        txtAreaLectura.setBorder(null);
        jScrollPane2.setViewportView(txtAreaLectura);

        jTabbedPane1.addTab("Lectura", jScrollPane2);

        txtAreaVideo.setColumns(20);
        txtAreaVideo.setRows(5);
        jScrollPane3.setViewportView(txtAreaVideo);

        jTabbedPane1.addTab("Video", jScrollPane3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 770, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextArea txtAreaLectura;
    private javax.swing.JTextArea txtAreaVideo;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
