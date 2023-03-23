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
                if ( pacManModel.getyPosition() % Matrix.CELL_SIZE == 0) {
                    pacManModel.setxVelocity(2);
                    pacManModel.setyVelocity(0);
                    pacManModel.setDirection("RIGHT");
                   // System.out.println(pacManModel.getxPosition());
                }
            } else if (event.getCode() == KeyCode.LEFT) {
                if (pacManModel.getyPosition() % Matrix.CELL_SIZE == 0) {
                    pacManModel.setxVelocity(-2);
                    pacManModel.setyVelocity(0);
                    pacManModel.setDirection("LEFT");
                    //System.out.println(pacManModel.getxPosition());
                }
            } else if (event.getCode() == KeyCode.UP) {
                if (pacManModel.getxPosition() % Matrix.CELL_SIZE == 0) {
                    pacManModel.setxVelocity(0);
                    pacManModel.setyVelocity(-2);
                    pacManModel.setDirection("UP");
                    //System.out.println(pacManModel.getyPosition());
                }
            } else if (event.getCode() == KeyCode.DOWN) {
                if (pacManModel.getxPosition() % Matrix.CELL_SIZE == 0 ) {
                    pacManModel.setxVelocity(0);
                    pacManModel.setyVelocity(2);
                    pacManModel.setDirection("DOWN");
                   // System.out.println(pacManModel.getyPosition());
                }

            } else if (event.getCode() == KeyCode.SPACE) {
                if (pacManModel.getxPosition() % Matrix.CELL_SIZE == 0 && pacManModel.getyPosition() % Matrix.CELL_SIZE == 0) {
                    pacManModel.setxVelocity(0);
                    pacManModel.setyVelocity(0);
                    System.out.println(pacManModel.getxPosition());
                    System.out.println(pacManModel.getyPosition());
                }
            }

        });

        pacManModel.movement();

    }

}
