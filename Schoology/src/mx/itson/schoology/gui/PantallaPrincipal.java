/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.schoology.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.schoology.entidades.Curso;
import mx.itson.schoology.entidades.Usuario;
import mx.itson.schoology.negocio.Metodos;

/**
 * JFrame del Inicio.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    Usuario u = new Usuario();
    Metodos m = new Metodos();
    /**
     * Creates new form InicioInterfaz
     */
    public PantallaPrincipal() {
        initComponents();
      
    }
    public PantallaPrincipal(Usuario u) {
        initComponents();
                setLocationRelativeTo(null);

        this.u = u;
        System.out.println(u.getId());
        System.out.println(u.getNombre());
        txtUsuario.setText(u.getNombre() + " "+ u.getApellido());
        m.crearAdministrados(jPanel3, u);
        
        m.crearInscritos(jPanel4, u);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCrearCurso = new javax.swing.JLabel();
        lblIngresarCodigo = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("BIENVENIDO/A");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/schoology/imagenes/logoschoool.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setText("USUARIO");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 317, 53));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCrearCurso.setForeground(new java.awt.Color(204, 204, 204));
        lblCrearCurso.setText("Crear curso");
        lblCrearCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCursoMouseClicked(evt);
            }
        });
        jPanel2.add(lblCrearCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 97, 40));

        lblIngresarCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIngresarCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lblIngresarCodigo.setText("Registrarse en un curso");
        lblIngresarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresarCodigoMouseClicked(evt);
            }
        });
        jPanel2.add(lblIngresarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        lblCerrarSesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(204, 204, 204));
        lblCerrarSesion.setText("Cerrar sesión");
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });
        jPanel2.add(lblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 710, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cursos Administrados"));
        jPanel3.setLayout(new java.awt.GridLayout(5, 1));
        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 360, 360));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cursos Inscritos"));
        jPanel4.setLayout(new java.awt.GridLayout(5, 1));
        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 350, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCrearCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCursoMouseClicked
        String nombreCurso = JOptionPane.showInputDialog(null, "Escriba el nombre del curso");
        Curso curso = new Curso();
        curso.setNombre(nombreCurso);
        curso.setCodigo(m.GenerarCodigo());
        List <Usuario> miembros = new ArrayList<>();
        miembros.add(u);
        curso.setAdministrador(u);
        curso.guardar(curso);
    }//GEN-LAST:event_lblCrearCursoMouseClicked

    private void lblIngresarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarCodigoMouseClicked
        String codigoIngresado = JOptionPane.showInputDialog(null, "Ingrese el código");
        m.AgregarMiembro(codigoIngresado, u);
    }//GEN-LAST:event_lblIngresarCodigoMouseClicked

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        IniciarSesion li = new IniciarSesion();
        li.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblCrearCurso;
    private javax.swing.JLabel lblIngresarCodigo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
