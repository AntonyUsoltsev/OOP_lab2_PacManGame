package nsu.usoltsev.pacmangame.Model.Ghosts;

import javafx.scene.Group;
import nsu.usoltsev.pacmangame.View.Ghosts.YellowGhostView;

public class YellowGhostModel extends GhostModel {
    //648
    public YellowGhostModel(Group root){
        ghostView = new YellowGhostView(root);
        xPosition = 624;
        yPosition = 24;
        xVelocity = 0;
        yVelocity = 0;
        nextDirection = "LEFT";
    }
}
