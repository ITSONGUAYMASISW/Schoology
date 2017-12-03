package mx.itson.schoology.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import mx.itson.schoology.enumeradores.Estado;
import mx.itson.schoology.enumeradores.Nota;
import mx.itson.schoology.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Esta clase representa a la entidad Calificacion.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
public class Calificacion {
    
    private int id;
    private Actividad actividad;
    private Usuario estudiante;
    private Estado estado;
    private Nota nota;

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
     * @return the Actividad
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
     * @return the Estudiante
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
     * @return the Estado
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
    /**
     * @return the Nota
     */
    @Enumerated(EnumType.STRING)
    public Nota getNota() {
        return nota;
    }
    /**
     * @param nota the nota to set
     */
    public void setNota(Nota nota) {
        this.nota = nota;
    }    
    
    /**
     * Método para obtener datos.
     * @return Devuelve calificaciones.
     */
        public List<Calificacion> obtenerTodos() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<Calificacion> calificaciones = (List<Calificacion>) session.createCriteria(Calificacion.class).list();
        session.close();
        return calificaciones;
    }

    /**
     * Método para guardar datos.
     * @param c
     * @return Un boolean;
     */
    public boolean guardar(Calificacion c) {
        
        try {
            Session sesion = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(c);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    
}
}