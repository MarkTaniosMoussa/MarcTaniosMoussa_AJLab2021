/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajsession2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Mark
 */
public class Test_StackPane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Button button1 = new Button("999999999999");
        Button button2 = new Button("888888");
        Button button3 = new Button("3");
        pane.getChildren().addAll(button1, button2, button3);
        pane.setStyle("-fx-background-color: Red;"); 
        //pane.setStyle("-fx-color: Black;");       is used to set the buttons color to Black
        Scene scene = new Scene(pane, 400 , 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test_StackPane");
       primaryStage.show();
       
        
        
    }
    public static void main (String[] args){
        launch (args);
        
    }
}
