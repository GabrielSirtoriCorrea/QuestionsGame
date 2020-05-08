package com.gazeboindustries.questionsgame.com;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    private static Stage Primarystage;

    @Override
    public void start(Stage stage) throws Exception {
        Primarystage = stage;

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MenuScene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Primarystage.setTitle("Questions Game");
        Primarystage.setScene(scene);
        
        Primarystage.show();
    }

    public static void ChangeScene(Scene scene) {
        Primarystage.setScene(scene);
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


}


