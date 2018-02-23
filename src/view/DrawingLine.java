/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author luis.assulfi
 */
public class DrawingLine extends Application {

    @Override
    public void start(Stage primaryStage) {
    
        try {
            //Cria uma linha
            Line line = new Line();
            line.setStartX(100);
            line.setStartY(150);
            line.setEndX(500);
            line.setEndY(150);
            
            Group root = new Group(line);
            
            Scene scene = new Scene(root, 600, 300);
            
            primaryStage.setTitle("Desenha linha");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
