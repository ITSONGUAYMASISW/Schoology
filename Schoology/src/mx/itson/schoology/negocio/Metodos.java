
package mx.itson.schoology.negocio;

import java.util.*;
import javax.swing.*;
import mx.itson.schoology.entidades.Usuario;

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
        u.setContraseña(pass);
        u.setTelefono(tel);
        
        return u.guardar(u);
    }
    
    public boolean IniciarSesion(JTextField usuario, JPasswordField contrasena){

        List<Usuario> usuarios = u.obtenerTodos();
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCorreo().equals(usuario) &&
                usuarios.get(i).getContraseña().equals(contrasena.toString())) {
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
