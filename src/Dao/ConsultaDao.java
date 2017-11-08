/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Classes.Consulta;
import Classes.Paciente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author augusto
 */
public class ConsultaDao {

    public List<Consulta> retornarLista(Paciente cod) {
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        System.out.println("DEdddddddddosadasarfsadfsdogf  "+cod.getNome());
        String jpql = "select c from Consulta c where c.paciente.id ="+cod.getId();
        
        Query query = s.createQuery(jpql);
        
        List<Consulta> consultas =  query.list();
        
        /*
        Criteria crite = s.createCriteria(Consulta.class);
        crite.add(Restrictions.sqlRestriction("from Consulta where paciente_id = "+cod.getId()));
        List<Consulta> consultas = crite.list();
        */
        s.close();
        return consultas;
    }
}
