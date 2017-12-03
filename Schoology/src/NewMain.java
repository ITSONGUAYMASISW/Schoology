
import java.io.File;
import java.util.*;
import mx.itson.schoology.entidades.Actividad;
import mx.itson.schoology.entidades.Calificacion;
import mx.itson.schoology.entidades.Curso;
import mx.itson.schoology.entidades.Entrega;
import mx.itson.schoology.entidades.Usuario;
import mx.itson.schoology.enumeradores.Estado;
import mx.itson.schoology.enumeradores.Evaluacion;
import mx.itson.schoology.enumeradores.Nota;
import mx.itson.schoology.negocio.Metodos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andy_
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Actividad actividad = new Actividad();
        Calificacion calificacion = new Calificacion();
        Curso curso = new Curso();
        Entrega entrega = new Entrega();
        Usuario usuario = new Usuario();
        Metodos metodos = new Metodos();
        Usuario usuario2 = new Usuario();
        
        usuario.setApellido("Pérez");
        usuario.setContrasena("contraseña");
        usuario.setCorreo("juan@hotmail.com");
        usuario.setNombre("Juan");
        usuario.setTelefono("1234567");
        
        usuario2.setNombre("Luis");
        usuario2.setApellido("García");
        usuario2.setContrasena("constraseña2");
        usuario2.setCorreo("luis@hotmail.com");
        usuario2.setTelefono("647337");
        
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        usuarios.add(usuario2);
        curso.setCodigo(metodos.GenerarCodigo());
        curso.setMiembros(usuarios);
        
        Date dia = new Date();
        
//        actividad.setCurso(cursos.get(1));
//        actividad.setDescripcion("Actividad");
//        actividad.setEvaluacion(Evaluacion.NUMERICA);
//        actividad.setNombre("Actividad");
//        actividad.setPublicacion(dia);
//        actividad.setVencimiento(dia);
        
        List<Actividad> actividades = actividad.obtenerTodos();
        List<Usuario> usuarios2 = usuario.obtenerTodos();
        entrega.setActividad(actividad);
        entrega.setArchivoAdjunto("C://direccion");
        entrega.setDescripcion("hejwfhjew");
        entrega.setEstudiante(usuarios2.get(0));
        entrega.setFecha(dia);
        entrega.guardar(entrega);
        
        System.out.println(actividad.guardar(actividad));
        
        List<Entrega> entregas = entrega.obtenerTodos();
        
        calificacion.setActividad(actividad);
        calificacion.setEstado(Estado.TARDE);
        calificacion.setEstudiante(usuario);
        calificacion.setNota(Nota.UNO);
        calificacion.guardar(calificacion);
        
        
    }
    
}
