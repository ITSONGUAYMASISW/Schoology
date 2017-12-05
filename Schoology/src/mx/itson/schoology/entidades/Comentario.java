
package mx.itson.schoology.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import mx.itson.schoology.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Esta clase representa a la entidad Comentario.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
@Entity
public class Comentario {
    int id;
    String cuerpo;
    Actividad actividad;

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
     * @return the cuerpo
     */
    public String getCuerpo() {
        return cuerpo;
    }

    /**
     * @param cuerpo the cuerpo to set
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    /**
     * @return the actividad
     */
    @OneToOne(cascade=CascadeType.ALL)  
    @JoinColumn (name="idActividad")
    public Actividad getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }    
     
    /**
     * Método para obtener datos.
     * @return Devuelve comentarios.
     */
        public List<Comentario> obtenerTodos() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<Comentario> comentarios = (List<Comentario>) session.createCriteria(Comentario.class).list();
        return comentarios;
    }

    /**
     * Método para guardar datos.
     * @param com
     */
    public boolean guardar(Comentario com) {
        try {
            Session sesion = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(com);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
