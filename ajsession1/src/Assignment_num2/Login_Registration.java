
package Assignment_num2;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Login_Registration extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
Stage stage2 = new Stage();
       Stage stage3 = new Stage(); 
Pane pane = new Pane(); 
Label toLogin = new Label("Already have an account?");
Label  toRegister = new Label("Don't have an Account? \n            Register!!");
Button login = new Button("Login");
Button register = new Button("Register");
login.setOpacity(0.5);
register.setOpacity(0.5);
login.setStyle("-fx-border-color: red;");
register.setStyle("-fx-border-color: red;");
toLogin.setTextFill(Color.RED);
toRegister.setTextFill(Color.RED);

HBox hb1 = new HBox(40);

GridPane grid = new GridPane();
grid.add(login,0,0);
grid.add(register,1,0);
grid.setAlignment(Pos.CENTER);
grid.setHgap(120);

hb1.getChildren().addAll(toLogin, toRegister);


VBox vb = new VBox(30);
vb.setPadding(new Insets(100,20,20,20));
vb.getChildren().addAll(hb1,grid);

//HBox imaging = new HBox();
//Button StartSlideShow = new Button("Slide Show");
//imaging.setPadding( new Insets(0,0,50,0));
//imaging.getChildren().add(StartSlideShow);


login.setOnAction(e -> {
    
   stage2.show();
        primaryStage.close();
        
    });

register.setOnAction(e -> {
    
   stage3.show(); 
           primaryStage.close();

});
StackPane sp = new StackPane();

/*ImageView[] images = {new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide0.jpg"), new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide1.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide2.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide3.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide4.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide5.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide6.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide7.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide8.jpg"),
    new ImageView("file:///C:\\Users\\Mark\\Desktop\\AJLAB\\images for slideshow\\slide9.jpg")
        };

*/


/*StartSlideShow.setOnAction(e-> {
    
           
       }
   
    
});*/
EventHandler<ActionEvent> eh = e -> {
   
    String imageURL = "https://picsum.photos/200";
 
sp.getChildren().add(createImageViewFromURL(imageURL));
sp.setScaleX(2.5);
sp.setScaleY(1.2);

    

};

Timeline animation = new Timeline(
new KeyFrame(Duration.millis(3000), eh));
animation.setCycleCount(Timeline.INDEFINITE);
animation.play();

pane.getChildren().addAll(sp,vb);


Scene scene = new Scene(pane);

primaryStage.setScene(scene);
primaryStage.setTitle("Login_Registration");
primaryStage.show();



















Label lb1 = new Label("Username");              // Creating the username label
        Label lb2 = new Label("Password");              // Creating the password label 
        TextField txt1 = new TextField();               // Creating a text field to write the username
        PasswordField pass = new PasswordField();       // Creating the password field that hides the characters as dots
        Button btn = new Button("Sign in ");            // Creating the Sign in button
       Button btn2 = new Button("Back");
        Label noAcc = new Label("Still don't have an  account?");
        Button goToRegistration = new Button("Register");
        
        String imageURL = "https://picsum.photos/200";   // Defining the imageURL as a String in order to use it in the function later on 
       
       VBox vBox1 = new VBox();                         // Creating a vBox1
       vBox1.getChildren().addAll(lb1, lb2);            // adding both labels to the vBox1
       
       vBox1.setMargin(lb1, new Insets(0, 20, 20, 20));  // setting the moargin of the lb1
              vBox1.setMargin(lb2, new Insets(3, 20, 20, 20)); // Setting the margin for lb2;
                
      VBox vBox2= new VBox();                                 // Creating vBox2                  
       vBox2.getChildren().addAll(txt1, pass,btn, btn2, noAcc, goToRegistration);            // adding these elements to the vBox2
       lb1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20)); 
       lb2.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20));// setting the width of the labelT
  
      lb1.setStyle("-fx-Border-color: red;");
lb2.setStyle("-fx-Border-color: red;");

      
    
       
       vBox2.setMargin(txt1, new Insets(0, 20, 20, 20));       // spacing all around the labels
       vBox2.setMargin(pass, new Insets(10, 20, 20, 20));
       vBox2.setMargin(btn, new Insets(0, 20, 20, 20));
       vBox2.setMargin(btn2, new Insets(0, 20, 20, 20));
       vBox2.setMargin(noAcc, new Insets(0, 20, 0, 20));
       vBox2.setMargin(goToRegistration, new Insets(0, 20, 20, 20));
       
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
       vBox3.setStyle("-fx-Background-color: coral ; -fx-Border-color: red;" );       // setting the background color to cyan
      
      
       btn2.setOnAction(e -> { 
          stage2.close();
          primaryStage.show();
           
       });
       
       goToRegistration.setOnAction (e -> {
           stage2.close();
           stage3.show();
           
       });
       
       btn.setOnAction(e -> {
          Alert alertTrue = new Alert(AlertType.INFORMATION,"", new ButtonType("Done") );
             alertTrue.setTitle("Account");
             alertTrue.setHeaderText(" WELCOME TO YOUR ACCOUNT !!! ");
             alertTrue.showAndWait(); 
           
       });
       
       
      Scene scene2 = new Scene(vBox3, 400, 500);
      
      
      // adding the last vbox to a scene
      stage2.setTitle("Login_Form");
      stage2.setScene(scene2);
     //stage2.show();
      
       // GridPane pane = new GridPane();
       // Scene scene = new Scene(pane, 500, 500);
       
    
   

       
       
       
       
       
       
       
       
       
       
       
       
       
       
    



        // defining labels to put as validation text
        Label Alabel = new Label(null);
        Label Blabel = new Label(null);
        Label Clabel = new Label(null);
        Label Dlabel = new Label(null);  
        Label Elabel = new Label(null);
        Label Flabel = new Label(null);
        Label Glabel = new Label(null);
            
        
        Alabel.setTextFill(Color.RED);
        Blabel.setTextFill(Color.RED);
        Clabel.setTextFill(Color.RED);
        Dlabel.setTextFill(Color.RED);
        Elabel.setTextFill(Color.RED);
        Flabel.setTextFill(Color.RED);
        Glabel.setTextFill(Color.RED);
        
        
             // creating the labels in the top of the gridpane   
        Label label1 = new Label("Name:");
        Label label2 = new Label("Email:");
        Label label3 = new Label("Phone:");
        Label label4 = new Label("Password:");
        Label label5 = new Label("Confirm:");
        Label label6 = new Label("Country:");

// creating textfields and password fiels to be filled by users

        TextField Atxt = new TextField();
        Atxt.setPromptText("Please enter your name");
        TextField Btxt = new TextField();
        Btxt.setPromptText("Please enter your email");
        TextField Ctxt = new TextField();
        Ctxt.setPromptText("Please enter your phone number");
        PasswordField Apf = new PasswordField();
        Apf.setPromptText("Please enter your Password");
        PasswordField Bpf = new PasswordField();
        Bpf.setPromptText("Please reenter your Password");
        
        
        Atxt.setPrefColumnCount(20);
        Btxt.setPrefColumnCount(20);
        Ctxt.setPrefColumnCount(20);
        Apf.setPrefColumnCount(20);
        Bpf.setPrefColumnCount(20);
        
        
        
         
    // validating the text fields and password fields using enter and key released
        Atxt.setOnAction(e -> textAlphabet(Atxt, Alabel, "Name must not have digits"));
        Btxt.setOnAction(e -> emailFormat(Btxt, Blabel, "Invalid email"));
        Ctxt.setOnAction(e -> zID(Ctxt, Clabel,"Phone number must be 8 digits length"));
        Bpf.setOnAction(e -> matching(Apf, Bpf, Dlabel, "Not Matching"));
        
        Atxt.setOnKeyReleased(e -> textAlphabet(Atxt, Alabel, "Name must not have digits"));
        Btxt.setOnKeyReleased(e -> emailFormat(Btxt, Blabel, "Invalid email"));
        Ctxt.setOnKeyReleased(e -> zID(Ctxt, Clabel,"Phone number must be 8 digits length"));
        Bpf.setOnKeyReleased(e -> matching(Apf, Bpf, Dlabel, "Not Matching"));
        
        // creating the combo box
       ComboBox<String> cb = new ComboBox<String>();
        cb.getItems().addAll("select...", "Japan", "China", "Spain", "Lebanon", "Germany", "France", "Belgium", "Italy","Finland");
        cb.getSelectionModel().select(0);
        // validating the selesction in combo box
        cb.setOnAction(e -> comboSelect(cb, Elabel, "Not selected"));
        
        
        // creating grid pane to add the above items  
        GridPane Agp = new GridPane();
      
        Agp.add(label1,0,0);
        Agp.add(label2,0,1);
        Agp.add(label3,0,2);
        Agp.add(label4,0,3);
        Agp.add(label5,0,4);
        Agp.add(label6,0,5);
       
        
        Agp.add(Atxt,1,0);
        Agp.add(Btxt,1,1);
        Agp.add(Ctxt,1,2);
        Agp.add(Apf,1,3);
        Agp.add(Bpf,1,4);
        
        Agp.add(cb, 1, 5);
        
        // defining the horizontal and vertical spaces
        Agp.setHgap(20);
        Agp.setVgap(10);

      
      // creating the radio button and placing it inside an HBox 
        Label label7 = new Label("Gender:");
        
        RadioButton Arb = new RadioButton("Male");
        RadioButton Brb = new RadioButton("Female");
        
        final ToggleGroup tg = new ToggleGroup(); 
        Arb.setToggleGroup(tg);
        Brb.setToggleGroup(tg);

        HBox Ahbox = new HBox(20);
   
        Ahbox.getChildren().addAll(label7, Arb, Brb);
        // precising the spaces so they will be aligned with the gridpane
        Arb.setPadding(new Insets(0, 0, 0,12));
        Ahbox.setPadding(new Insets(20,0,20,0));

        //creating the check box and placing it in an HBox
        Label label8 = new Label("Language:");
        CheckBox check1 = new CheckBox("Arabic");
        CheckBox check2 = new CheckBox("English");
        CheckBox check3 = new CheckBox("Spanish");
        
        HBox Bhbox = new HBox(20);
        Bhbox.getChildren().addAll(label8, check1, check2, check3);
        Bhbox.setPadding(new Insets(20,0,20,0));
       
       // creating the label with the text area for the Biography and adding them to an HBox
        Label label9 = new Label("About you:");
        label9.setPadding(new Insets(38, 0, 0, 0));
        TextArea tb = new TextArea("Your Biography...");
        // specifying the width and height 
        tb.setMaxWidth(230);
        tb.setPrefHeight(100);
        HBox Chbox = new HBox(20);
        Chbox.getChildren().addAll(label9, tb);
        Chbox.setPadding(new Insets(20,0,20,0));
         
        //checking the length of the typed letters in the text Area " should be minimum of 50 characters" 
         tb.setOnKeyReleased(e ->lessThan50(tb, Flabel, "Biography must be greater than 50")) ;
       

      // creating registration Button and adding it to an Hbox
        Button bt = new Button("Register");
        HBox Dhbox = new HBox();
        Dhbox.getChildren().add(bt);
        Dhbox.setAlignment(Pos.CENTER);
        Dhbox.setPadding(new Insets(20,0,20,0));
        bt.setStyle("-fx-border-color: blue;");
        bt.setPrefWidth(320);
     
        // validation of data in all the fields when pressing the register button
        bt.setOnAction(e -> allIsGood(bt, Alabel, Blabel, Clabel, Dlabel, Elabel, Flabel));
               
   
        // creating a VBox to add the error messages in the bottom of the scene
           VBox vboxError= new VBox();
           vboxError.getChildren().addAll(Alabel, Blabel, Clabel, Dlabel, Elabel, Flabel);
           
          
           HBox Ehbox = new HBox(50);
           Button back = new Button("Back");
           Ehbox.getChildren().add(back);
           Label wantToLogin = new Label("already have an account?");
           Button goToLogin = new Button("Login");
           VBox haveAnAccount = new VBox();
           haveAnAccount.getChildren().addAll(wantToLogin,goToLogin);
           Ehbox.getChildren().add(haveAnAccount);
           Ehbox.setMargin(back,new Insets(18,0, 0 ,0));
           
           // creating the initial vbox that should contain all the panes
VBox Avbox= new VBox();
Avbox.setPadding(new Insets(20,20,20,20));
Avbox.getChildren().addAll(Agp, Ahbox, Bhbox, Chbox,Dhbox, Ehbox, vboxError );
Avbox.setStyle("-fx-border-color: blue;");

back.setOnAction(e-> {
   stage3.close();
   primaryStage.show();
    
});

goToLogin.setOnAction(e -> {

    stage3.close();
    stage2.show();

});

Scene scene3 = new Scene(Avbox);

stage3.setScene(scene3);
stage3.setTitle("Registration Form");
//primaryStage.show();
//stage3.show();

    
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
                 
                 
                
                  ImageView createImageViewFromURL(String imageURL){
        Image image = new Image(imageURL, 200, 200, false , false);
        ImageView imageView = new ImageView(image);
        return imageView;
        
    }
  


                 
    public static void main (String[] args){
        launch(args);
    }



        
}