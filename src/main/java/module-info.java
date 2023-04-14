module nsu.usoltsev.pacmangame {
    requires javafx.controls;
    requires javafx.fxml;


    opens nsu.usoltsev.pacmangame to javafx.fxml;
    exports nsu.usoltsev.pacmangame;

}