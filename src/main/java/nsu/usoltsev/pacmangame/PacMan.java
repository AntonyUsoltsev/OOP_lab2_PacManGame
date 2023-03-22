package nsu.usoltsev.pacmangame;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.File;

public class PacMan {

    static Image imageRight;
    static Image imageLeft;
    static Image imageUp;
    static Image imageDown;
    int xVelocity;
    int yVelocity;


    public PacMan(){
        File pacmanRight = new File("./src/main/resources/pictures/PacmanRight.png");
        File pacmanLeft = new File("./src/main/resources/pictures/PacmanLeft.png");
        File pacmanUp = new File("./src/main/resources/pictures/PacmanUp.png");
        File pacmanDown = new File("./src/main/resources/pictures/PacmanDown.png");
        imageRight = new Image(pacmanRight.toURI().toString());
        imageLeft = new Image(pacmanLeft.toURI().toString());
        imageUp = new Image(pacmanUp.toURI().toString());
        imageDown = new Image(pacmanDown.toURI().toString());
    }
    void viewPacman(Stage stage,Scene scene, Group root) {
     //   stage.getIcons().add(imageRight);
//        ImageView pacMan = new ImageView();
//        pacMan.setFitWidth(imageRight.getWidth() * 0.05);
//        pacMan.setFitHeight(imageRight.getHeight() * 0.05);
//        pacMan.setX(250);
//        pacMan.setY(250);
//        pacMan.setImage(imageRight);
//        root.getChildren().add(pacMan);
//        Scene scene = new Scene(root, 600, 600);
//
//        scene.setFill(Color.rgb(14, 0, 31));
//
//        stage.setTitle("Pac Man");
        //        stage.setWidth(700);
//        stage.setHeight(700);
        // stage.setResizable(false);
//        Line border1 = new Line(0,0,0,200);
//        border1.setStroke(Color.LIGHTBLUE);
//        border1.setStrokeWidth(30);
//        root.getChildren().add(border1);
//
//        Line border2 = new Line(0,0,600,0);
//        border2.setStroke(Color.LIGHTBLUE);
//        border2.setStrokeWidth(30);
//        root.getChildren().add(border2);
//
//        Line border3 = new Line(600,0,600,200);
//        border3.setStroke(Color.LIGHTBLUE);
//        border3.setStrokeWidth(30);
//        root2.getChildren().add(border3);
//
//        Line border4 = new Line(600,400,600,600);
//        border4.setStroke(Color.LIGHTBLUE);
//        border4.setStrokeWidth(30);
//        root.getChildren().add(border4);
//
//        Line border5 = new Line(0,600,600,600);
//        border5.setStroke(Color.LIGHTBLUE);
//        border5.setStrokeWidth(30);
//        root.getChildren().add(border5);
//
//        Line border6 = new Line(0,400,0,600);
//        border6.setStroke(Color.LIGHTBLUE);
//        border6.setStrokeWidth(30);
//        root.getChildren().add(border6);

//        AnimationTimer timer = new AnimationTimer() {
//            @Override
//            public void handle(long now) {
//
//                if(pacMan.getX() == 560 ){
//                    pacMan.setX(-20);
//                }
//                else if(pacMan.getX() < 10 && pacMan.getY()>10 && pacMan.getY()<200 && xVelocity<0){
//                    xVelocity = 0;
//                   // pacMan.setX(560);
//                }
//
//
//                if(pacMan.getY() == 560){
//                    pacMan.setY(-20);
//                }
//                else if(pacMan.getY() == -20){
//                    pacMan.setY(560);
//                }
//                pacMan.setX(  pacMan.getX() + xVelocity );
//                pacMan.setY(  pacMan.getY() + yVelocity );
//
//            }
//        };
//        timer.start();

        stage.setScene(scene);


        stage.show();
    }
}
