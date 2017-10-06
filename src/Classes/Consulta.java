/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author augusto
 */
@Entity
public class Consulta {
    @GeneratedValue @Id
    int cod;
    
    Paciente paciente;
    Usuario dentista;
    Date data;
}
