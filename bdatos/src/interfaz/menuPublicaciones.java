/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import main.*;

/**
 *
 * @author mlisonct
 */
public class menuPublicaciones extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    private String cuenta;
    private int seleccion;
    ArrayList<Publicacion> publicaciones; 
    
    public menuPublicaciones(String idCuenta) {
        this.cuenta = idCuenta;
        SentenciaSQL sql = new SentenciaSQL();
        publicaciones = sql.obtenerPublicacionesDeCuenta(cuenta);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(897, 816)); 
        this.setResizable(false);
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
        
        //System.out.print(data2);
        //System.out.print(idCuenta);
        
        table_mispublicaciones.setModel(new javax.swing.table.DefaultTableModel(
            data2,
            new String [] {
                "Titular", "Costo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        /*
        table_mispublicaciones.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = table_mispublicaciones.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
              
              int index1 = e.getFirstIndex();
              int index2 = e.getLastIndex();
              
              System.out.println(index1 + " " + index2);
              
            }

        }); 
        */
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_init = new javax.swing.JPanel();
        btn_public = new javax.swing.JButton();
        main_icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_endsession = new javax.swing.JButton();
        btn_ofertaReal = new javax.swing.JButton();
        btn_menuPrinc = new javax.swing.JButton();
        lbl_foto = new javax.swing.JLabel();
        txt_descrip = new javax.swing.JTextField();
        btn_ofertaRec = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_mispublicaciones = new javax.swing.JTable();
        img_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        p_init.setBackground(new java.awt.Color(255, 255, 255));
        p_init.setPreferredSize(new java.awt.Dimension(1000, 1000));
        p_init.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_public.setText("Nueva Publicación");
        btn_public.setToolTipText("");
        btn_public.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_publicActionPerformed(evt);
            }
        });
        p_init.add(btn_public, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 180, 30));

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

        btn_ofertaReal.setText("Ofertas Realizadas");
        btn_ofertaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertaRealActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 150, 20));

        btn_menuPrinc.setText("Menú Principal");
        btn_menuPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuPrincActionPerformed(evt);
            }
        });
        p_init.add(btn_menuPrinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 140, 20));

        lbl_foto.setText("text");
        p_init.add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 250, 230));

        txt_descrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripActionPerformed(evt);
            }
        });
        p_init.add(txt_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 290, 190));

        btn_ofertaRec.setText("Ofertas Recibidas");
        btn_ofertaRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertaRecActionPerformed(evt);
            }
        });
        p_init.add(btn_ofertaRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 160, 20));

        btn_edit.setText("Editar Publicación");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        p_init.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 730, 180, 30));

        table_mispublicaciones.setModel(new javax.swing.table.DefaultTableModel(
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
                "Titular", "Costo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_mispublicaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                table_mispublicacionesFocusGained(evt);
            }
        });
        table_mispublicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_mispublicacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_mispublicaciones);

        p_init.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 490, 620));

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

    private void btn_publicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_publicActionPerformed
        altaPublicacion nuevapublic = new altaPublicacion(cuenta);
        nuevapublic.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_publicActionPerformed

    private void btn_endsessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_endsessionActionPerformed
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_endsessionActionPerformed

    private void btn_ofertaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertaRealActionPerformed
        menuOfertaRealizada menuofertreal = new menuOfertaRealizada(cuenta);
        menuofertreal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertaRealActionPerformed

    private void btn_menuPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuPrincActionPerformed
        menuPrincipal menuprinc = new menuPrincipal(cuenta);
        menuprinc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_menuPrincActionPerformed

    private void btn_ofertaRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertaRecActionPerformed
        menuOfertaRecibida ofertarecibida = new menuOfertaRecibida(cuenta);
        ofertarecibida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertaRecActionPerformed

    private void table_mispublicacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table_mispublicacionesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_table_mispublicacionesFocusGained

    private void txt_descripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripActionPerformed

    private void table_mispublicacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_mispublicacionesMouseClicked
        seleccion = table_mispublicaciones.rowAtPoint(evt.getPoint());
        txt_descrip.setText(publicaciones.get(seleccion).getProducto().getDescripcion());
        lbl_foto.setIcon(new ImageIcon(publicaciones.get(seleccion).getProducto().getImagen()));
    }//GEN-LAST:event_table_mispublicacionesMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        editPublicacion modifPublica = new editPublicacion(cuenta,publicaciones.get(seleccion));
        modifPublica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_editActionPerformed

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
            java.util.logging.Logger.getLogger(menuPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new menuPublicaciones("").setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_endsession;
    private javax.swing.JButton btn_menuPrinc;
    private javax.swing.JButton btn_ofertaReal;
    private javax.swing.JButton btn_ofertaRec;
    private javax.swing.JButton btn_public;
    private javax.swing.JLabel img_background;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel main_icon;
    private javax.swing.JPanel p_init;
    private javax.swing.JTable table_mispublicaciones;
    private javax.swing.JTextField txt_descrip;
    // End of variables declaration//GEN-END:variables
}
