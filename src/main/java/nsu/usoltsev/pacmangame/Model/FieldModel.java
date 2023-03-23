package nsu.usoltsev.pacmangame.Model;

import javafx.scene.Group;
import nsu.usoltsev.pacmangame.View.FieldView;

public class FieldModel {
    FieldView fieldView;


    //Coord of borders?

    public FieldModel() {
        fieldView = new FieldView();

    }

    public void viewField(Group root) {
        fieldView.drawBorders(root,Matrix.matrix);
    }
}
