package nsu.usoltsev.pacmangame.Model;

import javafx.scene.Group;
import nsu.usoltsev.pacmangame.View.DotView;

public class DotModel {
    static DotView dotView;

    public static void setDots(Group root) {
        dotView = new DotView(root);

        for (int i = 0; i < Matrix.CELL_X_COUNT; i++) {
            for (int j = 0; j < Matrix.CELL_Y_COUNT; j++) {
                if (Matrix.matrix[i][j] == Matrix.EMPTY) {
                    Matrix.matrix[i][j] = Matrix.DOT;
                    Matrix.MAX_SCORE += Matrix.DOT_SCORE;
                    dotView.appendToDotList(i, j);
                }
            }
        }
        System.out.println(Matrix.MAX_SCORE);
    }

    public static void removeDot(int xPos, int yPos) {
        Matrix.matrix[xPos][yPos] = Matrix.EMPTY;
        dotView.removeFromDotList(xPos, yPos);
    }


}
