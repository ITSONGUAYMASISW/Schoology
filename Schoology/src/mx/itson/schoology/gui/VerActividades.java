/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.schoology.gui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import mx.itson.schoology.entidades.Actividad;
import mx.itson.schoology.entidades.Curso;

/**
 *
 * @author Francisco
 */
public class VerActividades extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    Curso c;
    Actividad a = new Actividad();
    List<Actividad> actividades = a.obtenerTodos();

    public VerActividades(Curso cu) {
        initComponents();
        this.c=cu;
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de publicacion");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("Metodo de Evaluacion");
        
        tbActividades.setModel(modelo);
        
        String [] datos = new String[5];
        
        for (int i = 0; i < actividades.size(); i++) {
            
            if (c.getId()==actividades.get(i).getCurso().getId()) {
            
            datos[0] = String.valueOf(actividades.get(i).getId());
            datos[1]= actividades.get(i).getNombre();
            datos[2]= actividades.get(i).getPublicacion().toString();
            datos[3]= actividades.get(i).getVencimiento().toString();
            datos[4]= actividades.get(i).getEvaluacion().toString();
            
            modelo.addRow(datos);
            }
            
        }
       
        
    }
    
    public VerActividades(){
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblVerEntregas = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblNombreCurso1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbActividades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVerEntregas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVerEntregas.setForeground(new java.awt.Color(204, 204, 204));
        lblVerEntregas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerEntregas.setText("Ver entregas de actividad");
        lblVerEntregas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerEntregasMouseClicked(evt);
            }
        });
        jPanel2.add(lblVerEntregas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 170, 40));

        lblSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(204, 204, 204));
        lblSalir.setText("Salir");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        jPanel2.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 40));

        lblNombreCurso1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCurso1.setForeground(new java.awt.Color(204, 204, 204));
        lblNombreCurso1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreCurso1MouseClicked(evt);
            }
        });
        jPanel2.add(lblNombreCurso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 170, 40));

        txtUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setText("USUARIO");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("BIENVENIDO/A");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/schoology/imagenes/logoschoool.png"))); // NOI18N

        tbActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbActividades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(9, 9, 9)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVerEntregasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerEntregasMouseClicked
        
    }//GEN-LAST:event_lblVerEntregasMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblNombreCurso1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreCurso1MouseClicked
       
    }//GEN-LAST:event_lblNombreCurso1MouseClicked

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
            java.util.logging.Logger.getLogger(VerActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblNombreCurso1;
    private javax.swing.JLabel lblSalir;
    public javax.swing.JLabel lblVerEntregas;
    private javax.swing.JTable tbActividades;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
