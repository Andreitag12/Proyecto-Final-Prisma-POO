/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Andreita
 */
public class FrmLogin extends javax.swing.JFrame {

    /** Creates new form Login */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TfUsuario = new javax.swing.JTextField();
        TfContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        RbtnMostrarContra = new javax.swing.JRadioButton();
        btnRecuperarCuenta = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        setLocation(new java.awt.Point(900, 630));
        setMaximumSize(new java.awt.Dimension(900, 630));
        setMinimumSize(new java.awt.Dimension(900, 630));
        setUndecorated(true);
        setSize(new java.awt.Dimension(900, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 52)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRISMA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 260, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/iconos/prisma-logo-3805665B69-seeklogo.com.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 250, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/iconos/70-709970_fondo-morado-oscuro-hd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 630));

        jPanel1.setBackground(new java.awt.Color(16, 16, 16));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(78, 34, 88));
        jLabel2.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 34, 88));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 40, 20));

        jLabel4.setBackground(new java.awt.Color(78, 34, 88));
        jLabel4.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 34, 88));
        jLabel4.setText("-");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 20, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 34, 88));
        jLabel5.setText("LOGIN_");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, 40));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USERNAME:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        TfUsuario.setBackground(new java.awt.Color(16, 16, 16));
        TfUsuario.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        TfUsuario.setForeground(new java.awt.Color(78, 34, 88));
        TfUsuario.setText("Ingrese Usuario");
        TfUsuario.setBorder(null);
        TfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TfUsuarioMouseClicked(evt);
            }
        });
        TfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 290, 30));

        TfContraseña.setBackground(new java.awt.Color(16, 16, 16));
        TfContraseña.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        TfContraseña.setForeground(new java.awt.Color(78, 34, 88));
        TfContraseña.setText("jPasswordField1");
        TfContraseña.setBorder(null);
        TfContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TfContraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(TfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 290, 30));

        jSeparator1.setBackground(new java.awt.Color(78, 34, 88));
        jSeparator1.setForeground(new java.awt.Color(78, 34, 88));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 280, 10));

        jSeparator2.setBackground(new java.awt.Color(78, 34, 88));
        jSeparator2.setForeground(new java.awt.Color(78, 34, 88));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 280, 10));

        RbtnMostrarContra.setBackground(new java.awt.Color(16, 16, 16));
        RbtnMostrarContra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        RbtnMostrarContra.setForeground(new java.awt.Color(78, 34, 88));
        RbtnMostrarContra.setText("Mostrar Contraseña");
        RbtnMostrarContra.setBorder(null);
        RbtnMostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnMostrarContraActionPerformed(evt);
            }
        });
        jPanel1.add(RbtnMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 170, 30));

        btnRecuperarCuenta.setBackground(new java.awt.Color(16, 16, 16));
        btnRecuperarCuenta.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnRecuperarCuenta.setForeground(new java.awt.Color(78, 34, 88));
        btnRecuperarCuenta.setText("¿Has olvidado tu contraseña?");
        btnRecuperarCuenta.setBorder(null);
        btnRecuperarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecuperarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(78, 34, 88));
        btnIniciarSesion.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 460, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfUsuarioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        String admin = "admin";
        String Password = new String(TfContraseña.getPassword());
        
        if(TfUsuario.getText().equals(admin)&& Password.equals("1234")){
            FrmInicio ini = new FrmInicio();
            ini.setVisible(true);
        this.dispose();
            
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void RbtnMostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnMostrarContraActionPerformed
        // TODO add your handling code here:
        if(RbtnMostrarContra.isSelected()){
             TfContraseña.setEchoChar((char )0);
        }else{
            TfContraseña.setEchoChar('*');
        }
        
    }//GEN-LAST:event_RbtnMostrarContraActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del Login?", "EXIT", dialogButton);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void TfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TfUsuarioMouseClicked
        // TODO add your handling code here:
        TfUsuario.setText("");
    }//GEN-LAST:event_TfUsuarioMouseClicked

    private void TfContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TfContraseñaMouseClicked
        // TODO add your handling code here:
        TfContraseña.setText("");
    }//GEN-LAST:event_TfContraseñaMouseClicked

    private void btnRecuperarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarCuentaActionPerformed
        // TODO add your handling code here:
        FrmRecuperarPW rec = new  FrmRecuperarPW();
        rec.setVisible(true);
    }//GEN-LAST:event_btnRecuperarCuentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnMostrarContra;
    private javax.swing.JPasswordField TfContraseña;
    private javax.swing.JTextField TfUsuario;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRecuperarCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
