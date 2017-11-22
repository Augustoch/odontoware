/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

/**
 *
 * @author augusto
 */
public class DateClass {
    
    int dia, mes, ano;
    
    public DateClass(){
        
    }
    
    public DateClass(String data) {
        String[] dataV = data.split(Pattern.quote("/"));
        this.dia = Integer.parseInt(dataV[0]);
        this.mes = Integer.parseInt(dataV[1]);
        this.ano = Integer.parseInt(dataV[2]);
    }
    
    public DateClass(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public LocalDate getData() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.of(this.ano, this.mes, this.dia);
        
        return data;
        
    }
    
    public boolean isValid(LocalDate date) {
        LocalDate dataHoje = LocalDate.now();
        if (dataHoje.getYear() < date.getYear()) {
            return true;
        } else if (dataHoje.getYear() == date.getYear()) {
            if (dataHoje.getMonthValue() < date.getMonthValue()) {
                return true;
            } else if (dataHoje.getMonthValue() == date.getMonthValue()) {
                if (dataHoje.getDayOfMonth() < date.getDayOfMonth()) {
                    return true;
                }
            }
        }
      return  false;
    }
    
}
