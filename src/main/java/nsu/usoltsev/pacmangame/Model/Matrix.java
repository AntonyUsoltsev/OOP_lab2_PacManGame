package nsu.usoltsev.pacmangame.Model;

import nsu.usoltsev.pacmangame.View.FieldView;

public class Matrix {
    public static final int CELL_SIZE = 30;
    public static final int CELL_COUNT = 20;
    public static int[][] matrix = new int[CELL_COUNT][CELL_COUNT];

    static {
        for (int i = 0; i < CELL_COUNT; i++) {
            matrix[i][0] = 1;
            matrix[i][19] = 1;
            matrix[0][i] = 1;
            matrix[19][i] = 1;
         }

    }

    public int[][] getMatrix() {
        return matrix;
    }

    //Coord of borders?

}
