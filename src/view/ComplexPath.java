/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

/**
 *
 * @author luis.assulfi
 */
public class ComplexPath extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            //Cria um Path
            Path path = new Path();
            
            //Move para o ponto inicial
            MoveTo moveTo = new MoveTo(108, 71);
            
            //Cria as linhas
            LineTo line1 = new LineTo(321, 161);
            LineTo line2 = new LineTo(126, 232);
            LineTo line3 = new LineTo(232, 52);
            LineTo line4 = new LineTo(269, 250);
            LineTo line5 = new LineTo(108, 71);
            
            //Adiciona os elementos ao path
            path.getElements().add(moveTo);
            path.getElements().addAll(line1, line2, line3, line4, line5);
            
            //Cria um grupo
            Group root = new Group(path);
            
            //Cria uma scene
            Scene scene = new Scene(root, 600, 300);
            
            //Configura o primaryStage
            primaryStage.setTitle("Desenhos complexos");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
