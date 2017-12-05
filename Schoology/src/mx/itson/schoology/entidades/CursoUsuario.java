/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Francisco
 */
@Entity
public class CursoUsuario {
    private int id;
    private Curso curso;
    private Usuario usuario;

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
     * Método para obtener datos.
     * @return Devuelve usuarios.
     */
        public List<CursoUsuario> obtenerTodos() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<CursoUsuario> miembros = (List<CursoUsuario>) session.createCriteria(CursoUsuario.class).list();
        session.close();
        return miembros;
    }

    /**
     * Método para guardar datos.
     * @param u
     * @return Un boolean;
     */
    public boolean guardar(CursoUsuario u) {
        
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

    /**
     * @return the curso
     */
    @OneToOne(cascade=CascadeType.ALL)  
    @JoinColumn (name="idCurso")
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the usuario
     */
    @OneToOne(cascade=CascadeType.ALL)  
    @JoinColumn (name="idUsuario")
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
