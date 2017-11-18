/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.JOptionPane;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author augusto
 */
public class NewHibernateUtil {
     
    private static final SessionFactory sessionFactory;
        
    static {
        
        try {
             
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            AnnotationConfiguration ac =  new AnnotationConfiguration();
            ac.addAnnotatedClass(Classes.Consulta.class);
            ac.addAnnotatedClass(Classes.Paciente.class);
            ac.addAnnotatedClass(Classes.Servico.class);
            ac.addAnnotatedClass(Classes.Usuario.class);
            ac.setProperty("hibernate.connection.driver_class", "org.hsqldb.jdbcDriver");
            ac.setProperty("hibernate.connection.url", "jdbc:hsqldb:file:src/Banco/");
            ac.setProperty("hibernate.connection.username", "root");
            ac.setProperty("hibernate.connection.password", "123456");
            ac.setProperty("show_sql", "true");
            ac.setProperty("hibernate.hbm2ddl.auto", "update");
            ac.setProperty("format_sql", "true");
            ac.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
            
            sessionFactory = ac.buildSessionFactory();
            
            
            
        } catch (Exception ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            JOptionPane.showMessageDialog(null, "Este erro "+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static String c (){
        
        return new DirManager().selecionar();
    }
    
    public static SessionFactory getSessionFactory() {
       
        return sessionFactory;
    }
}
