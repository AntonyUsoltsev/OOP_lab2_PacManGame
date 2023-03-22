package nsu.usoltsev.pacmangame.Control;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import nsu.usoltsev.pacmangame.Ghost;
import nsu.usoltsev.pacmangame.Model.PacManModel;

public class PacManController {

    PacManModel pacManModel;

    public PacManController(Group root) {
        pacManModel = new PacManModel(0, 0, 250, 250, "RIGHT", root);
    }

    public void control(Scene scene) {
        scene.setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.RIGHT) {
                pacManModel.setxVelocity(2);
                pacManModel.setyVelocity(0);
                pacManModel.setDirection("RIGHT");
                System.out.println(pacManModel.getxPosition());
            } else if (event.getCode() == KeyCode.LEFT) {
                pacManModel.setxVelocity(-2);
                pacManModel.setyVelocity(0);
                pacManModel.setDirection("LEFT");
                System.out.println(pacManModel.getxPosition());
            } else if (event.getCode() == KeyCode.UP) {
                pacManModel.setxVelocity(0);
                pacManModel.setyVelocity(-2);
                pacManModel.setDirection("UP");
                System.out.println(pacManModel.getyPosition());
            } else if (event.getCode() == KeyCode.DOWN) {
                pacManModel.setxVelocity(0);
                pacManModel.setyVelocity(2);
                pacManModel.setDirection("DOWN");
                System.out.println(pacManModel.getyPosition());
            } else if (event.getCode() == KeyCode.SPACE) {
                pacManModel.setxVelocity(0);
                pacManModel.setyVelocity(0);
                System.out.println(pacManModel.getxPosition());
                System.out.println(pacManModel.getyPosition());
            }

        });

        pacManModel.movement();

    }

}
