package nsu.usoltsev.pacmangame;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;

import java.io.File;
import java.io.IOException;


public class Application extends javafx.application.Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws IOException {

        //Field.setField(stage);
//        InputStream iconStream = Application.class.getResourceAsStream("/PacmanRight.png");
//        assert iconStream != null;
//        Image image = new Image(iconStream);
//        stage.getIcons().add(image);
        ImageView pacMan = new ImageView();
        File file = new File("./src/main/resources/pictures/PacmanRight.png");
        Image image = new Image(file.toURI().toString());
        stage.getIcons().add(image);
        pacMan.setFitWidth(image.getWidth() * 0.1);
        pacMan.setFitHeight(image.getHeight() * 0.1);
        pacMan.setX(100);
        pacMan.setX(100);
        pacMan.setImage(image);
         Group root = new Group();
       // StackPane root = new StackPane();
        root.getChildren().add(pacMan);
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello");
//        stage.setScene(scene);
//        stage.show();
        Text text = new Text("Hello METANIT.COM!");
        text.setY(80);    // установка положения надписи по оси Y
        text.setX(80);   // установка положения надписи по оси X
        text.setFill(Color.rgb(140,36,200));


        root.getChildren().add(text);
        Scene scene = new Scene(root,600,600);
        //Group group = new Group(text);

         //scene = new Scene(group,10,10);
        // Устанавливаем цвет фона сцены
        //scene.setFill(Color.color(0.35,0.00,0.4));
        scene.setFill(Color.rgb(14,0,31));
        stage.setScene(scene);
        stage.setTitle("Pac Man");
//        stage.setWidth(700);
//        stage.setHeight(700);
        stage.setResizable(false);
        stage.show();
    }

}