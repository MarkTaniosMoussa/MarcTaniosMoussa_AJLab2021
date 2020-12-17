
package Assignment_num2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class registration extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // defining labels to put as validation text
        Label labelA = new Label(null);
        Label labelB = new Label(null);
        Label labelC = new Label(null);
        Label labelD = new Label(null);  
        Label labelE = new Label(null);
        Label labelF = new Label(null);
        Label labelG = new Label(null);
            
        
        labelA.setTextFill(Color.RED);
        labelB.setTextFill(Color.RED);
        labelC.setTextFill(Color.RED);
        labelD.setTextFill(Color.RED);
        labelE.setTextFill(Color.RED);
        labelF.setTextFill(Color.RED);
        labelG.setTextFill(Color.RED);
        
        
             // creating the labels in the top of the gridpane   
        Label label1 = new Label("Name:");
        Label label2 = new Label("Email:");
        Label label3 = new Label("Phone:");
        Label label4 = new Label("Password:");
        Label label5 = new Label("Confirm:");
        Label label6 = new Label("Country:");

// creating textfields and password fiels to be filled by users

        TextField txt1 = new TextField();
        txt1.setPromptText("Please enter your name");
        TextField txt2 = new TextField();
        txt2.setPromptText("Please enter your email");
        TextField txt3 = new TextField();
        txt3.setPromptText("Please enter your phone number");
        PasswordField pf1 = new PasswordField();
        pf1.setPromptText("Please enter your Password");
        PasswordField pf2 = new PasswordField();
        pf2.setPromptText("Please reenter your Password");
        
        
        txt1.setPrefColumnCount(20);
        txt2.setPrefColumnCount(20);
        txt3.setPrefColumnCount(20);
        pf1.setPrefColumnCount(20);
        pf2.setPrefColumnCount(20);
        
        
        
         
    // validating the text fields and password fields using enter and key released
        txt1.setOnAction(e -> textAlphabet(txt1, labelA, "Name must not have digits"));
        txt2.setOnAction(e -> emailFormat(txt2, labelB, "Invalid email"));
        txt3.setOnAction(e -> zID(txt3, labelC,"Phone number must be 8 digits length"));
        pf2.setOnAction(e -> matching(pf1, pf2, labelD, "Not Matching"));
        
        txt1.setOnKeyReleased(e -> textAlphabet(txt1, labelA, "Name must not have digits"));
        txt2.setOnKeyReleased(e -> emailFormat(txt2, labelB, "Invalid email"));
        txt3.setOnKeyReleased(e -> zID(txt3, labelC,"Phone number must be 8 digits length"));
        pf2.setOnKeyReleased(e -> matching(pf1, pf2, labelD, "Not Matching"));
        
        // creating the combo box
       ComboBox<String> cb = new ComboBox<String>();
        cb.getItems().addAll("select...", "Japan", "China", "Spain", "Lebanon", "Germany", "France", "Belgium", "Italy","Finland");
        cb.getSelectionModel().select(0);
        // validating the selesction in combo box
        cb.setOnAction(e -> comboSelect(cb, labelE, "Not selected"));
        
        
        // creating grid pane to add the above items  
        GridPane gp1 = new GridPane();
      
        gp1.add(label1,0,0);
        gp1.add(label2,0,1);
        gp1.add(label3,0,2);
        gp1.add(label4,0,3);
        gp1.add(label5,0,4);
        gp1.add(label6,0,5);
       
        
        gp1.add(txt1,1,0);
        gp1.add(txt2,1,1);
        gp1.add(txt3,1,2);
        gp1.add(pf1,1,3);
        gp1.add(pf2,1,4);
        
        gp1.add(cb, 1, 5);
        
        // defining the horizontal and vertical spaces
        gp1.setHgap(20);
        gp1.setVgap(10);

      
      // creating the radio button and placing it inside an HBox 
        Label label7 = new Label("Gender:");
        
        RadioButton rb1 = new RadioButton("Male");
        RadioButton rb2 = new RadioButton("Female");
        
        final ToggleGroup tg = new ToggleGroup(); 
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);

        HBox hbox1 = new HBox(20);
   
        hbox1.getChildren().addAll(label7, rb1, rb2);
        // precising the spaces so they will be aligned with the gridpane
        rb1.setPadding(new Insets(0, 0, 0,12));
        hbox1.setPadding(new Insets(20,0,20,0));

        //creating the check box and placing it in an HBox
        Label label8 = new Label("Language:");
        CheckBox check1 = new CheckBox("Arabic");
        CheckBox check2 = new CheckBox("English");
        CheckBox check3 = new CheckBox("Spanish");
        
        HBox hbox2 = new HBox(20);
        hbox2.getChildren().addAll(label8, check1, check2, check3);
        hbox2.setPadding(new Insets(20,0,20,0));
       
       // creating the label with the text area for the Biography and adding them to an HBox
        Label label9 = new Label("About you:");
        label9.setPadding(new Insets(38, 0, 0, 0));
        TextArea tb = new TextArea("Your Biography...");
        // specifying the width and height 
        tb.setMaxWidth(230);
        tb.setPrefHeight(100);
        HBox hbox3 = new HBox(20);
        hbox3.getChildren().addAll(label9, tb);
        hbox3.setPadding(new Insets(20,0,20,0));
         
        //checking the length of the typed letters in the text Area " should be minimum of 50 characters" 
         tb.setOnKeyReleased(e ->lessThan50(tb, labelF, "Biography must be greater than 50")) ;
       

      // creating registration Button and adding it to an Hbox
        Button bt = new Button("Register");
        HBox hbox4 = new HBox();
        hbox4.getChildren().add(bt);
        hbox4.setAlignment(Pos.CENTER);
        hbox4.setPadding(new Insets(20,0,20,0));
        bt.setStyle("-fx-border-color: blue;");
        bt.setPrefWidth(320);
     
        // validation of data in all the fields when pressing the register button
        bt.setOnAction(e -> allIsGood(bt, labelA, labelB, labelC, labelD, labelE, labelF));
               
   
        // creating a VBox to add the error messages in the bottom of the scene
           VBox vboxError= new VBox();
           vboxError.getChildren().addAll(labelA, labelB, labelC, labelD, labelE, labelF);
           
          
           // creating the initial vbox that should contain all the panes
VBox vbox= new VBox();
vbox.setPadding(new Insets(20,20,20,20));
vbox.getChildren().addAll(gp1, hbox1, hbox2, hbox3,hbox4, vboxError );
vbox.setStyle("-fx-border-color: blue;");

Scene scene = new Scene(vbox);

primaryStage.setScene(scene);
primaryStage.setTitle("Registration Form");
primaryStage.show();

    }
    
    public static void main (String[] args){
        launch(args);
      
    }
    
   // to check if the input contains letters only 
     public static boolean textAlphabet(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isAlphabet = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[a-z A-Z]+")) {
            isAlphabet = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);

        return isAlphabet;
} 
    
    
    // to check if the email contains @ and .com
      public static boolean emailFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isEmail = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com")) {
            isEmail = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);
        return isEmail;

    }
      
      // to check if the phone number is only written as 8 digits
      public static boolean zID(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isZID = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[0-9]{8}")) {
            isZID = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);
        return isZID;

    }
      
      // to check if the password and the confirmation password match 
       public static boolean matching(TextField inputTextField,TextField input2, Label inputLabel, String validationText){
           boolean isMatching = true;
           String validationString = null;
           
           if(inputTextField.getText().compareTo(input2.getText()) != 0){
               isMatching = false;
               validationString = validationText;
           }
           inputLabel.setText(validationString);
           return isMatching;
           
           }
        // to check if the country is selected in the combo box
             public static boolean comboSelect(ComboBox b, Label inputLabel, String validationText){
           boolean isSelected = true;
           String validationString = null;
           
           if (b.getSelectionModel().getSelectedIndex()==0){
               isSelected = false;
               validationString = validationText;
           }
           inputLabel.setText(validationString);
           return isSelected;
           
           }
             
             // to check if the input in the text area is less than 50 or not 
             public static boolean lessThan50(TextArea b, Label inputLabel, String validationText){
           boolean isLess = true;
           String validationString = null;
           
           if (b.getText().length() < 50){
               isLess = false;
               validationString = validationText;
           }
           inputLabel.setText(validationString);
           return isLess;
           
           
           
             }
             
             // to validate the input of all fields and to create a successful information or an error message.
                 public static boolean allIsGood(Button b, Label l1, Label l2, Label l3,Label l4,Label l5,Label l6){
           boolean isGood = true;
           
           
             if(l1.getText() != null || l2.getText() != null  || l3.getText()!= null || l4.getText() != null || l5.getText() != null || l6.getText() != null){
             
             Alert alertFalse = new Alert(AlertType.ERROR,"", new ButtonType("OK") );
             alertFalse.setTitle("Regsitration Confirmation");
             alertFalse.setHeaderText("Check the errors");
             alertFalse.showAndWait();
             isGood= false;
               
           }
            
             else{   
                 
             Alert alertTrue = new Alert(AlertType.INFORMATION,"", new ButtonType("Done") );
             alertTrue.setTitle("Regsitration Confirmation");
             alertTrue.setHeaderText("Succesfully Registered");
             alertTrue.showAndWait();
             }
                return isGood;
            
}
}