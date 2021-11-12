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
import main.Cuenta;

/**
 *
 * @author mlisonct
 */
public class altaPublicacion extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    private String cuenta;
    
    String categoria;
    SentenciaSQL sql = new SentenciaSQL();
    
    public altaPublicacion(String count) {
        
        this.cuenta = count;
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
        
        
        System.out.println(cuenta);
        
        combo_categoria.setModel(sql.obtenerCategorias());
        
        combo_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria = combo_categoria.getSelectedItem().toString();
            }
        });
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
        jLabel3 = new javax.swing.JLabel();
        txt_imagen = new javax.swing.JPasswordField();
        txt_titular = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_ucucoin = new javax.swing.JTextField();
        btn_publicar = new javax.swing.JButton();
        btn_foto = new javax.swing.JButton();
        main_icon = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        img_background = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_valorpeso = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        label_user = new javax.swing.JLabel();
        combo_categoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_descrip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        p_init.setBackground(new java.awt.Color(255, 255, 255));
        p_init.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Categoría");
        p_init.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, -1));
        p_init.add(txt_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 230, 30));
        p_init.add(txt_titular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 230, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Descripción");
        p_init.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 30));

        txt_ucucoin.setEditable(false);
        txt_ucucoin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_ucucoin.setToolTipText("");
        txt_ucucoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ucucoinActionPerformed(evt);
            }
        });
        p_init.add(txt_ucucoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 230, 30));

        btn_publicar.setText("Publicar");
        btn_publicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_publicarActionPerformed(evt);
            }
        });
        p_init.add(btn_publicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, 110, 40));

        btn_foto.setText("Cargar Foto");
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });
        p_init.add(btn_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, 30));

        main_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trueque2.png"))); // NOI18N
        main_icon.setMaximumSize(new java.awt.Dimension(300, 300));
        main_icon.setPreferredSize(new java.awt.Dimension(200, 200));
        p_init.add(main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 280, 330));

        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        p_init.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 750, 120, 40));

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

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Valor $");
        p_init.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Titular");
        p_init.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_small.png"))); // NOI18N
        p_init.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 100));

        txt_valorpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorpesoActionPerformed(evt);
            }
        });
        p_init.add(txt_valorpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 230, 30));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        p_init.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 750, 120, 40));

        label_user.setText("Nombre_Usuario");
        p_init.add(label_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        combo_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_categoriaActionPerformed(evt);
            }
        });
        p_init.add(combo_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 230, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("UcuCoins");
        p_init.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        txt_descrip.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_descrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_descripMouseClicked(evt);
            }
        });
        txt_descrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripActionPerformed(evt);
            }
        });
        p_init.add(txt_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 230, 120));

        getContentPane().add(p_init);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        menuPrincipal menuPrincipal = new menuPrincipal(cuenta);
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_titular.setText("");
        txt_descrip.setText("");
        txt_valorpeso.setText("");
        txt_ucucoin.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_descripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripActionPerformed

    private void txt_descripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_descripMouseClicked
        int coin = 40;
        int convert = Integer.parseInt(txt_valorpeso.getText())/coin;
        txt_ucucoin.setText(String.valueOf(convert));
    }//GEN-LAST:event_txt_descripMouseClicked

    private void txt_valorpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorpesoActionPerformed

    private void txt_ucucoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ucucoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ucucoinActionPerformed

    private void combo_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_categoriaActionPerformed

    private void btn_publicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_publicarActionPerformed
        String titulo = txt_titular.getText();
        //String categoria = combo_categoria.getName();
        String costo = txt_valorpeso.getText();
        String ucuCoin = txt_ucucoin.getText();
        String descripcion = txt_descrip.getText();
        String imagen = txt_imagen.getSelectedText();
        
        System.out.print(costo);
        

        if(titulo.isBlank() || costo.isBlank() || ucuCoin.isBlank() || descripcion.isBlank()){
            JOptionPane.showMessageDialog(rootPane, "Faltan datos por ingresar","Error!", JOptionPane.ERROR_MESSAGE);
        }
        else{
           SentenciaSQL sql = new SentenciaSQL();
           Producto aux = new Producto();
           System.out.println(sql.obtenerIdCategoria(categoria));
           
           aux.setTitulo(titulo);
           aux.setIdCategoria(Integer.parseInt(sql.obtenerIdCategoria(categoria)));
           aux.setCosto(Integer.parseInt(costo));
           aux.setDescripcion(descripcion);
           aux.setImagen(imagen);
           
           if(sql.insertPublicacion(aux, cuenta)){
               JOptionPane.showMessageDialog(null, "Actualización de datos correcta!");
           }else{
               JOptionPane.showMessageDialog(null, "Hubo un fallo en la actualización, verifique");
               
           }
            //Registro realizado -> Pantalla Login
            login login = new login();
            login.setVisible(true);
            
            this.dispose();
        }
    }//GEN-LAST:event_btn_publicarActionPerformed

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
            java.util.logging.Logger.getLogger(altaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_publicar;
    private javax.swing.JComboBox<String> combo_categoria;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_user;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel p_init;
    private javax.swing.JTextField txt_descrip;
    private javax.swing.JPasswordField txt_imagen;
    private javax.swing.JTextField txt_titular;
    private javax.swing.JTextField txt_ucucoin;
    private javax.swing.JTextField txt_valorpeso;
    // End of variables declaration//GEN-END:variables
}
