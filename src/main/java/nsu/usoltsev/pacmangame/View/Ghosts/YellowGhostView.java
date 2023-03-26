package nsu.usoltsev.pacmangame.View.Ghosts;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class YellowGhostView extends GhostView {
    public YellowGhostView(Group root) {
        File yellowGhostFile = new File("./src/main/resources/pictures/YellowGhost.png");
        GhostImage = new Image(yellowGhostFile.toURI().toString());
        Ghost = new ImageView();
        root.getChildren().add(Ghost);
    }

}
