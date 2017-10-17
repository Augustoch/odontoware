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
import javax.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author augusto
 */
@Entity
public class Consulta {
    @GeneratedValue @Id
    int cod;    
    @ManyToOne
    Paciente paciente;
    Usuario dentista;
    Date data;
    String queixa;
    boolean doenca;
    String doencaDesc;
    boolean tratamento;
    boolean gravidez;
    String medicacao;
    String cirurgias;
    String alergias;
    String habitos;
    String obs;
    Date ultimoAtendimento;
    String xpNegAtendAnterior;
    String usaHigieneBucal;
    String tecidosMoles;
    boolean ingeriAlimentosbebidasRefeicoes;
    String exameDental;
    String planosTratamento;
    boolean finalizada; 
    
}
