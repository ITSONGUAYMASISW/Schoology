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
    
    /**
     * @return the id
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
     /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
     /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }
     /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
     /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }
     /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }
     /**
     * @param telefono the telefono to set
     */
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
