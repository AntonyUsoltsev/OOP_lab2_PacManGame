package nsu.usoltsev.pacmangame.View;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import nsu.usoltsev.pacmangame.Model.Matrix;

import java.io.File;

public class PacManView {
    static Image imageRight;
    static Image imageLeft;
    static Image imageUp;
    static Image imageDown;
    static Image imageRightClosed;
    static Image imageLeftClosed;
    static Image imageUpClosed;
    static Image imageDownClosed;
    ImageView pacMan;
    Text score;
    boolean isClosed = true;
    int i = 0;

    public PacManView(Group root) {

        File pacmanRight = new File("./src/main/resources/pictures/PacmanRight.png");
        File pacmanLeft = new File("./src/main/resources/pictures/PacmanLeft.png");
        File pacmanUp = new File("./src/main/resources/pictures/PacmanUp.png");
        File pacmanDown = new File("./src/main/resources/pictures/PacmanDown.png");

        imageRight = new Image(pacmanRight.toURI().toString());
        imageLeft = new Image(pacmanLeft.toURI().toString());
        imageUp = new Image(pacmanUp.toURI().toString());
        imageDown = new Image(pacmanDown.toURI().toString());

        File pacmanRightClosed = new File("./src/main/resources/pictures/PacmanRightClosed.png");
        File pacmanLeftClosed = new File("./src/main/resources/pictures/PacmanLeftClosed.png");
        File pacmanUpClosed = new File("./src/main/resources/pictures/PacmanUpClosed.png");
        File pacmanDownClosed = new File("./src/main/resources/pictures/PacmanDownClosed.png");

        imageRightClosed = new Image(pacmanRightClosed.toURI().toString());
        imageLeftClosed = new Image(pacmanLeftClosed.toURI().toString());
        imageUpClosed = new Image(pacmanUpClosed.toURI().toString());
        imageDownClosed = new Image(pacmanDownClosed.toURI().toString());

        pacMan = new ImageView();
        root.getChildren().add(pacMan);
        score= new Text();
        score.setX(20);
        score.setY(20);
        score.setFill(Color.YELLOW);
        score.setFont(new Font(20));
        root.getChildren().add(score);
    }

    void setImage(Image image, Image imageClosed) {
        if (i < 10) {
            pacMan.setImage(image);
            i++;
        } else if (i > 20) {
            i = 0;
        } else {
            pacMan.setImage(imageClosed);
            isClosed = false;
            i++;
        }
    }

    public void viewPacMan(int xPosition, int yPosition, String direction, int score) {
        switch (direction) {
            case "RIGHT" -> {
                setImage(imageRight, imageRightClosed);
            }
            case "LEFT" -> {
                setImage(imageLeft, imageLeftClosed);
            }
            case "UP" -> {
                setImage(imageUp, imageUpClosed);
            }
            case "DOWN" -> {
                setImage(imageDown, imageDownClosed);
            }
        }
        pacMan.setFitWidth(Matrix.CELL_SIZE);
        pacMan.setFitHeight(Matrix.CELL_SIZE);
        pacMan.setX(xPosition);
        pacMan.setY(yPosition);
        this.score.setText(Integer.toString(score));
    }
}
