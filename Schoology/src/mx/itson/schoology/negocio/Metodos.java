
package mx.itson.schoology.negocio;

import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import mx.itson.schoology.entidades.Actividad;
import mx.itson.schoology.entidades.Calificacion;
import mx.itson.schoology.entidades.Curso;
import mx.itson.schoology.entidades.CursoUsuario;
import mx.itson.schoology.entidades.Entrega;
import mx.itson.schoology.entidades.Usuario;
import mx.itson.schoology.enumeradores.Estado;
import mx.itson.schoology.enumeradores.Evaluacion;
import mx.itson.schoology.enumeradores.Nota;
import mx.itson.schoology.gui.InicioInterfaz;

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
    
    public boolean CrearActividad(String nombre, String descripcion, Date vencimiento, Curso curso, Evaluacion evaluacion){
        Actividad actividad = new Actividad();
        Date diaPublicacion = new Date();
        actividad.setNombre(nombre);
        actividad.setDescripcion(descripcion);
        actividad.setPublicacion(diaPublicacion);
        actividad.setVencimiento(vencimiento);
        actividad.setCurso(curso);
        actividad.setEvaluacion(evaluacion);
        
        return actividad.guardar(actividad);
    }
    
    public boolean RealizarEntrega(String archivoAdjunto, String descripcion, Usuario estudiante, Actividad actividad){
        Entrega entrega = new Entrega();
        Date fechaEntrega = new Date();
        entrega.setArchivoAdjunto(archivoAdjunto);
        entrega.setDescripcion(descripcion);
        entrega.setFecha(fechaEntrega);
        entrega.setEstudiante(estudiante);
        entrega.setActividad(actividad);
        
        return entrega.guardar(entrega);
    }
    
    public boolean Calificar(Actividad actividad, Usuario estudiante, Estado estado, Nota nota){
        Calificacion calificacion = new Calificacion();
        calificacion.setActividad(actividad);
        calificacion.setEstudiante(estudiante);
        calificacion.setEstado(estado);
        calificacion.setNota(nota);
        
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
                
                InicioInterfaz ii = new InicioInterfaz(u2);
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
            String nombre = cursos.get(i).getId() + " " + cursos.get(i).getNombre();
             boton.setText(nombre);
            boton.addActionListener((ActionEvent e) -> {
                
               
                
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
            String nombre = inscritos.get(i).getCurso().getId() + " " 
                    + inscritos.get(i).getCurso().getNombre();
             boton.setText(nombre);
            boton.addActionListener((ActionEvent e) -> {
                
               
                
            });
            panel.add(boton);
            panel.updateUI();
       
                
            }
            
        }
        
    }

}