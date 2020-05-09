package com.gazeboindustries.questionsgame.com;

import java.io.File;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class QuestionController implements Initializable{
    @FXML
    private ImageView imgQuestion;
    @FXML
    private Label lblSchoolSubject;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        DataBaseConnection connection = new DataBaseConnection();
        String[] response = connection.getQuestion();

        lblSchoolSubject.setText(response[1]);
        System.out.println(response[1]);

        File file = new File(response[2]);
        System.out.println(file.toURI().toString());
        Image img = new Image(file.toURI().toString());
        imgQuestion.setImage(img);
    
    }
    
}