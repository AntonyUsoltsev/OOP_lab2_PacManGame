package nsu.usoltsev.pacmangame.Model;

import javafx.scene.Group;
import nsu.usoltsev.pacmangame.View.FieldView;

public class FieldModel {
    static FieldView fieldView;

    static {
        fieldView = new FieldView();
        Matrix.setMatrix();
    }

    public static void viewField(Group root) {
        fieldView.drawBorders(root, Matrix.matrix);
    }
}
