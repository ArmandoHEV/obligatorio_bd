/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.*;


/**
 *
 * @author mlisonct
 */
public class menuCuenta extends javax.swing.JFrame {

    private String cuenta;
    
    public menuCuenta(String idCuenta) {
        this.cuenta=idCuenta;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
        
        
        
        SentenciaSQL sql = new SentenciaSQL();
        Cuenta aux = sql.obtenerCuenta(cuenta);
        txt_nombre.setText(aux.getNombre());
        txt_apellido.setText(aux.getApellido());

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
        lbl_apellido = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_nombre = new javax.swing.JTextField();
        btn_init = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        main_icon = new javax.swing.JLabel();
        img_background = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        p_init.setBackground(new java.awt.Color(255, 255, 255));
        p_init.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_apellido.setBackground(new java.awt.Color(0, 153, 255));
        lbl_apellido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_apellido.setText("Apellido");
        p_init.add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));
        p_init.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 230, 30));
        p_init.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 230, 30));

        btn_init.setText("Aceptar");
        btn_init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_initActionPerformed(evt);
            }
        });
        p_init.add(btn_init, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 110, 40));

        btn_exit.setText("Cancelar");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        p_init.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 120, 40));

        main_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trueque2.png"))); // NOI18N
        main_icon.setMaximumSize(new java.awt.Dimension(300, 300));
        main_icon.setPreferredSize(new java.awt.Dimension(200, 200));
        p_init.add(main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 250, 260));

        img_background.setForeground(new java.awt.Color(255, 255, 255));
        img_background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        img_background.setText("background");
        img_background.setToolTipText("");
        img_background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img_background.setAutoscrolls(true);
        img_background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        img_background.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.add(img_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 820));

        lbl_pass.setBackground(new java.awt.Color(255, 255, 255));
        lbl_pass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_pass.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_pass.setText("Contraseña");
        p_init.add(lbl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Nombre");
        p_init.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_small.png"))); // NOI18N
        p_init.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 110));
        p_init.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 230, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Complete los campos que desee modificar");
        jLabel2.setToolTipText("");
        p_init.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        getContentPane().add(p_init);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        menuPrincipal menu = new menuPrincipal(cuenta);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed


    private void btn_initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_initActionPerformed
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String pass = txt_password.getText();

        if(nombre.isBlank() || apellido.isBlank() || pass.isBlank()){
            JOptionPane.showMessageDialog(rootPane, "Faltan datos por ingresar","Error!", JOptionPane.ERROR_MESSAGE);
        }
        else{
           SentenciaSQL sql = new SentenciaSQL();
           Cuenta aux = new Cuenta();
           
           aux.setCi(cuenta);
           aux.setNombre(nombre);
           aux.setApellido(apellido);
           aux.setPassword(pass);
           
           if(sql.actualizarCuenta(aux)){
               JOptionPane.showMessageDialog(null, "Actualización de datos correcta!");
           }else{
               JOptionPane.showMessageDialog(null, "Hubo un fallo en la actualización, verifique");
               
           }
            //Registro realizado -> Pantalla Login
            login login = new login();
            login.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btn_initActionPerformed

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
            java.util.logging.Logger.getLogger(menuCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new menuCuenta("").setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_init;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel p_init;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
