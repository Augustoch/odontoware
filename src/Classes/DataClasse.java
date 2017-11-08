/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author augusto
 */
public class DataClasse {

    int dia, mes, ano;

    public DataClasse(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public LocalDate getData() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.of(this.ano, this.mes, this.dia);
        return data;
                
    }
}
