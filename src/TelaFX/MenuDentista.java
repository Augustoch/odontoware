/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author augusto
 */
public class MenuDentista extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent p = FXMLLoader.load(getClass().getResource("TelaDeLoginFXML.fxml"));
        
        Scene s = new Scene(p);
        
        primaryStage.setScene(s);
        
        primaryStage.show();
    }
    
}
