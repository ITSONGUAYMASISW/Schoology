
package mx.itson.schoology.negocio;

import java.util.*;
import javax.swing.*;
import mx.itson.schoology.entidades.Actividad;
import mx.itson.schoology.entidades.Calificacion;
import mx.itson.schoology.entidades.Curso;
import mx.itson.schoology.entidades.Entrega;
import mx.itson.schoology.entidades.Usuario;
import mx.itson.schoology.enumeradores.Estado;
import mx.itson.schoology.enumeradores.Evaluacion;
import mx.itson.schoology.enumeradores.Nota;

/**
 * Esta clase se encuentran todos los metodos utilizados para darle
 * funcionamiento al proyecto.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
public class Metodos {
    Usuario u = new Usuario();
    
    public boolean RegistrarUsuario(String name, String lname, String email, String pass,String tel){
        
        u.setNombre(name);
        u.setApellido(lname);
        u.setCorreo(email);
        u.setContrasena(pass);
        u.setTelefono(tel);
        
        return u.guardar(u);
    }
    
    public boolean CrearCurso(String name, Usuario usuario){
        Curso curso = new Curso();
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);
        
        curso.setNombre(name);
        curso.setCodigo(GenerarCodigo());
        curso.guardar(curso);
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

        List<Usuario> usuarios = u.obtenerTodos();
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(usuario) &&
                usuarios.get(i).getContrasena().equals(contrasena.toString())) {
                return true;
            }
        }
        
         return false;
    }
    
    public boolean CrearCurso(){
        
        
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
            
    
}
