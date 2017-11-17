/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Classes.Paciente;
import Classes.Usuario;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author augusto
 */
public class UsuarioDao {
    public void salvar(Usuario usuario) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        s.save(usuario);

        
        tx.commit();
        s.close();
    }

    public void deletar(Usuario usuario) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.delete(usuario);
        
        tx.commit();
        s.close();
    }

    public void atualizar(Usuario usuario) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        s.update(usuario);

       
        tx.commit();
        s.close();
    }
    
    public List<Usuario> retornarLista() {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Criteria crite = s.createCriteria(Usuario.class);
        List<Usuario> usuarios = crite.list();
        
        s.close();
        return usuarios;
    }
    
    public List<Usuario> retornarLista(String login) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session sa = sf.openSession();

        Criteria crite = sa.createCriteria(Usuario.class);
        crite.add(Restrictions.eq("login", login));
        
        List<Usuario> usuarios = crite.list();
    
        
        sa.close();
        
        return usuarios;
    }
    
    public boolean existe(){
        
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Criteria crite = s.createCriteria(Classes.Usuario.class);
        crite.add(Restrictions.eq("tipo","Administrador" ));
        
        try{
        if(crite.list().size()>0){    
        s.close();
            return false;
        }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
        
        return true;
            
            
    }
    
}
