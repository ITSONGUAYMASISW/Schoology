package mx.itson.schoology.entidades;

import java.io.File;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import mx.itson.schoology.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * Esta clase representa a la entidad Usuario.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
@Entity
public class Usuario {
    
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private String telefono;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Método para obtener datos.
     * @return Devuelve usuarios.
     */
        public List<Usuario> obtenerTodos() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<Usuario> usuarios = (List<Usuario>) session.createCriteria(Usuario.class).list();
        return usuarios;
    }

    /**
     * Método para guardar datos.
     * @param u
     * @return Un boolean;
     */
    public boolean guardar(Usuario u) {
        
        try {
            Session sesion = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(u);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
       
    }
    
}
