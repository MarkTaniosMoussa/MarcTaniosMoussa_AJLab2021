/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajsession2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Mark
 */
public class Test_Drawing extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        myDrawingPane a = new myDrawingPane();
        myDrawingPane b = new myDrawingPane();
        myDrawingPane c = new myDrawingPane();
        myDrawingPane d = new myDrawingPane();
        
        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(a, b, c, d);
        Scene scene= new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test_Drawing");
        primaryStage.show();
    }
    public static void main (String[] args){
        launch (args);
    }
}
