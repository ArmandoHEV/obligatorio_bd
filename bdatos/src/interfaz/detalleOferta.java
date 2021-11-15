/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import main.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ListSelectionModel;

//Estados Publicacion 0=publicada 1=trueque
//Estados Oferta 0=realizada , 1=aceptada  2=rechazada
/**
 *
 * @author mlisonct
 */
public class detalleOferta extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    private String cuenta;
    private ArrayList<Publicacion> publicaciones;
    private Oferta oferta;
    private int seleccion;
    
    public detalleOferta(String idCuenta,Oferta ofer ) {
        this.cuenta = idCuenta;
        oferta = ofer;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
        
        SentenciaSQL sql = new SentenciaSQL();
               
        
        publicaciones = sql.ofertasDeUnaPublicacion(oferta.getIdOferta());
        
        

        mostrarEnTabla(publicaciones);
    }
    
    public void mostrarEnTabla(ArrayList<Publicacion> publicaciones){
        
        Object data2[][] = new Object[99][3];
        for(int i = 0; i < publicaciones.size() ; i++){
            for(int j = 0; j < 3; j++) {
                // read information from somewhere
                switch(j){
                    case 0:
                        data2[i][j] = publicaciones.get(i).getProducto().getTitulo();
                        break;
                    case 1:
                        data2[i][j] = publicaciones.get(i).getProducto().getCategoria().getDcategoria();
                        break;
                    case 2:
                        data2[i][j] = publicaciones.get(i).getProducto().getCosto();
                        break;
                }
            }
        }
                
        table_publicaciones.setModel(new javax.swing.table.DefaultTableModel(
            data2,
            new String [] {
                "Titular", "Tipo", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        lbl_foto = new javax.swing.JLabel();
        main_icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_endsession = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btn_misPublic = new javax.swing.JButton();
        btn_ofertaReal = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_rechazar = new javax.swing.JButton();
        btn_ofertaRec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_publicaciones = new javax.swing.JTable();
        img_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        p_init.setBackground(new java.awt.Color(255, 255, 255));
        p_init.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_foto.setText("text");
        p_init.add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 250, 230));

        main_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trueque_small.png"))); // NOI18N
        main_icon.setMaximumSize(new java.awt.Dimension(300, 300));
        main_icon.setPreferredSize(new java.awt.Dimension(200, 200));
        p_init.add(main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_small.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        p_init.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 110));

        btn_endsession.setText("Cerrar Sesión");
        btn_endsession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_endsessionActionPerformed(evt);
            }
        });
        p_init.add(btn_endsession, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 130, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        p_init.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 290, 120));

        btn_misPublic.setText("Mis Publicaciones");
        btn_misPublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_misPublicActionPerformed(evt);
            }
        });
        p_init.add(btn_misPublic, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 150, 20));

        btn_ofertaReal.setText("Ofertas Realizadas");
        btn_ofertaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertaRealActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 160, 20));

        btn_aceptar.setText("Aceptar Oferta");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        p_init.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 120, 40));

        btn_rechazar.setText("Rechazar Oferta");
        btn_rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechazarActionPerformed(evt);
            }
        });
        p_init.add(btn_rechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, 120, 40));

        btn_ofertaRec.setText("Ofertas Recibidas");
        btn_ofertaRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertaRecActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertaRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 160, 20));

        table_publicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titular", "Tipo", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_publicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_publicacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_publicaciones);

        p_init.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 540, 370));

        img_background.setForeground(new java.awt.Color(255, 255, 255));
        img_background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        img_background.setText("background");
        img_background.setToolTipText("");
        img_background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img_background.setAutoscrolls(true);
        img_background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        img_background.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.add(img_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 820));

        getContentPane().add(p_init);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_endsessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_endsessionActionPerformed
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_endsessionActionPerformed

    private void btn_ofertaRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertaRecActionPerformed
        menuOfertaRecibida ofertaRecibida = new menuOfertaRecibida(cuenta);
        ofertaRecibida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertaRecActionPerformed

    private void btn_ofertaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertaRealActionPerformed
        menuOfertaRealizada ofertaRealizada = new menuOfertaRealizada(cuenta);
        ofertaRealizada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertaRealActionPerformed

    private void btn_misPublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_misPublicActionPerformed
        menuPublicaciones publica = new menuPublicaciones(cuenta);
        publica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_misPublicActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void table_publicacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_publicacionesMouseClicked
        // TODO add your handling code here:
        seleccion = table_publicaciones.rowAtPoint(evt.getPoint());
        jTextField1.setText(publicaciones.get(seleccion).getProducto().getDescripcion());
        //lbl_foto.setIcon(new ImageIcon(publicaciones.get(seleccion).getProducto().getImagen()));
        ImageIcon icon = new ImageIcon("fotoProductos/lampazo.jpg");
        lbl_foto.setIcon(icon);
    }//GEN-LAST:event_table_publicacionesMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        menuCuenta menuc = new menuCuenta(cuenta);
        menuc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        SentenciaSQL sql = new SentenciaSQL();
        sql.aceptarTrueque(cuenta,oferta); //idCuenta , idOferta
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechazarActionPerformed
        SentenciaSQL sql = new SentenciaSQL();
        sql.rechazarOferta(oferta.getIdOferta()); //idOferta
    }//GEN-LAST:event_btn_rechazarActionPerformed

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
            java.util.logging.Logger.getLogger(detalleOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detalleOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detalleOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detalleOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detalleOferta("").setVisible(true);
                
            }

        });*/
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_endsession;
    private javax.swing.JButton btn_misPublic;
    private javax.swing.JButton btn_ofertaReal;
    private javax.swing.JButton btn_ofertaRec;
    private javax.swing.JButton btn_rechazar;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel p_init;
    private javax.swing.JTable table_publicaciones;
    // End of variables declaration//GEN-END:variables
}
