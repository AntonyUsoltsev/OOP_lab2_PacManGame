package nsu.usoltsev.pacmangame.Model;

public class DotModel {

    public DotModel() {
        for (int i = 0; i < Matrix.CELL_COUNT; i++) {
            for (int j = 0; j < Matrix.CELL_COUNT; j++) {
                if (Matrix.matrix[i][j] == 0) {
                    Matrix.matrix[i][j] = 2;
                }
            }
        }
    }

}
