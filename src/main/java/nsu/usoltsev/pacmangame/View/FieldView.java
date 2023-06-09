package nsu.usoltsev.pacmangame.View;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import nsu.usoltsev.pacmangame.Model.*;

public class FieldView {
    public FieldView() {

    }

    private Rectangle createBorder(int x, int y, float offsetX, float offsetY) {
        Rectangle rect = new Rectangle(Matrix.CELL_SIZE/2 , Matrix.CELL_SIZE/2 );
        rect.setFill(Color.BLACK);
        rect.setStroke(Color.BLUE);
        rect.setX((x + offsetX) * Matrix.CELL_SIZE);
        rect.setY((y + offsetY) * Matrix.CELL_SIZE);
        return rect;
    }

    public void drawBorders(Group root, int[][] matrix) {
        for (int i = 0; i < Matrix.CELL_X_COUNT; i++) {
            for (int j = 0; j < Matrix.CELL_Y_COUNT; j++) {
                if (matrix[i][j] == 1) {
                    root.getChildren().add(createBorder(i, j, 0, 0));
                    root.getChildren().add(createBorder(i, j, 0.5f, 0));
                    root.getChildren().add(createBorder(i, j, 0, 0.5f));
                    root.getChildren().add(createBorder(i, j, 0.5f, 0.5f));
                }
            }
        }
    }


}
