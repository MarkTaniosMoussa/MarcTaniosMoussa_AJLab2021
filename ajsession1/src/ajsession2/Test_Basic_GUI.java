/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajsession2;

import ajsession2.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author Mark
 */
public class Test_Basic_GUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    
    FlowPane pane = new FlowPane();
    Label label = new Label ("Marc");
    TextField textField= new TextField ("Enter text here");
    TextArea textArea = new TextArea ("Enter large text here");
    CheckBox checkBox = new CheckBox ("Select one or more options");
    RadioButton radioButton = new RadioButton ("Choose one option");
    
    pane.getChildren().addAll(label, textField, textArea, checkBox, radioButton);
   Scene scene = new Scene(pane, 400, 400);
   primaryStage.setTitle("Test_Basic_GUI");
   primaryStage.setScene(scene);
   primaryStage.show();
    
    }
    public static void main (String[] args){
        launch (args);
        
    }
}
