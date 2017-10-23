/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Classes.Servico;
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
public class ServicoDao {
    
    public List<Servico> retornaTodosOsServicos(){
      SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Criteria c = s.createCriteria(Servico.class);
       List<Servico> servicos = c.list();
        
        tx.commit();
        s.close();  
        return servicos;
    }
}
