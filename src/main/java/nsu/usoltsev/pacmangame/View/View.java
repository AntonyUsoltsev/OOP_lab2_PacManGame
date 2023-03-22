package nsu.usoltsev.pacmangame.View;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.attribute.GroupPrincipal;

public class View {
    static Image icon;
    private Scene scene;

    private Group root;

    public View() {
        File iconFile = new File("./src/main/resources/pictures/PacmanRight.png");
        icon = new Image(iconFile.toURI().toString());
    }

    public Scene getScene() {
        return scene;
    }

    public Group getRoot() {
        return root;
    }

    private Line createBorder(int startX, int startY, int endX, int endY, int widht, Color color ){
        Line border = new Line(startX,startY,endX,endY);
        border.setStroke(color);
        border.setStrokeWidth(widht);
        return border;
    }
    private void drawBorders(Group root){
        root.getChildren().add(createBorder(0,0,0,200,30, Color.RED));
        root.getChildren().add(createBorder(0,0,600,0,30, Color.RED));
        root.getChildren().add(createBorder(600,0,600,200,30, Color.RED));
        root.getChildren().add(createBorder(600,400,600,600,30, Color.RED));
        root.getChildren().add(createBorder(0,600,600,600,30, Color.RED));
        root.getChildren().add(createBorder(0,400,0,600,30, Color.RED));
    }

    public void viewField(Stage stage) {
        root = new Group();
        stage.getIcons().add(icon);
        scene = new Scene(root, 600, 600);
        scene.setFill(Color.rgb(14, 0, 31));
        stage.setTitle("Pac Man");

        drawBorders(root);


//       ImageView pacMan = new ImageView();
//       pacMan.setFitWidth(imageRight.getWidth() * 0.05);
//       pacMan.setFitHeight(imageRight.getHeight() * 0.05);
//       pacMan.setX(250);
//       pacMan.setY(250);
//       pacMan.setImage(imageRight);
//       root.getChildren().add(pacMan);
        // scene = new Scene(root, 600, 600);

        //        stage.setWidth(700);
//        stage.setHeight(700);
        // stage.setResizable(false);

    }
}
