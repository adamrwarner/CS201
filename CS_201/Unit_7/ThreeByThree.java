package Unit_7;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ThreeByThree extends Application {

	public static void main(String[] args) {
	    launch(args);
	  }
	
	public void start(Stage primaryStage) {           	
       
    Line horizontal1 = new Line(); 
    Line horizontal2 = new Line();
    Line verical1 = new Line();
    Line verical2 = new Line();
    Pane grid = new Pane();
    
    horizontal1.startYProperty().bind(grid.heightProperty().divide(3));
    horizontal2.startYProperty().bind(grid.heightProperty().multiply(2).divide(3));
    verical1.startXProperty().bind(grid.widthProperty().divide(3));
    verical2.startXProperty().bind(grid.widthProperty().multiply(2).divide(3));
        
    horizontal1.endXProperty().bind(grid.widthProperty());
    horizontal2.endXProperty().bind(grid.widthProperty());
    verical1.endXProperty().bind(grid.widthProperty().divide(3));
    verical2.endXProperty().bind(grid.widthProperty().multiply(2).divide(3));
    
    horizontal1.endYProperty().bind(grid.heightProperty().divide(3));
    horizontal2.endYProperty().bind(grid.heightProperty().multiply(2).divide(3));
    verical1.endYProperty().bind(grid.heightProperty());
    verical2.endYProperty().bind(grid.heightProperty());
    
    horizontal1.setStroke(Color.BLUE);                     
    horizontal2.setStroke(Color.BLUE);                
    verical1.setStroke(Color.RED);
    verical2.setStroke(Color.RED);    
    
    grid.getChildren().addAll(horizontal1, horizontal2, verical1, verical2);

    Scene window = new Scene(grid, 300, 300);
    primaryStage.setTitle("3x3 Grid"); 
    primaryStage.setScene(window);
    primaryStage.show();
  }  
} 
