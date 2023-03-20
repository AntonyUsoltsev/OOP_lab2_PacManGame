package nsu.usoltsev.pacmangame;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;


public class Application extends javafx.application.Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        //Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        // BorderPane root = new BorderPane();

//        stage.setScene(scene);
//        stage.show();
//         scene.getStylesheets().add(getClass().getResource("hello-view.fxml"));
        Group root = new Group();

        File pacmanRight = new File("./src/main/resources/pictures/PacmanRight.png");
        File pacmanLeft = new File("./src/main/resources/pictures/PacmanLeft.png");
        File pacmanUp = new File("./src/main/resources/pictures/PacmanUp.png");
        File pacmanDown = new File("./src/main/resources/pictures/PacmanDown.png");
        Image imageRight = new Image(pacmanRight.toURI().toString());
        Image imageLeft = new Image(pacmanLeft.toURI().toString());
        Image imageUp = new Image(pacmanUp.toURI().toString());
        Image imageDown = new Image(pacmanDown.toURI().toString());
        stage.getIcons().add(imageRight);

        ImageView pacMan = new ImageView();
        pacMan.setFitWidth(imageRight.getWidth() * 0.1);
        pacMan.setFitHeight(imageRight.getHeight() * 0.1);
        pacMan.setX(100);
        pacMan.setX(100);
        pacMan.setImage(imageRight);
        root.getChildren().add(pacMan);

//        Text text = new Text("Hello!");
//        text.setY(250);    // установка положения надписи по оси Y
//        text.setX(250);   // установка положения надписи по оси X
//        text.setFill(Color.rgb(140, 36, 200));
//        text.setFont(Font.font("Verdana", 50));
//        root.getChildren().add(text);
//
//        Rectangle rect = new Rectangle(20, 300, 100, 100);
//
//        rect.setFill(Color.CORAL);
//        root.getChildren().add(rect);
//
//        Line line = new Line();
//        line.setStartX(200);
//        line.setStartY(0);
//        line.setEndX(500);
//        line.setEndY(200);
//        line.setStroke(Color.GOLD);
//        line.setStrokeWidth(5);
//        root.getChildren().add(line);


        Scene scene = new Scene(root, 600, 600);
        scene.setFill(Color.rgb(14, 0, 31));

        stage.setTitle("Pac Man");
//        stage.setWidth(700);
//        stage.setHeight(700);
        // stage.setResizable(false);
        int velosity = 1;
        boolean rightFlag = false, leftFlag = false, upFlag = false, downFlag = false;
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                if (event.getCode() == KeyCode.RIGHT) {
                    pacMan.setFitWidth(imageRight.getWidth() * 0.1);
                    pacMan.setFitHeight(imageRight.getHeight() * 0.1);
                    pacMan.setImage(imageRight);

                } else if (event.getCode() == KeyCode.LEFT) {
                    pacMan.setFitWidth(imageLeft.getWidth() * 0.1);
                    pacMan.setFitHeight(imageLeft.getHeight() * 0.1);
                    pacMan.setImage(imageLeft);
                    pacMan.setLayoutX(pacMan.getLayoutX() - 10);
                } else if (event.getCode() == KeyCode.UP) {
                    pacMan.setFitWidth(imageUp.getWidth() * 0.1);
                    pacMan.setFitHeight(imageUp.getHeight() * 0.1);
                    pacMan.setImage(imageUp);
                    pacMan.setLayoutY(pacMan.getLayoutY() - 10);
                } else if (event.getCode() == KeyCode.DOWN) {
                    pacMan.setFitWidth(imageDown.getWidth() * 0.1);
                    pacMan.setFitHeight(imageDown.getHeight() * 0.1);
                    pacMan.setImage(imageDown);
                    pacMan.setLayoutY(pacMan.getLayoutY() + 10);
                }
                pacMan.setLayoutX(pacMan.getLayoutX() + 10);
                pacMan.setLayoutY(pacMan.getLayoutY() + 10);
            }
        });

        stage.setScene(scene);
        stage.show();
//        int i = 100;
//        while (i<1000) {
//            pacMan.setLayoutX(i);
//            sleep(100);
//            System.out.println(i+" value");
//            i += 10;
//
//
//        }

    }

}