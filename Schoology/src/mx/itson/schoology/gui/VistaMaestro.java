
package mx.itson.schoology.gui;


import javax.swing.table.DefaultTableModel;
import mx.itson.schoology.entidades.Curso;
import mx.itson.schoology.entidades.Usuario;
import mx.itson.schoology.negocio.Metodos;

public class VistaMaestro extends javax.swing.JFrame {
    
DefaultTableModel modeloMiembros;
DefaultTableModel modeloEntregas;

    private Usuario u;
    private Curso c;
    Metodos mt = new Metodos();
    
    public VistaMaestro() {
        initComponents();

    }
    
    public VistaMaestro(Usuario u,Curso c) {
        initComponents();
        modeloMiembros = new DefaultTableModel();
        modeloEntregas = new DefaultTableModel();
        this.u = u;
        this.c = c;
        System.out.println(u.getId());
        System.out.println(u.getNombre());
        
        txtUsuario.setText(u.getNombre() + " "+ u.getApellido());
        
        modeloMiembros.addColumn("Nombre");
        modeloMiembros.addColumn("Apellido");
        modeloMiembros.addColumn("Correo");
        modeloMiembros.addColumn("Telefono");
        
        tblMiembros.setModel(modeloMiembros);

        modeloEntregas.addColumn("Alumno");
        modeloEntregas.addColumn("Actividad");
        modeloEntregas.addColumn("Estado");
        
       tblEntregas.setModel(modeloEntregas);
       
        mt.llenarTablaMiembros(c, modeloMiembros);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblListaActividades = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblAgregarActividad1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMiembros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEntregas = new javax.swing.JTable();
        txtUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/schoology/imagenes/logoschoool.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblListaActividades.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblListaActividades.setForeground(new java.awt.Color(204, 204, 204));
        lblListaActividades.setText("Ver lista de actividades");
        lblListaActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListaActividadesMouseClicked(evt);
            }
        });
        jPanel2.add(lblListaActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 140, 40));

        lblNombreCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCurso.setForeground(new java.awt.Color(204, 204, 204));
        lblNombreCurso.setText("Nombre del curso");
        lblNombreCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreCursoMouseClicked(evt);
            }
        });
        jPanel2.add(lblNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        lblSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(204, 204, 204));
        lblSalir.setText("Salir");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        jPanel2.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 40));

        lblAgregarActividad1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAgregarActividad1.setForeground(new java.awt.Color(204, 204, 204));
        lblAgregarActividad1.setText("Agregar actividad");
        lblAgregarActividad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarActividad1MouseClicked(evt);
            }
        });
        jPanel2.add(lblAgregarActividad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 710, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Miembros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 14))); // NOI18N

        tblMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
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

        tblEntregas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblEntregas);
        if (tblEntregas.getColumnModel().getColumnCount() > 0) {
            tblEntregas.getColumnModel().getColumn(0).setResizable(false);
            tblEntregas.getColumnModel().getColumn(1).setResizable(false);
            tblEntregas.getColumnModel().getColumn(2).setResizable(false);
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 320, 260));

        txtUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setText("USUARIO");
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 310, 53));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("BIENVENIDO/A");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblListaActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListaActividadesMouseClicked

    }//GEN-LAST:event_lblListaActividadesMouseClicked

    private void lblNombreCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreCursoMouseClicked

    }//GEN-LAST:event_lblNombreCursoMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblAgregarActividad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarActividad1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAgregarActividad1MouseClicked

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
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgregarActividad1;
    private javax.swing.JLabel lblListaActividades;
    public javax.swing.JLabel lblNombreCurso;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTable tblEntregas;
    private javax.swing.JTable tblMiembros;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
