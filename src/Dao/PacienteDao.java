/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Classes.Paciente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author augusto
 */
public class PacienteDao {

    public void salvar(Paciente paciente) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        s.save(paciente);

        sf.close();
        tx.commit();
        s.close();
    }

    public void deletar(Paciente paciente) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.delete(paciente);
        
        tx.commit();
        s.close();
    }

    public void atualizar(Paciente paciente) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        s.update(paciente);

       
        tx.commit();
        s.close();
    }

    public List<Paciente> retornarLista() {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Criteria crite = s.createCriteria(Paciente.class);
        List<Paciente> pacientes = crite.list();
        
        s.close();
        return pacientes;
    }

    public List<Paciente> retornarLista(int id) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        Criteria crite = s.createCriteria(Paciente.class);
        crite.add(Restrictions.eq("id", id));
        
        s.close();
        return crite.list();
    }
    
    public List<Paciente> retornarLista(String nome) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        Criteria crite = s.createCriteria(Paciente.class);
        crite.add(Restrictions.like("nome", nome + "%"));
        List<Paciente> pacientes = crite.list(); 
        s.close();
        return pacientes;
        
        
        
    }
    
    public Paciente paciente(int cod){
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        Criteria crite = s.createCriteria(Paciente.class);
        crite.add(Restrictions.eq("id", cod));
        
        Paciente p = (Paciente)crite.list().get(0);
        
        s.close();
        return  p;
        
    }

}
