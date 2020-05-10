package com.gazeboindustries.questionsgame.com;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class FXMLController implements Initializable {


    @FXML
    private void StartGame(ActionEvent event) {

        try {
            SceneBase QuestionScene = new SceneBase((Parent) FXMLLoader.load(getClass().getResource("/fxml/QuestionScene.fxml")));
            MainApp.ChangeScene(QuestionScene.getScene());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
