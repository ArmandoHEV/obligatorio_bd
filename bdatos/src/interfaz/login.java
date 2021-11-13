/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import main.*;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mlisonct
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    
    private String userCi;
    
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_init = new javax.swing.JPanel();
        txt_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btn_init = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        btn_init1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        p_init.setBackground(new java.awt.Color(255, 255, 255));
        p_init.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setText("Ingrese su contraseña");
        txt_password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passwordMouseClicked(evt);
            }
        });
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        p_init.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 230, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Contraseña");
        p_init.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 30));

        btn_init.setText("Registrarse");
        btn_init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_initActionPerformed(evt);
            }
        });
        p_init.add(btn_init, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 750, 110, 40));

        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        p_init.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 760, 120, 40));

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Usuario");
        p_init.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, -1));

        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setText("Ingrese su documento de identidad");
        txt_usuario.setToolTipText("");
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_usuarioMouseClicked(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        p_init.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 230, 30));

        btn_init1.setText("Login");
        btn_init1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_init1ActionPerformed(evt);
            }
        });
        p_init.add(btn_init1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 110, 40));

        jLabel2.setText("En caso de no contar con una cuenta, favor de registrarse");
        p_init.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, -1, -1));

        getContentPane().add(p_init);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_initActionPerformed
        registroUsuario nuevacuenta = new registroUsuario();
        nuevacuenta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_initActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
        //if(jTextField2.is)
        //txt_usuario.setText("");
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMouseClicked
        txt_usuario.setText("");
    }//GEN-LAST:event_txt_usuarioMouseClicked

    private void txt_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMouseClicked
        txt_password.setText("");
    }//GEN-LAST:event_txt_passwordMouseClicked
    
    public String getUserCi(){
        return userCi;
    }
    
    private void btn_init1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_init1ActionPerformed
        
        SentenciaSQL sql = new SentenciaSQL();
        String nombre = txt_usuario.getText();
        String pass = txt_password.getText();
        if(!nombre.equals(" ") || nombre != null){
           if(!pass.equals(" ") || pass != null){
               if(sql.inicioSesion(nombre,pass)){
                    userCi = nombre;
                    menuPrincipal inicio = new menuPrincipal(nombre);
                    inicio.setVisible(true);
                    
                    this.dispose();          
               }else{
                    JOptionPane.showMessageDialog(null, "Usuario no válido");
                } 
           } else {
               JOptionPane.showMessageDialog(null, "Ingrese una contraseña");
           }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
        } 
     
     
    }//GEN-LAST:event_btn_init1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_init;
    private javax.swing.JButton btn_init1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel p_init;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
