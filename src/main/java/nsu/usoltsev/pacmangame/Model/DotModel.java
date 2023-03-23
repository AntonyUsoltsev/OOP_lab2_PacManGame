package nsu.usoltsev.pacmangame.Model;

import javafx.scene.Group;
import nsu.usoltsev.pacmangame.View.DotView;

public class DotModel {
    static DotView dotView;

    public static void setDots(Group root) {
        dotView = new DotView(root);

        for (int i = 0; i < Matrix.CELL_X_COUNT; i++) {
            for (int j = 0; j < Matrix.CELL_Y_COUNT; j++) {
                if (Matrix.matrix[i][j] == 0) {
                    Matrix.matrix[i][j] = 2;
                    dotView.appendToDotList(i, j);
                }
            }
        }
    }

    public static void removeDot(int xPos, int yPos) {
        Matrix.matrix[xPos][yPos] = 0;
        dotView.removeFromDotList(xPos, yPos);
    }


}
