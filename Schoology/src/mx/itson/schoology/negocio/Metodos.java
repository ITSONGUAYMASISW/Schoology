
package mx.itson.schoology.negocio;

import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import mx.itson.schoology.entidades.Actividad;
import mx.itson.schoology.entidades.Calificacion;
import mx.itson.schoology.entidades.Curso;
import mx.itson.schoology.entidades.CursoUsuario;
import mx.itson.schoology.entidades.Entrega;
import mx.itson.schoology.entidades.Usuario;
import mx.itson.schoology.enumeradores.Estado;
import mx.itson.schoology.enumeradores.Evaluacion;
import mx.itson.schoology.enumeradores.Nota;
import mx.itson.schoology.gui.VistaAlumno;
import mx.itson.schoology.gui.PantallaPrincipal;
import mx.itson.schoology.gui.VistaMaestro;

/**
 * Esta clase se encuentran todos los metodos utilizados para darle
 * funcionamiento al proyecto.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
public class Metodos {
    
    public void Trancision(JFrame actual, JFrame destino){
        actual.setVisible(false);
        destino.setVisible(true);
        destino.setLocationRelativeTo(null);
        destino.setUndecorated(true);
    }
    
    public boolean RegistrarUsuario(String name, String lname, String email, String pass,String tel){
        Usuario u = new Usuario();
        u.setNombre(name);
        u.setApellido(lname);
        u.setCorreo(email);
        u.setContrasena(pass);
        u.setTelefono(tel);
        
        return u.guardar(u);
    }
    
    public boolean CrearCurso(String name, Usuario usuario){
        Curso curso = new Curso();
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        curso.setNombre(name);
        curso.setCodigo(GenerarCodigo());
        curso.setAdministrador(usuario);
        
        return curso.guardar(curso);
    }
    
    public boolean CrearActividad(String nombre, String descripcion,Date vencimiento, Curso curso, String evaluacion){
        Actividad actividad = new Actividad();
        Date diaPublicacion = new Date();
        Evaluacion e = null;
        actividad.setNombre(nombre);
        actividad.setDescripcion(descripcion);
        actividad.setPublicacion(diaPublicacion);
        actividad.setVencimiento(vencimiento);
        actividad.setCurso(curso);
        if (e.NUMERICA.toString().equals(evaluacion)) {
            actividad.setEvaluacion(e.NUMERICA);
        }else if(e.POR_ENTREGA.toString().equals(evaluacion)){
            actividad.setEvaluacion(e.POR_ENTREGA);
        }
        return  actividad.guardar(actividad);
    }
             
               
    
    public boolean RealizarEntrega(String archivoAdjunto, String descripcion, Usuario estudiante, Actividad actividad){
        Entrega entrega = new Entrega();
        Date fechaEntrega = new Date();
        Estado estado = null;
        entrega.setArchivoAdjunto(archivoAdjunto);
        entrega.setDescripcion(descripcion);
        entrega.setFecha(fechaEntrega);
        entrega.setEstudiante(estudiante);
        entrega.setActividad(actividad);
        
        
                    GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(entrega.getFecha());
            
            
            GregorianCalendar gc1 = new GregorianCalendar();
            gc1.setTime(actividad.getVencimiento());
            
        if (gc.get(Calendar.DAY_OF_YEAR)>gc1.get(Calendar.DAY_OF_YEAR)) {
            
                  entrega.setEstado(estado.TARDE);
        }else{
                  entrega.setEstado(estado.A_TIEMPO);
        }
        entrega.getEstado();
        return entrega.guardar(entrega);
    }
    
    public boolean Calificar(Actividad actividad, Usuario estudiante, String nota, Entrega entrega){
        Calificacion calificacion = new Calificacion();
        Estado estado = null;
        Nota n = null;
        calificacion.setActividad(actividad);
        calificacion.setEstudiante(estudiante);
                
            if (nota.equals(n.CERO.toString())) {
                calificacion.setNota(n.CERO);
            }else if(nota.equals(n.UNO.toString())){
                calificacion.setNota(n.UNO);
            }else if(nota.equals(n.DOS.toString())){
                calificacion.setNota(n.DOS);
            }else if(nota.equals(n.TRES.toString())){
                calificacion.setNota(n.TRES);
            }else if(nota.equals(n.CUATRO.toString())){
                calificacion.setNota(n.CUATRO);
            }else if(nota.equals(n.CINCO.toString())){
                calificacion.setNota(n.CINCO);
            }else if(nota.equals(n.SEIS.toString())){
                calificacion.setNota(n.SEIS);
            }else if(nota.equals(n.SIETE.toString())){
                calificacion.setNota(n.SIETE);
            }else if(nota.equals(n.OCHO.toString())){
                calificacion.setNota(n.OCHO);
            }else if(nota.equals(n.NUEVE.toString())){
                calificacion.setNota(n.NUEVE);
            }else if(nota.equals(n.DIEZ.toString())){
                calificacion.setNota(n.DIEZ);
            }
        
        
        return calificacion.guardar(calificacion);
    }
    
    public boolean IniciarSesion(JTextField usuario, JPasswordField contrasena){
        Usuario u = new Usuario();
        List<Usuario> usuarios = u.obtenerTodos();
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(usuario.getText()) &&
                usuarios.get(i).getContrasena().equals(contrasena.getText())) {
                Usuario u2 = new Usuario();
                u2.setId(usuarios.get(i).getId());
                u2.setNombre(usuarios.get(i).getNombre());
                u2.setApellido(usuarios.get(i).getApellido());
                u2.setTelefono(usuarios.get(i).getTelefono());
                u2.setCorreo(usuarios.get(i).getCorreo());
                u2.setContrasena(usuarios.get(i).getContrasena());
                
                PantallaPrincipal ii = new PantallaPrincipal(u2);
                ii.setVisible(true);
                return true;
            }            
        }
        return false;
    }
    
    public String GenerarCodigo(){
        
        String codigo="";
        for (int i = 0; i <= 8; i++) {
            
            if (i==4) {
                codigo += "-";
            }else{
               Integer eleccion =((int)Math.floor(Math.random()*10)); 
               codigo += eleccion.toString();

            }

        }
        return codigo;
    }
    
    public boolean AgregarMiembro(String codigo, Usuario usuario){
        
        Curso c = new Curso();
        CursoUsuario cu = new CursoUsuario();
        List <Curso> cursos = c.obtenerTodos();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equals(codigo)) {
                cu.setCurso(cursos.get(i));
                cu.setUsuario(usuario);
                return cu.guardar(cu);
                
            }
        }
        return false;
    }

      public void crearAdministrados(JPanel panel, Usuario u){
        
        Curso c = new Curso();
        List<Curso> cursos = c.obtenerTodos();
        
        for (int i = 0; i < cursos.size(); i++) {
            
            if (cursos.get(i).getAdministrador().getId() == u.getId()) {
        
            JButton boton = new JButton();
            String nombre = cursos.get(i).getNombre();
             boton.setText(nombre);
             String nombreas = cursos.get(i).getNombre();
             Curso cm = cursos.get(i);
            boton.addActionListener((ActionEvent e) -> {
            
            VistaMaestro vm = new VistaMaestro(u,cm);
            vm.setVisible(true);
            
            vm.lblNombreCurso.setText(nombreas);
               
                
            });
            panel.add(boton);
            panel.updateUI();
       
                
            }
            
        }
        
    }
      
      public void crearInscritos(JPanel panel, Usuario u){
        
        CursoUsuario cu = new CursoUsuario();
        List<CursoUsuario> inscritos = cu.obtenerTodos();
        Curso c = new Curso();
        List<Curso> cursos = c.obtenerTodos();
        
        for (int i = 0; i < inscritos.size(); i++) {
            
            if (inscritos.get(i).getUsuario().getId() == u.getId()) {
                
            JButton boton = new JButton();
            String nombre = inscritos.get(i).getCurso().getNombre();
             boton.setText(nombre);
             Curso cr = inscritos.get(i).getCurso();
            boton.addActionListener((ActionEvent e) -> {
                
               VistaAlumno ca = new VistaAlumno(u,cr);
               ca.setVisible(true);
                
            });
            panel.add(boton);
            panel.updateUI();
       
                
            }
            
        }
        
    }

      public void llenarTablaMiembros(Curso c, DefaultTableModel modelo){
          CursoUsuario cu = new CursoUsuario();
          List<CursoUsuario> miembros = cu.obtenerTodos();
          String [] datos = new String[4];
          for (int i = 0; i < miembros.size(); i++) {
              
              if (miembros.get(i).getCurso().getId()==c.getId()) {
                  
                   datos[0] = miembros.get(i).getUsuario().getNombre();
                   datos[1] = miembros.get(i).getUsuario().getApellido();
                   datos[2] = miembros.get(i).getUsuario().getCorreo();
                   datos[3] = miembros.get(i).getUsuario().getTelefono();
                  
                   modelo.addRow(datos);
                  
              }
              
          }
      }
      
      public void llenarTablaEntregas(Curso c, DefaultTableModel modelo){
          
          Entrega e = new Entrega();
          List<Entrega> entregas = e.obtenerTodos();
          String [] datos = new String[3];

          for (int i = 0; i < entregas.size(); i++) {
              
              if (entregas.get(i).getActividad().getCurso().getId()==c.getId()) {
                  
                   datos[0] = entregas.get(i).getEstudiante().getNombre();
                   datos[1] = entregas.get(i).getActividad().getNombre();
                   datos[2] = entregas.get(i).getEstado().toString();
                  modelo.addRow(datos);
              }
              
          }
          
          
          
      }
      
      
}