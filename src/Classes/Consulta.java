/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author augusto
 */
@Entity
public class Consulta {
    @GeneratedValue @Id
    private int cod;    
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Usuario dentista;
    @ManyToMany
    private List<Servico> servicos;
    private LocalDate dataDaConsulta;
    private LocalDate dataDoUltAtendimento;
    private String queixa;
    private boolean doenca;
    private String doencaDesc;
    private boolean tratamento;
    private boolean gravidez;
    private String medicacao;
    private String cirurgias;
    private String alergias;
    private String habitos;
    private String obs;    
    private String xpNegAtendAnterior;
    private String usaHigieneBucal;
    private String tecidosMoles;
    private boolean ingeriAlimentosbebidasRefeicoes;
    private String exameDental;
    private String planosTratamento;
    private boolean finalizada; 
    
    public static Consulta devolveObjConsulta(){
        return new Consulta();
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the dentista
     */
    public Usuario getDentista() {
        return dentista;
    }

    /**
     * @param dentista the dentista to set
     */
    public void setDentista(Usuario dentista) {
        this.dentista = dentista;
    }

    /**
     * @return the dataDaConsulta
     */
    public LocalDate getDataDaConsulta() {
        return dataDaConsulta;
    }

    /**
     * @param dataDaConsulta the dataDaConsulta to set
     */
    public void setDataDaConsulta(LocalDate dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
    }

    /**
     * @return the queixa
     */
    public String getQueixa() {
        return queixa;
    }

    /**
     * @param queixa the queixa to set
     */
    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    /**
     * @return the doenca
     */
    public boolean isDoenca() {
        return doenca;
    }

    /**
     * @param doenca the doenca to set
     */
    public void setDoenca(boolean doenca) {
        this.doenca = doenca;
    }

    /**
     * @return the doencaDesc
     */
    public String getDoencaDesc() {
        return doencaDesc;
    }

    /**
     * @param doencaDesc the doencaDesc to set
     */
    public void setDoencaDesc(String doencaDesc) {
        this.doencaDesc = doencaDesc;
    }

    /**
     * @return the tratamento
     */
    public boolean isTratamento() {
        return tratamento;
    }

    /**
     * @param tratamento the tratamento to set
     */
    public void setTratamento(boolean tratamento) {
        this.tratamento = tratamento;
    }

    /**
     * @return the gravidez
     */
    public boolean isGravidez() {
        return gravidez;
    }

    /**
     * @param gravidez the gravidez to set
     */
    public void setGravidez(boolean gravidez) {
        this.gravidez = gravidez;
    }

    /**
     * @return the medicacao
     */
    public String getMedicacao() {
        return medicacao;
    }

    /**
     * @param medicacao the medicacao to set
     */
    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    /**
     * @return the cirurgias
     */
    public String getCirurgias() {
        return cirurgias;
    }

    /**
     * @param cirurgias the cirurgias to set
     */
    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    /**
     * @return the alergias
     */
    public String getAlergias() {
        return alergias;
    }

    /**
     * @param alergias the alergias to set
     */
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    /**
     * @return the habitos
     */
    public String getHabitos() {
        return habitos;
    }

    /**
     * @param habitos the habitos to set
     */
    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the ultimoAtendimento
     */
    

    /**
     * @return the xpNegAtendAnterior
     */
    public String getXpNegAtendAnterior() {
        return xpNegAtendAnterior;
    }

    /**
     * @param xpNegAtendAnterior the xpNegAtendAnterior to set
     */
    public void setXpNegAtendAnterior(String xpNegAtendAnterior) {
        this.xpNegAtendAnterior = xpNegAtendAnterior;
    }

    /**
     * @return the usaHigieneBucal
     */
    public String getUsaHigieneBucal() {
        return usaHigieneBucal;
    }

    /**
     * @param usaHigieneBucal the usaHigieneBucal to set
     */
    public void setUsaHigieneBucal(String usaHigieneBucal) {
        this.usaHigieneBucal = usaHigieneBucal;
    }

    /**
     * @return the tecidosMoles
     */
    public String getTecidosMoles() {
        return tecidosMoles;
    }

    /**
     * @param tecidosMoles the tecidosMoles to set
     */
    public void setTecidosMoles(String tecidosMoles) {
        this.tecidosMoles = tecidosMoles;
    }

    /**
     * @return the ingeriAlimentosbebidasRefeicoes
     */
    public boolean isIngeriAlimentosbebidasRefeicoes() {
        return ingeriAlimentosbebidasRefeicoes;
    }

    /**
     * @param ingeriAlimentosbebidasRefeicoes the ingeriAlimentosbebidasRefeicoes to set
     */
    public void setIngeriAlimentosbebidasRefeicoes(boolean ingeriAlimentosbebidasRefeicoes) {
        this.ingeriAlimentosbebidasRefeicoes = ingeriAlimentosbebidasRefeicoes;
    }

    /**
     * @return the exameDental
     */
    public String getExameDental() {
        return exameDental;
    }

    /**
     * @param exameDental the exameDental to set
     */
    public void setExameDental(String exameDental) {
        this.exameDental = exameDental;
    }

    /**
     * @return the planosTratamento
     */
    public String getPlanosTratamento() {
        return planosTratamento;
    }

    /**
     * @param planosTratamento the planosTratamento to set
     */
    public void setPlanosTratamento(String planosTratamento) {
        this.planosTratamento = planosTratamento;
    }

    /**
     * @return the finalizada
     */
    public boolean isFinalizada() {
        return finalizada;
    }

    /**
     * @param finalizada the finalizada to set
     */
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    /**
     * @return the dataDoUltAtendimento
     */
    public LocalDate getDataDoUltAtendimento() {
        return dataDoUltAtendimento;
    }

    /**
     * @param dataDoUltAtendimento the dataDoUltAtendimento to set
     */
    public void setDataDoUltAtendimento(LocalDate dataDoUltAtendimento) {
        this.dataDoUltAtendimento = dataDoUltAtendimento;
    }

    /**
     * @return the servicos
     */
    public List<Servico> getServicos() {
        return servicos;
    }

    /**
     * @param servicos the servicos to set
     */
    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    
        
    
    
}
