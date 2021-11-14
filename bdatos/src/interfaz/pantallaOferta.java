/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.*;
/**
 *
 * @author mlisonct
 */
public class pantallaOferta extends javax.swing.JFrame {

    private Publicacion publicacion;
    private String cuenta;
    ArrayList<Publicacion> publicaciones; 
    
    public pantallaOferta(Publicacion publicacion, String cuenta) {
        this.publicacion = publicacion;
        this.cuenta = cuenta;
        
        SentenciaSQL sql = new SentenciaSQL();
        publicaciones = sql.obtenerPublicacionesDeCuenta(cuenta);
        
        initComponents();
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        mostrarEnTabla(publicaciones);
    }
    
    public void mostrarEnTabla(ArrayList<Publicacion> publicaciones){
       Object data2[][] = new Object[99][4];
        for(int i = 0; i < publicaciones.size() ; i++){
            for(int j = 0; j < 4; j++) {
                // read information from somewhere
                switch(j){
                    case 0:
                        data2[i][j] = publicaciones.get(i).getProducto().getTitulo();
                        break;
                    case 1:
                        data2[i][j] = publicaciones.get(i).getProducto().getCosto();
                        break;
                    case 2:
                        data2[i][j] = publicaciones.get(i).getEstadoPublicacion();
                        break;
                    case 3:
                        data2[i][j] = publicaciones.get(i).getProducto().getImagen();
                        break;
                      
                }
            }
        }
         
        table_publicaciones.setModel(new javax.swing.table.DefaultTableModel(
            data2,
            new String [] {
                "Titular", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_quitar = new javax.swing.JButton();
        main_icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        lbl_publicacion = new javax.swing.JLabel();
        btn_ofertar = new javax.swing.JButton();
        txt_coin = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_pOfertar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_publicaciones = new javax.swing.JTable();
        img_background = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        txt_moneda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        p_init.setBackground(new java.awt.Color(255, 255, 255));
        p_init.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Publicacion seleccionada");
        p_init.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 230, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Seleccione las publicaciones a ofertar ");
        p_init.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 350, 30));

        btn_agregar.setText("Agregar");
        p_init.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 110, 40));

        btn_quitar.setText("Quitar");
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });
        p_init.add(btn_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 120, 40));

        main_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trueque.png"))); // NOI18N
        main_icon.setMaximumSize(new java.awt.Dimension(300, 300));
        main_icon.setPreferredSize(new java.awt.Dimension(200, 200));
        p_init.add(main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 160, 160));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("UCUcoins disponibles:");
        p_init.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        btn_exit.setText("Salir");
        btn_exit.setActionCommand("");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        p_init.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 770, 80, 30));
        p_init.add(lbl_publicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        btn_ofertar.setText("Ofertar");
        btn_ofertar.setActionCommand("");
        btn_ofertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertarActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, 110, 40));

        txt_coin.setEditable(false);
        txt_coin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_coin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_coinActionPerformed(evt);
            }
        });
        p_init.add(txt_coin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 80, 30));

        table_pOfertar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titular", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pOfertar.setColumnSelectionAllowed(true);
        table_pOfertar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                table_pOfertarFocusGained(evt);
            }
        });
        table_pOfertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pOfertarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_pOfertar);
        table_pOfertar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        p_init.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 350, 110));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Mis publicaciones");
        p_init.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        table_publicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titular", "Costo"
            }
        ));
        table_publicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_publicacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_publicaciones);

        p_init.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 390, 190));

        img_background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        img_background.setText("background");
        img_background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img_background.setAutoscrolls(true);
        img_background.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.add(img_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 820));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Costo Productos");
        p_init.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        p_init.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 60, 30));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Desea agregar UCUcoins?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        p_init.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        txt_moneda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_moneda.setText("Ingrese UCUcoins");
        p_init.add(txt_moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_small.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        p_init.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 110));

        getContentPane().add(p_init);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        //BORRAR PRODUCTO DE LA TABLA SECUNDARIA TEMPORAL
    }//GEN-LAST:event_btn_quitarActionPerformed

    private void btn_ofertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertarActionPerformed
        SentenciaSQL sql = new SentenciaSQL();
        ArrayList<Integer> listaOfertas = new ArrayList<>();
        int coins = Integer.parseInt(txt_moneda.getText());
        if(sql.obtenerUCUCoins(cuenta) >= coins){ //idcuenta,ucucoins ofertadas
            sql.realizarOferta(listaOfertas,"48453889",1,coins); //ofertas,idcuenta,idpublicacion,ucucoins
            menuPrincipal menuPrincipal = new menuPrincipal("48453889");
            menuPrincipal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente","Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ofertarActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        menuPrincipal menuPrincipal = new menuPrincipal(cuenta);
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()){
            txt_coin.isEditable();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void table_pOfertarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table_pOfertarFocusGained
        txt_coin.setText("focus!");
    }//GEN-LAST:event_table_pOfertarFocusGained

    private void table_pOfertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pOfertarMouseClicked
        txt_coin.setText("click!");
    }//GEN-LAST:event_table_pOfertarMouseClicked

    private void table_publicacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_publicacionesMouseClicked
        int seleccion = table_publicaciones.getSelectedRow();
  
        table_pOfertar.setValueAt(table_publicaciones.getValueAt(seleccion, 0), 0, 0);
        table_pOfertar.setValueAt(table_publicaciones.getValueAt(seleccion, 1), 0, 1);
        
    table_pOfertar.addRowSelectionInterval(0, 1);
    
              
    }//GEN-LAST:event_table_publicacionesMouseClicked

    private void txt_coinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_coinActionPerformed
        SentenciaSQL sql = new SentenciaSQL();
        int ucucoins = sql.obtenerUCUCoins(cuenta);
        txt_coin.setText(ucucoins+"");
    }//GEN-LAST:event_txt_coinActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        menuCuenta menuc = new menuCuenta(cuenta);
        menuc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(pantallaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_ofertar;
    private javax.swing.JButton btn_quitar;
    private javax.swing.JLabel img_background;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_publicacion;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel p_init;
    private javax.swing.JTable table_pOfertar;
    private javax.swing.JTable table_publicaciones;
    private javax.swing.JTextField txt_coin;
    private javax.swing.JTextField txt_moneda;
    // End of variables declaration//GEN-END:variables
}
