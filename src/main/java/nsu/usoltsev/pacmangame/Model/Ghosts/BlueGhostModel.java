package nsu.usoltsev.pacmangame.Model.Ghosts;

import javafx.scene.Group;
import nsu.usoltsev.pacmangame.View.Ghosts.BlueGhostView;

public class BlueGhostModel extends GhostModel {

    public BlueGhostModel(Group root){
        ghostView = new BlueGhostView(root);
        xPosition = 24;
        yPosition = 24;
        xVelocity = 0;
        yVelocity = 0;
        nextDirection = "RIGHT";
    }
}
