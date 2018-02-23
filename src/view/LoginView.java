/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author luis.assulfi
 */
public class LoginView extends Application {
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            //Configurando a GridPane
            GridPane gridPane = new GridPane();
            gridPane.setAlignment(Pos.CENTER);
            gridPane.setPadding(new Insets(10));
            gridPane.setHgap(5);
            gridPane.setVgap(5);
            
            //Criando os Buttons
            Button loginButton = new Button("Login");
            Button cancelButton = new Button("Cancel");
            
            //Criando as textfields
            TextField usernameTextField = new TextField();
            PasswordField passwordTextField = new PasswordField();
            
            //Adicionado as componentes nas gridPane
            gridPane.add(new Label("Username"), 0, 0);
            gridPane.add(usernameTextField, 1, 0);
            gridPane.add(new Label("Senha"), 0, 1);
            gridPane.add(passwordTextField,1,1);
            gridPane.add(loginButton, 0, 2);
            gridPane.add(cancelButton, 1, 2);
            
            //Cria a scene
            Scene scene = new Scene(gridPane, 350, 200);
            
            //Configuracao do Stage
            primaryStage.setTitle("Login");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
        }
    }
    
}
