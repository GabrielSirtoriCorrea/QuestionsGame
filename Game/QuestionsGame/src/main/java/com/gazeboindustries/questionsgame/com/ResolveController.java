package com.gazeboindustries.questionsgame.com;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class ResolveController implements Initializable{

    @FXML
    private ImageView imgResolve;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
        File fileResolve = new File(QuestionController.response[4]);
        System.out.println(fileResolve.toURI().toString());
        Image Resolve = new Image(fileResolve.toURI().toString());
               

        imgResolve.setImage(Resolve);
    }

    @FXML
    private void nextQuestion(ActionEvent e){
        try {
            SceneBase refreshScene = new SceneBase((Parent) FXMLLoader.load(getClass().getResource("/fxml/QuestionScene.fxml")));
            MainApp.ChangeScene(refreshScene.getScene());
        } catch (IOException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
    }
    
}