package mx.itson.schoology.entidades;

import java.io.File;
import java.util.Date;
import java.util.List;
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
public class Entrega {
    private int id;
    private File archivoAdjunto;
    private String descripcion;
    private Date fecha;
    private Usuario estudiante;
    private Actividad actividad;

    /**
     * @return the id
     */
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
    public File getArchivoAdjunto() {
        return archivoAdjunto;
    }

    /**
     * @param archivoAdjunto the archivoAdjunto to set
     */
    public void setArchivoAdjunto(File archivoAdjunto) {
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
    public void guardar(Entrega ent) {
        try {
            Session sesion = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(ent);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
