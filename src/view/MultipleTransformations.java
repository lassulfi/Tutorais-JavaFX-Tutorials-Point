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
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

/**
 *
 * @author luis.assulfi
 */
public class MultipleTransformations extends Application {

    @Override
    public void start(Stage stage) {
    
        try {
            //Desenha um retangulo
            Rectangle rectangle = new Rectangle(50, 50, 100, 75);
            //Define a cor o retangulo
            rectangle.setFill(Color.BURLYWOOD);
            //Define a cor da borda do retangulo
            rectangle.setStroke(Color.BLACK);
            
            //Cria um objeto de rotação
            Rotate rotate = new Rotate();
            //define o angulo da rotação
            rotate.setAngle(20);
            //define o pivo da rotação
            rotate.setPivotX(150);
            rotate.setPivotY(225);
            
            //Cria um objeto com a escala de transformacao
            Scale scale = new Scale();
            //Define as dimensões da escala
            scale.setX(1.5);
            scale.setY(1.5);
            //Define o ponto de pivot da escala
            scale.setPivotX(300);
            scale.setPivotY(135);
            
            //Cria um objeto de translação
            Translate translate = new Translate();
            //define as coordenadas para aplicar a translação
            translate.setX(250);
            translate.setY(0);
            translate.setZ(0);
            
            //Aplica todas das transformacoes ao retangulo
            rectangle.getTransforms().addAll(rotate, scale, translate);
            
            Group root = new Group(rectangle);
            
            Scene scene = new Scene(root, 600, 300);
            
            stage.setTitle("Transformações multiplas");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
