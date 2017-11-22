
import Tela.MenuDentista;
import Util.DateClass;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto
 */
public class NewClass {
    public static void main (String args[]){
      String[] serial = new String[]{"","12/12/2017"};
        System.out.println(serial[0].equals("AAAA-AAAA-AAAA-AAAA"));
        
        System.out.println(new DateClass().isValid(new DateClass(serial[1]).getData()));
        JOptionPane.showMessageDialog(null, System.getProperty("user.home"));
        
        
    }
}
