/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.schoology.utils;
/**
 *
 * @author Francisco
 */
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Define el inicio de sesión de Hibernate.
 * @author 
 * @version 0.1
 */
public class HibernateUtils {
    private static final SessionFactory sessionFactory;
	static {
	    try  { 
	    	Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder 
                        serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    } catch (HibernateException ex)  { 
	        System.err.println("Ocurrió un error al inicializar la configuración de Hibernate: " + ex); 
	        throw new HibernateException(ex); 
	    } 
	}
	
	/**
	 * Obtiene la sesión activa de Hibernate.
	 * @return Sesión de Hibernate de tipo SessionFactory.
	 */
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
    
}
