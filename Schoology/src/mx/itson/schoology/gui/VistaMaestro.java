
package mx.itson.schoology.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.schoology.entidades.Curso;
import mx.itson.schoology.entidades.Usuario;

public class VistaMaestro extends javax.swing.JFrame {
DefaultTableModel modeloMiembros = new DefaultTableModel();
DefaultTableModel modeloTareasEntregadas = new DefaultTableModel();

    public VistaMaestro() {
        initComponents();
        String titulosTablaMiembros[] = {"Nombre", "Apellido", "Correo", "Teléfono"};
        modeloMiembros = new DefaultTableModel(null, titulosTablaMiembros);
        tblMiembros.setModel(modeloMiembros);
        
        String titulosTablaTareasEntregadas[] = {"Alumno", "Tarea", "Estado"}; 
        modeloTareasEntregadas = new DefaultTableModel(null, titulosTablaTareasEntregadas);
        tblTareasEntregadas.setModel(modeloMiembros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAgregarActividad = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMiembros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTareasEntregadas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/schoology/imagenes/logoschoool.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarActividad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAgregarActividad.setForeground(new java.awt.Color(204, 204, 204));
        lblAgregarActividad.setText("Agregar actividad");
        lblAgregarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarActividadMouseClicked(evt);
            }
        });
        jPanel2.add(lblAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 100, 40));

        lblNombreCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCurso.setForeground(new java.awt.Color(204, 204, 204));
        lblNombreCurso.setText("Nombre del curso");
        lblNombreCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreCursoMouseClicked(evt);
            }
        });
        jPanel2.add(lblNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        lblCerrarSesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(204, 204, 204));
        lblCerrarSesion.setText("Salir");
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });
        jPanel2.add(lblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 710, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Miembros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 14))); // NOI18N

        tblMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMiembros);
        if (tblMiembros.getColumnModel().getColumnCount() > 0) {
            tblMiembros.getColumnModel().getColumn(0).setResizable(false);
            tblMiembros.getColumnModel().getColumn(1).setResizable(false);
            tblMiembros.getColumnModel().getColumn(2).setResizable(false);
            tblMiembros.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 320, 260));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tareas Entregadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 14))); // NOI18N

        tblTareasEntregadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Alumno", "Tarea", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTareasEntregadas);
        if (tblTareasEntregadas.getColumnModel().getColumnCount() > 0) {
            tblTareasEntregadas.getColumnModel().getColumn(0).setResizable(false);
            tblTareasEntregadas.getColumnModel().getColumn(1).setResizable(false);
            tblTareasEntregadas.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarActividadMouseClicked

    }//GEN-LAST:event_lblAgregarActividadMouseClicked

    private void lblNombreCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreCursoMouseClicked

    }//GEN-LAST:event_lblNombreCursoMouseClicked

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        LogIn li = new LogIn();
        li.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(VistaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMaestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgregarActividad;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JTable tblMiembros;
    private javax.swing.JTable tblTareasEntregadas;
    // End of variables declaration//GEN-END:variables
}
