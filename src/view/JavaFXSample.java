/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author luis.assulfi
 */
public class JavaFXSample extends Application {
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
        try {
            Group group = new Group();
            
            Scene scene = new Scene(group, 600, 300);
            scene.setFill(Color.BROWN);
            
            primaryStage.setTitle("Sample Application");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
        }
    }
}
