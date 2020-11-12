/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajsession2;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 *
 * @author Mark
 */
class myDrawingPane extends Pane {
    public myDrawingPane(){
        Line line1 = new Line (15, 15, 250, 250);
        Line line2 = new Line (250, 15, 15, 250);
        Circle circle = new Circle ( 50, 100, 25);
        this.getChildren().addAll(line1, line2, circle);
    }
}
