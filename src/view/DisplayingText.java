/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author luis.assulfi
 */
public class DisplayingText extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            //Criar um objeto de Texto
            Text text = new Text();
            //Define a fonte para o texto
            text.setFont(new Font(45));
            //Define a posição do texto
            text.setX(50);
            text.setY(150);
            //Define o texto
            text.setText("Welcome to Tutorialspoint");
            
            //Cria um grupo
            Group root = new Group();
            
            ObservableList list = root.getChildren();
            
            list.add(text);
            
            Scene scene = new Scene(root, 600, 300);
            
            primaryStage.setTitle("Exibindo um texto");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
