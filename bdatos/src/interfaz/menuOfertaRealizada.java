/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author mlisonct
 */
public class menuOfertaRealizada extends javax.swing.JFrame {
     
    private String cuenta;
    
    public menuOfertaRealizada(String idCuenta) {
        this.cuenta = idCuenta;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
    }

    
    public void mostrar(){
        
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
        main_icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_endsession = new javax.swing.JButton();
        btn_mispublic = new javax.swing.JButton();
        btn_canceloferta = new javax.swing.JButton();
        btn_menuPrinc = new javax.swing.JButton();
        btn_ofertasRec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        img_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        p_init.setBackground(new java.awt.Color(255, 255, 255));
        p_init.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trueque_small.png"))); // NOI18N
        main_icon.setMaximumSize(new java.awt.Dimension(300, 300));
        main_icon.setPreferredSize(new java.awt.Dimension(200, 200));
        p_init.add(main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_small.png"))); // NOI18N
        p_init.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 110));

        btn_endsession.setText("Cerrar Sesión");
        btn_endsession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_endsessionActionPerformed(evt);
            }
        });
        p_init.add(btn_endsession, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 130, 20));

        btn_mispublic.setText("Mis Publicaciones");
        btn_mispublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mispublicActionPerformed(evt);
            }
        });
        p_init.add(btn_mispublic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 160, 20));

        btn_canceloferta.setText("Cancelar Oferta");
        btn_canceloferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelofertaActionPerformed(evt);
            }
        });
        p_init.add(btn_canceloferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 120, 40));

        btn_menuPrinc.setText("Menú Principal");
        btn_menuPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuPrincActionPerformed(evt);
            }
        });
        p_init.add(btn_menuPrinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 130, 20));

        btn_ofertasRec.setText("Ofertas Recibidas");
        btn_ofertasRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertasRecActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertasRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 140, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titular", "Costo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        p_init.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 570, 620));

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
        //SE DEBE ELIMINAR EL USUARIO GLOBAL
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_endsessionActionPerformed

    private void btn_mispublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mispublicActionPerformed
        menuPublicaciones publicaciones = new menuPublicaciones(cuenta);
        publicaciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_mispublicActionPerformed

    private void btn_cancelofertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelofertaActionPerformed
        //SE DEBE CAMBIAR EL ESTADO DE LA OFERTA SELECCIONADA CON EL MOUSE A RECHAZADA-DESHABILITADA
    }//GEN-LAST:event_btn_cancelofertaActionPerformed

    private void btn_menuPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuPrincActionPerformed
        menuPrincipal menuprinc = new menuPrincipal(cuenta);
        menuprinc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_menuPrincActionPerformed

    private void btn_ofertasRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertasRecActionPerformed
        menuOfertaRecibida menuofert = new menuOfertaRecibida(cuenta);
        menuofert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertasRecActionPerformed

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
            java.util.logging.Logger.getLogger(menuOfertaRealizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuOfertaRealizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuOfertaRealizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuOfertaRealizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new menuOfertaRealizada("").setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_canceloferta;
    private javax.swing.JButton btn_endsession;
    private javax.swing.JButton btn_menuPrinc;
    private javax.swing.JButton btn_mispublic;
    private javax.swing.JButton btn_ofertasRec;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel p_init;
    // End of variables declaration//GEN-END:variables
}
