/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajsession1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Mark
 */
public class Ajsession1 extends Application {
    private static final String imageURL = "https://homepages.cae.wisc.edu/~ece533/images/fruits";
     private Text createText() {
        // create a text
        Text text1 = new Text(10, 20, "Programming is fun");
        text1.setFont(Font.font("courier"));
        text1.setFont(Font.font("courier", FontPosture.ITALIC,22));
        text1.setFill(Color.AQUA);
        text1.setStrikethrough(true);
        text1.setUnderline(true);
        return text1; 
    }
     ImageView createImageView(){
        
    Image image = new Image(imageURL, 200, 200, true, true);
    ImageView imageView = new ImageView (image);
            return imageView;
     }
   ImageView createImageFromPath() throws FileNotFoundException {
   InputStream in = new FileInputStream("C:\\Users\\Mark\\Desktop\\work training\\Fiber\\Nokia Fiber");
       Image image = new Image(in, 400, 400, true, true ); 
       ImageView imageView = new ImageView(image);
     
       return imageView;
   }
    @Override
    public void start(Stage primaryStage) {
    VBox vboxPane = new VBox (10);
    vboxPane.setPadding(new Insets(10));
    vboxPane.setAlignment(Pos.CENTER);
    vboxPane.setStyle("-fs-background-color: red");
      /*  Pane pane = new Pane();
     pane.setPadding(new Insets(5));
        createText(); */
      
        // add first component
        vboxPane.getChildren().add(createText());
        /* pane.getChildren().add(createText()); */
        
        // add second component 
        HBox hboxPane = new HBox();
        hboxPane.setPadding(new Insets(20));
        hboxPane
        
        
       /* pane.getChildren().add(createImageFromPath()); */
        
        
        Scene scene = new Scene (pane, 300, 300);
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
