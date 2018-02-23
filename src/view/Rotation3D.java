/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

/**
 *
 * @author luis.assulfi
 */
public class Rotation3D extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            
            //Desenhando um cubo
            Box box = new Box();
            //Propriedades do cubo
            box.setWidth(150.0);
            box.setHeight(150.0);
            box.setDepth(150.0);
            
            //Cria a translação do cubo
            Translate translate = new Translate();
            translate.setX(400);
            translate.setY(150);
            translate.setZ(25);
            
            //Cria as rotações
            Rotate rxBox = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
            Rotate ryBox = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
            Rotate rzBox = new Rotate(0, 0, 0, 0, Rotate.Z_AXIS);
            rxBox.setAngle(30);
            ryBox.setAngle(30);
            rxBox.setAngle(30);
            box.getTransforms().addAll(translate, rxBox, ryBox, rzBox);
            
            Group root = new Group(box);
            
            Scene scene = new Scene(root, 600, 300);
            
            primaryStage.setTitle("Desenhando um cubo");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
