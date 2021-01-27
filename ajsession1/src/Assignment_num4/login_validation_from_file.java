
package training2;

import java.io.File;
import java.util.Scanner;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;


public class login_validation_from_file extends Application {
int index = 0;
 private static Scanner x; 

    private File fileChosen = null;
    String res;
    Label resLabel;
    GridPane gridPane;
    ToggleGroup group;
    TextField txt;
TextField txt1 = new TextField();
PasswordField pf = new PasswordField();



    @Override
    public void start(Stage primaryStage) throws Exception {
     //   fileChosen = new File("user.txt");
        
     String imageURL = "https://picsum.photos/200"; 
 Pane pane = new Pane(); 
 HBox hbox1 = new HBox(30);
 hbox1.getChildren().add(createImageViewFromURL(imageURL));
  hbox1.setAlignment(Pos.CENTER);
 hbox1.setPadding(new Insets(30,30,5,35));
  
  HBox hbox2 = new HBox(30);
 Label username = new Label("Username: ");
 
 hbox2.getChildren().addAll(username,txt1);
  hbox2.setAlignment(Pos.CENTER);
  hbox2.setPadding(new Insets(20,20,5,20));
 
 HBox hbox3 = new HBox(30);
  Label password = new Label("Password: ");
 
 hbox3.getChildren().addAll(password, pf);
  hbox3.setAlignment(Pos.CENTER);
  hbox3.setPadding(new Insets(20,20,5,20));
 
 HBox hbox4= new HBox(30);
 Button login = new Button("Login");
 hbox4.getChildren().add(login);
 hbox4.setAlignment(Pos.CENTER);
 hbox4.setPadding(new Insets(20,20,5,20));
 
 
 
 VBox vbox = new VBox(10); 
 vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox4);
 
 
        Image image[] = new Image[10];
for(int i=0; i<10; i++){ 
  image[i] = new Image("file:///C:\\Users\\Mark\\Desktop\\AJCourse\\pics_slideshow\\slide" + i + ".jpg");
    
}
ImageView imageView = new ImageView(image[0]);
imageView.setOpacity(0.7);
 pane.getChildren().add(imageView);
 pane.getChildren().add(vbox);


login.setOnAction(e -> { 
   verifyLogin(txt1.getText(),pf.getText(),"C:\\Users\\Mark\\Desktop\\AJLAB\\user.txt");
    
}); 

 
 
 Scene scene = new Scene(pane, 300 , 450);
 primaryStage.setScene(scene);
 primaryStage.setTitle("login_file_validation");
 primaryStage.show();
 
 
   Timeline slideShow = new Timeline(new KeyFrame(Duration.millis(2000), e -> {imageView.setImage(image[++index % 10]);}));
    slideShow.setCycleCount(Timeline.INDEFINITE);
    slideShow.play();
    }
 
    
      ImageView createImageViewFromURL(String imageURL){
        Image image = new Image(imageURL, 200, 200, false , false);
        ImageView imageView = new ImageView(image);
        return imageView;
        
    }
      
     
      public static void main(String[] args){
          
 
          launch(args);
      }
      
      
   /*   class SearchEventHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            
           String name = txt1.getText();
            try {
                Scanner fscan = new Scanner(new File(fName));

                int j = 0;

                while (fscan.hasNext()) {
                    fscan.nextInt();
                    boys[i][j] = fscan.next();
                    fscan.next();
                    girls[i][j] = fscan.next();
                    fscan.next();
                    j++;
                }
                fscan.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
           
           
           String nameOfFile = fileChosen.getName();
}
      } */
      
      
      
      
      
      

     public void verifyLogin(String username, String password, String FilePath) {

        

boolean found = false;
String tempUsername =""; 
String tempPassword=""; 

try 
{ 
x= new Scanner(new File(FilePath)); 
//x.nextLine();
x.nextLine();
while(x.hasNext() && !found) 
{

tempUsername = x.next();
tempPassword = x.next();

if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
{
    Alert alertTrue = new Alert(Alert.AlertType.INFORMATION,"", new ButtonType("Done") );
             alertTrue.setTitle("Login Confirmation");
             alertTrue.setHeaderText("Succesfully Logged in");
             alertTrue.showAndWait();
found = true; 
} 
}
x.close();
if(found){
System.out.println(found);
}
else{
     Alert alertFalse = new Alert(Alert.AlertType.ERROR,"", new ButtonType("OK") );
             alertFalse.setTitle("Login Confirmation");
             alertFalse.setHeaderText("Wrong Username or Password");
             alertFalse.showAndWait();
    System.out.println(found+ " Wrong Username or Password ");
}
}
catch(Exception e)
{
   System.out.println("Wrong Username or Password");
    System.out.println("not found");
}
      } 

      /*  @Override
        public void handle(ActionEvent event) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }*/ 
}