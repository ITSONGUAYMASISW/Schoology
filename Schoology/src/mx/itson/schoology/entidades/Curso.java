package mx.itson.schoology.entidades;




import java.util.List;
import mx.itson.schoology.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Esta clase representa a la entidad Curso.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
public class Curso{
    
    private int id;
    private String codigo;
    private String nombre;
    private List<Usuario> miembros;

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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     * @return the miembros
     */
    public List<Usuario> getMiembros() {
        return miembros;
    }

    /**
     * @param miembros the miembros to set
     */
    public void setMiembros(List<Usuario> miembros) {
        this.miembros = miembros;
    }

    /**
     * Método para obtener datos.
     * @return Devuelve cursos.
     */
        public List<Curso> obtenerTodos() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<Curso> cursos = (List<Curso>) session.createCriteria(Curso.class).list();
        return cursos;
    }

    /**
     * Método para guardar datos.
     * @param cur
     */
    public void guardar(Curso cur) {
        try {
            Session sesion = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(cur);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
