/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import main.ProductoPublicacion;
import main.SentenciaSQL;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ListSelectionModel;
import main.Producto;

/**
 *
 * @author mlisonct
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    public menuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
        
        Object data2[][] = new Object[99][3];
        SentenciaSQL sql = new SentenciaSQL();
        
        jComboBox1.setModel(sql.obtenerCategorias());
        
        ArrayList<ProductoPublicacion> publicaciones = sql.buscarPublicacion();
        
        for(int i = 0; i < publicaciones.size() ; i++){
            for(int j = 0; j < 3; j++) {
                // read information from somewhere
                switch(j){
                    case 0:
                        data2[i][j] = publicaciones.get(i).getTitulo();
                        break;
                    case 1:
                        data2[i][j] = publicaciones.get(i).getDcategoria();
                        break;
                    case 2:
                        data2[i][j] = publicaciones.get(i).getCosto();
                        break;
                    case 3:
                        data2[i][j] = publicaciones.get(i).getImagen();
                        break;
                      
                }
            }
        }
        System.out.print(data2);
        
        table_publicaciones.setModel(new javax.swing.table.DefaultTableModel(
            data2,
            new String [] {
                "Titular", "Tipo", "Costo", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        
        table_publicaciones.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = table_publicaciones.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
              
              int index1 = e.getFirstIndex();
              int index2 = e.getLastIndex();
              
              System.out.println(index1 + " " + index2);
              jTextField1.setText(publicaciones.get(index2).getDproducto());
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
        txt_buscar = new javax.swing.JPasswordField();
        btn_buscar = new javax.swing.JButton();
        btn_ofertar = new javax.swing.JButton();
        main_icon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_endsession = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_misPublic = new javax.swing.JButton();
        btn_ofertaReal = new javax.swing.JButton();
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
        p_init.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 230, 30));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        p_init.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 80, 30));

        btn_ofertar.setText("Ofertar");
        btn_ofertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertarActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 120, 40));

        main_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trueque_small.png"))); // NOI18N
        main_icon.setMaximumSize(new java.awt.Dimension(300, 300));
        main_icon.setPreferredSize(new java.awt.Dimension(200, 200));
        p_init.add(main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 60));

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Categoría");
        p_init.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 119, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_small.png"))); // NOI18N
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
        p_init.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 290, 160));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        p_init.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, 30));

        btn_misPublic.setText("Mis Publicaciones");
        btn_misPublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_misPublicActionPerformed(evt);
            }
        });
        p_init.add(btn_misPublic, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 130, 20));

        btn_ofertaReal.setText("Ofertas Realizadas");
        btn_ofertaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertaRealActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 140, 20));

        btn_ofertaRec.setText("Ofertas Recibidas");
        btn_ofertaRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertaRecActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertaRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 130, 20));

        table_publicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titular", "Tipo", "Costo", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_publicaciones);
        if (table_publicaciones.getColumnModel().getColumnCount() > 0) {
            table_publicaciones.getColumnModel().getColumn(1).setHeaderValue("Tipo");
            table_publicaciones.getColumnModel().getColumn(3).setHeaderValue("Foto");
        }

        p_init.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 540, 620));

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

    private void btn_ofertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertarActionPerformed
        pantallaOferta oferta = new pantallaOferta();
        oferta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btn_endsessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_endsessionActionPerformed
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_endsessionActionPerformed

    private void btn_ofertaRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertaRecActionPerformed
        menuOfertaRecibida ofertaRecibida = new menuOfertaRecibida();
        ofertaRecibida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertaRecActionPerformed

    private void btn_ofertaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertaRealActionPerformed
        menuOfertaRealizada ofertaRealizada = new menuOfertaRealizada();
        ofertaRealizada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertaRealActionPerformed

    private void btn_misPublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_misPublicActionPerformed
        menuPublicaciones publica = new menuPublicaciones();
        publica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_misPublicActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String buscar = txt_buscar.getText();
        if (buscar != null){
            ArrayList<ProductoPublicacion> productos = new ArrayList<>();
            SentenciaSQL sql = new SentenciaSQL();
            productos = sql.filtrarPublicacionesPorTexto(buscar);
            
            //Mostrar Productos
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new menuPrincipal().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_endsession;
    private javax.swing.JButton btn_misPublic;
    private javax.swing.JButton btn_ofertaReal;
    private javax.swing.JButton btn_ofertaRec;
    private javax.swing.JButton btn_ofertar;
    private javax.swing.JLabel img_background;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel p_init;
    private javax.swing.JTable table_publicaciones;
    private javax.swing.JPasswordField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
