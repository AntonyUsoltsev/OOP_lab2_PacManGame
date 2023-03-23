package nsu.usoltsev.pacmangame;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import nsu.usoltsev.pacmangame.Control.PacManController;
import nsu.usoltsev.pacmangame.Model.FieldModel;
import nsu.usoltsev.pacmangame.View.WindowView;

public class Main extends javafx.application.Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        //TODO: field model, ghost model
        Group root = new Group();
        Scene scene = new Scene(root);

        WindowView.setWindowOptions(stage,scene);

        FieldModel fieldModel = new FieldModel();
        fieldModel.viewField(root);

        PacManController pacManController = new PacManController(root);
        pacManController.control(scene);

        stage.setScene(scene);
        stage.show();
    }

}