/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.*;

/**
 *
 * @author augusto
 */
@Entity
public class Paciente {

    @GeneratedValue
    @Id
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataDeNacimento;
    private String endereco;
    private char sexo;
    private String fone;
    private String rg;
    private String OrgaoEmissor;
    
    
    public static Paciente devolveInstanciaDePaciente() {
        return new Paciente();
    }

    /**
     * @return the id
     */
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the dataDeNacimento
     */
    public LocalDate getDataDeNacimento() {
        return dataDeNacimento;
    }

    /**
     * @param dataDeNacimento the dataDeNacimento to set
     */
    public void setDataDeNacimento(LocalDate dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the OrgaoEmissor
     */
    public String getOrgaoEmissor() {
        return OrgaoEmissor;
    }

    /**
     * @param OrgaoEmissor the OrgaoEmissor to set
     */
    public void setOrgaoEmissor(String OrgaoEmissor) {
        this.OrgaoEmissor = OrgaoEmissor;
    }

    

}
