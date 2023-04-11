package nsu.usoltsev.pacmangame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import nsu.usoltsev.pacmangame.Control.PacManController;
import nsu.usoltsev.pacmangame.Model.*;
import nsu.usoltsev.pacmangame.View.WindowView;

import java.io.File;

public class Main extends javafx.application.Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) {
        //boolean start = false;
        //TODO: field model, ghost model
        Group root = new Group();
        Scene scene = new Scene(root, Matrix.CELL_SIZE * Matrix.CELL_X_COUNT, Matrix.CELL_SIZE * Matrix.CELL_Y_COUNT);
        WindowView.setWindowOptions(stage, scene);

        Button startBtn = new Button();
        WindowView.startView(root,startBtn);

        startBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                startBtn.setVisible(false);

                FieldModel.viewField(root);

                DotModel.setDots(root);

                PacManController pacManController = new PacManController(root);

                pacManController.control(scene);

            }

        });
        stage.setScene(scene);
        stage.show();
    }

}