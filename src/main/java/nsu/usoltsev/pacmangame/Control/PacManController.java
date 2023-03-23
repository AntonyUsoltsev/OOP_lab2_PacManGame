package nsu.usoltsev.pacmangame.Control;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import nsu.usoltsev.pacmangame.Model.Matrix;
import nsu.usoltsev.pacmangame.Model.PacManModel;

public class PacManController {

    PacManModel pacManModel;

    public PacManController(Group root) {
        pacManModel = new PacManModel(0, 0, 270, 270, "RIGHT", root);
    }

    public void control(Scene scene) {


        scene.setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.RIGHT) {
                pacManModel.setKeyPressed("RIGHT");
                pacManModel.setxVelocityChange(2);
                pacManModel.setyVelocityChange(0);
            } else if (event.getCode() == KeyCode.LEFT) {
                pacManModel.setKeyPressed("LEFT");
                pacManModel.setxVelocityChange(-2);
                pacManModel.setyVelocityChange(0);
            } else if (event.getCode() == KeyCode.UP) {
                pacManModel.setKeyPressed("UP");
                pacManModel.setxVelocityChange(0);
                pacManModel.setyVelocityChange(-2);
            } else if (event.getCode() == KeyCode.DOWN) {
                pacManModel.setKeyPressed("DOWN");
                pacManModel.setxVelocityChange(0);
                pacManModel.setyVelocityChange(2);
            } else if (event.getCode() == KeyCode.SPACE) {
                pacManModel.setxVelocityChange(0);
                pacManModel.setyVelocityChange(0);
            }
        });

        pacManModel.movement();

    }

}
