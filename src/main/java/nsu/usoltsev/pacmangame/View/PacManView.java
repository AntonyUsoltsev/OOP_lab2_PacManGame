package nsu.usoltsev.pacmangame.View;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class PacManView {
    static Image imageRight;
    static Image imageLeft;
    static Image imageUp;
    static Image imageDown;
    ImageView pacMan;

    public PacManView(Group root) {

        File pacmanRight = new File("./src/main/resources/pictures/PacmanRight.png");
        File pacmanLeft = new File("./src/main/resources/pictures/PacmanLeft.png");
        File pacmanUp = new File("./src/main/resources/pictures/PacmanUp.png");
        File pacmanDown = new File("./src/main/resources/pictures/PacmanDown.png");
        imageRight = new Image(pacmanRight.toURI().toString());
        imageLeft = new Image(pacmanLeft.toURI().toString());
        imageUp = new Image(pacmanUp.toURI().toString());
        imageDown = new Image(pacmanDown.toURI().toString());

        pacMan = new ImageView();
        root.getChildren().add(pacMan);
    }

    public void viewPacMan(int xPosition, int yPosition, String direction) {
        switch (direction) {
            case "RIGHT" -> {
                pacMan.setFitWidth(imageRight.getWidth() * 0.05);
                pacMan.setFitHeight(imageRight.getHeight() * 0.05);
                pacMan.setImage(imageRight);
            }
            case "LEFT" -> {
                pacMan.setFitWidth(imageLeft.getWidth() * 0.05);
                pacMan.setFitHeight(imageLeft.getHeight() * 0.05);
                pacMan.setImage(imageLeft);
            }
            case "UP" -> {
                pacMan.setFitWidth(imageUp.getWidth() * 0.05);
                pacMan.setFitHeight(imageUp.getHeight() * 0.05);
                pacMan.setImage(imageUp);
            }
            case "DOWN" -> {
                pacMan.setFitWidth(imageDown.getWidth() * 0.05);
                pacMan.setFitHeight(imageDown.getHeight() * 0.05);
                pacMan.setImage(imageDown);
            }
        }
        pacMan.setX(xPosition);
        pacMan.setY(yPosition);


    }


}
