package nsu.usoltsev.pacmangame.View;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import nsu.usoltsev.pacmangame.Model.Matrix;

public class FieldView {



    public FieldView() {

    }

    private Line createBorder(int startX, int startY, int endX, int endY, int widht, Color color) {
        Line border = new Line(startX, startY, endX, endY);
        border.setStroke(color);
        border.setStrokeWidth(widht);
        return border;
    }

    public void drawBorders(Group root, int[][] matrix) {

//
//        for (int row = 0; row < GRID_SIZE; row++) {
//            for (int col = 0; col < GRID_SIZE; col++) {
//                Rectangle rect = new Rectangle(CELL_SIZE, CELL_SIZE);
//                rect.setFill(Color.BLACK);
//                rect.setStroke(Color.WHITE);
//                grid.add(rect, col, row);
//            }
//        }


        for (int i = 0; i < Matrix.CELL_COUNT; i++) {
            for (int j = 0; j < Matrix.CELL_COUNT; j++) {
                if (matrix[i][j] == 1) {
                    Rectangle rect1 = new Rectangle(Matrix.CELL_SIZE/2, Matrix.CELL_SIZE/2);
                    Rectangle rect2 = new Rectangle(Matrix.CELL_SIZE/2, Matrix.CELL_SIZE/2);
                    Rectangle rect3 = new Rectangle(Matrix.CELL_SIZE/2, Matrix.CELL_SIZE/2);
                    Rectangle rect4 = new Rectangle(Matrix.CELL_SIZE/2, Matrix.CELL_SIZE/2);
                    rect1.setFill(Color.LIGHTBLUE);
                    rect1.setStroke(Color.WHITE);
                    rect1.setX(i*Matrix.CELL_SIZE);
                    rect1.setY(j*Matrix.CELL_SIZE);
                    root.getChildren().add(rect1);

                    rect2.setFill(Color.LIGHTBLUE);
                    rect2.setStroke(Color.WHITE);
                    rect2.setX((i+0.5)*Matrix.CELL_SIZE );
                    rect2.setY(j*Matrix.CELL_SIZE);
                    root.getChildren().add(rect2);

                    rect3.setFill(Color.LIGHTBLUE);
                    rect3.setStroke(Color.WHITE);
                    rect3.setX(i*Matrix.CELL_SIZE);
                    rect3.setY((j+0.5)*Matrix.CELL_SIZE);
                    root.getChildren().add(rect3);

                    rect4.setFill(Color.LIGHTBLUE);
                    rect4.setStroke(Color.WHITE);
                    rect4.setX((i+0.5)*Matrix.CELL_SIZE);
                    rect4.setY((j+0.5)*Matrix.CELL_SIZE);
                    root.getChildren().add(rect4);
                }
                if(matrix[i][j] == 2){
                    Rectangle dot = new Rectangle(Matrix.CELL_SIZE/4, Matrix.CELL_SIZE/4);
                    dot.setFill(Color.WHITE);
                    //dot.setStroke(Color.WHITE);
                    dot.setX(i*Matrix.CELL_SIZE + (Matrix.CELL_SIZE- Matrix.CELL_SIZE/4)/2 );
                    dot.setY(j*Matrix.CELL_SIZE + (Matrix.CELL_SIZE- Matrix.CELL_SIZE/4)/2);
                    root.getChildren().add(dot);
                }
            }

        }
//        root.getChildren().add(createBorder(0, 0, 0, 200, 30, Color.LIGHTBLUE));
//        root.getChildren().add(createBorder(0, 0, 600, 0, 30, Color.LIGHTBLUE));
//        root.getChildren().add(createBorder(600, 0, 600, 200, 30, Color.LIGHTBLUE));
//        root.getChildren().add(createBorder(600, 400, 600, 600, 30, Color.LIGHTBLUE));
//        root.getChildren().add(createBorder(0, 600, 600, 600, 30, Color.LIGHTBLUE));
//        root.getChildren().add(createBorder(0, 400, 0, 600, 30, Color.LIGHTBLUE));
    }


}
