package nsu.usoltsev.pacmangame;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import nsu.usoltsev.pacmangame.Control.PacManController;
import nsu.usoltsev.pacmangame.View.View;

import java.io.IOException;

import static java.lang.Thread.sleep;


public class Main extends javafx.application.Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        View view  = new View();
        view.viewField(stage);
        Scene scene = view.getScene();
        Group root = view.getRoot();
        PacManController pacManController = new PacManController(root);
        pacManController.control(scene);
        stage.setScene(scene);
        stage.show();
    }
}