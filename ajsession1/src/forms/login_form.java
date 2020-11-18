/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mark
 */
public class login_form extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lb1 = new Label("Username");              // Creating the username label
        Label lb2 = new Label("Password");              // Creating the password label 
        TextField txt1 = new TextField();               // Creating a text field to write the username
        PasswordField pass = new PasswordField();       // Creating the password field that hides the characters as dots
        Button btn = new Button("Sign in ");            // Creating the Sign in button
       String imageURL = "https://picsum.photos/200";   // Defining the imageURL as a String in order to use it in the function later on 
       
       VBox vBox1 = new VBox();                         // Creating a vBox1
       vBox1.getChildren().addAll(lb1, lb2);            // adding both labels to the vBox1
       //vBox1.setPadding(new Insets(20));
       vBox1.setMargin(lb1, new Insets(0, 20, 20, 20));  // setting the moargin of the lb1
              vBox1.setMargin(lb2, new Insets(20, 20, 20, 20)); // Setting the margin for lb2;
                
      VBox vBox2= new VBox();                                 // Creating vBox2                  
       vBox2.getChildren().addAll(txt1, pass,btn);            // adding these elements to the vBox2
       txt1.setStyle("-fx-stroke-width: 10;");                // setting the width of the label
       // vBox2.setPadding(new Insets(20));
       vBox2.setMargin(txt1, new Insets(0, 20, 20, 20));       // spacing all around the labels
       vBox2.setMargin(pass, new Insets(10, 20, 20, 20));
       vBox2.setMargin(btn, new Insets(0, 20, 20, 20));
      HBox hBox1 = new HBox();
      
      hBox1.getChildren().addAll(vBox1, vBox2);                // adding the two vBoxs to the same hBox
      // hBox1.setPadding(new Insets(20));
      
      
       HBox hBox2 = new HBox();                                // Creating a new hBox for the image 
       hBox2.getChildren().add(createImageViewFromURL(imageURL));
       hBox2.setAlignment(Pos.CENTER);

       //btn.setAlignment(Pos.BOTTOM_RIGHT);
      // hBox2.setMargin(createImageViewFromURL(imageURL), new Insets(0, 20, 20, 20));
       
       VBox vBox3 = new VBox();                         // Creating new Vbox
       vBox3.getChildren().addAll(hBox2, hBox1);        //    adding both hboxs to the final vBox 
       vBox3.setMargin(hBox2, new Insets(20, 20, 20, 20));
       vBox3.setAlignment(Pos.CENTER);                      
       vBox3.setStyle("-fx-Background-color: cyan ;" );       // setting the background color to cyan
      
      
      Scene scene = new Scene(vBox3, 400, 400);             // adding the last vbox to a scene
      primaryStage.setTitle("Login_Form");
      primaryStage.setScene(scene);
      primaryStage.show();
      
       // GridPane pane = new GridPane();
       // Scene scene = new Scene(pane, 500, 500);
       
    }
    ImageView createImageViewFromURL(String imageURL){
        Image image = new Image(imageURL, 200, 200, false , false);
        ImageView imageView = new ImageView(image);
        return imageView;
        
    }
   public static void main (String[] args){
       launch (args);
   }
}
