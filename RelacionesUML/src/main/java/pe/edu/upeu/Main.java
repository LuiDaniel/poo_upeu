package pe.edu.upeu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(new Label("Hola POO"));
        stage.setScene(new Scene(root, 400, 300));
        stage.setTitle("RelacionesUML");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
