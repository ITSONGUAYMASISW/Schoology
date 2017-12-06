package mx.itson.schoology.entidades;

import java.io.File;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import mx.itson.schoology.enumeradores.Estado;
import mx.itson.schoology.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Esta clase representa a la entidad Entrega.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
@Entity
public class Entrega {
    private int id;
    private String archivoAdjunto;
    private String descripcion;
    private Date fecha;
    private Usuario estudiante;
    private Actividad actividad;
    private Estado estado;
    
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
     * @return the archivoAdjunto
     */
    public String getArchivoAdjunto() {
        return archivoAdjunto;
    }

    /**
     * @param archivoAdjunto the archivoAdjunto to set
     */
    public void setArchivoAdjunto(String archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the estudiante
     */
    @OneToOne(cascade=CascadeType.ALL)  
    @JoinColumn (name="idUsuario")
    public Usuario getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Usuario estudiante) {
        this.estudiante = estudiante;
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
     * @return Devuelve entregas.
     */
        public List<Entrega> obtenerTodos() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<Entrega> entregas = (List<Entrega>) session.createCriteria(Entrega.class).list();
        return entregas;
    }

    /**
     * Método para guardar datos.
     * @param ent
     */
    public boolean guardar(Entrega ent) {
        try {
            Session sesion = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(ent);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * @return the estado
     */
    @Enumerated(EnumType.STRING)
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
