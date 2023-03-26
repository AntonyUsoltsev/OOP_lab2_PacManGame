package nsu.usoltsev.pacmangame.View;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import nsu.usoltsev.pacmangame.Model.Matrix;

import java.util.HashMap;
import java.util.LinkedList;

public class DotView {

    HashMap<Integer, Rectangle> dotList;
    Group root;

    public DotView(Group root) {
        this.root = root;
        dotList=new HashMap<>();
    }

    public void appendToDotList(int x, int y) {
        Rectangle dot = new Rectangle(Matrix.CELL_SIZE / 4, Matrix.CELL_SIZE / 4);
        dot.setFill(Color.WHITE);
        //dot.setStroke(Color.WHITE);
        dot.setX(x * Matrix.CELL_SIZE + (Matrix.CELL_SIZE - Matrix.CELL_SIZE / 4) / 2);
        dot.setY(y * Matrix.CELL_SIZE + (Matrix.CELL_SIZE - Matrix.CELL_SIZE / 4) / 2);
        dotList.put(y * Matrix.CELL_X_COUNT + x, dot);
        root.getChildren().add(dot);
    }

    public void removeFromDotList(int x, int y) {
        root.getChildren().remove( dotList.get(y * Matrix.CELL_X_COUNT + x));
        dotList.remove(y * Matrix.CELL_X_COUNT + x);
        if (dotList.isEmpty()){
            Text win = new Text("YOU WIN");
            win.setFill(Color.WHITE);
            win.setX(200);
            win.setY(370);
            win.setStroke(Color.YELLOW);
            win.setStrokeWidth(5);
            win.setFont(new Font(70));
            root.getChildren().add(win);
        }
    }


}
