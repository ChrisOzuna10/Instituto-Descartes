package org.ozuna.chris.instituto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.ozuna.chris.instituto.Models.InstitutoDescartes;

import java.io.IOException;

public class App extends Application {

    private static InstitutoDescartes institutoDescartes = new InstitutoDescartes();

    public static InstitutoDescartes getInstitutoDescartes() {
        return institutoDescartes;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Menu.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Instituto Descartes");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    public static void nuevaVentana(MouseEvent event, String fxmlFile, String stageTitle) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxmlFile + ".fxml"));

        try {
            Pane root = fxmlLoader.load();
            Scene scene = new Scene(root);
            stage.setTitle(stageTitle);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();stage.close();
    }
    public static void main(String[] args) {
        launch();
    }
}