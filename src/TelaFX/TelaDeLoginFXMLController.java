/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaFX;


import Classes.Usuario;
import Dao.UsuarioDao;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author augusto
 */
public class TelaDeLoginFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
     TextField usuario,senha;
    
    public void validaSenha()throws Exception{
        List<Usuario> lista =   new UsuarioDao().retornarLista(usuario.getText());
        
                
        if(lista.isEmpty()){ 
             Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("Erro");
            dialogoErro.setHeaderText("Usuario não encontrado");
            dialogoErro.setContentText("Usuario não eencontrado na base");
            dialogoErro.showAndWait();
        }
        Usuario a = lista.get(0);
        Usuario a2 = Usuario.devolveUsuario();
        a2.setSenha(senha.getText());
        if(a.getSenha().equals(a2.getSenha())) {
            
                        

        } else {
            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("Erro");
            dialogoErro.setHeaderText("Senha");
            dialogoErro.setContentText("Senha Incorreta");
            dialogoErro.showAndWait();
        }
    }
            

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
