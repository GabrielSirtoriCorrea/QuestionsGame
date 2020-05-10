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

public class QuestionController implements Initializable {
    @FXML
    private ImageView imgQuestion;
    @FXML
    private Label lblSchoolSubject;
    @FXML
    private Label lblCorrectResponses;
    @FXML
    private Label lblWrongResponses;

    static String[] response;
    DataBaseConnection connection;
    String AUDIO_URL;
    AudioClip clip;
    SceneBase refreshScene;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        

        connection = new DataBaseConnection();
        response = connection.getQuestion();

        lblSchoolSubject.setText(response[1]);
        System.out.println(response[1]);

        File file = new File(response[2]);
        System.out.println(file.toURI().toString());
        Image img = new Image(file.toURI().toString());
        imgQuestion.setImage(img);

        lblCorrectResponses.setText(Integer.toString(QuestionsControl.AnswersCorrect));
        lblWrongResponses.setText(Integer.toString(QuestionsControl.AnswersWrong));

    }

    @FXML
    private void btnResponseA(ActionEvent event) {
        checkButtonPressed("A");
    }

    @FXML
    private void btnResponseB(ActionEvent event) {
        checkButtonPressed("B");
    }

    @FXML
    private void btnResponseC(ActionEvent event) {
        checkButtonPressed("C");
    }

    @FXML
    private void btnResponseD(ActionEvent event) {
        checkButtonPressed("D");
    }

    @FXML
    private void btnResponseE(ActionEvent event) {
        checkButtonPressed("E");
    }

    private void checkButtonPressed(String letter) {
        if (response[3].equals(letter)) {
            AUDIO_URL = getClass().getResource("/Audio/POP.mp3").toString();
            clip = new AudioClip(AUDIO_URL);
            clip.play();

            QuestionsControl.addAnswerCorrect();

            try {
                SceneBase refreshScene = new SceneBase((Parent) FXMLLoader.load(getClass().getResource("/fxml/QuestionScene.fxml")));
                MainApp.ChangeScene(refreshScene.getScene());
            } catch (IOException ex) {
                // TODO Auto-generated catch block
                ex.printStackTrace();
            }

        } else {
            AUDIO_URL = getClass().getResource("/Audio/SOM ERRO EFEITO SONORO.mp3").toString();
            clip = new AudioClip(AUDIO_URL);
            clip.play();
            QuestionsControl.addAnswerWrong();

            //File fileResolve = new File(response[4]);
            //System.out.println(fileResolve.toURI().toString());
            //Image imgResolve = new Image("/GameImages/Answers/FisicaResposta1.jpg");
            //imgQuestion.setImage(imgResolve);
            
            try {
            SceneBase refreshScene = new SceneBase((Parent) FXMLLoader.load(getClass().getResource("/fxml/ResponseScene.fxml")));
            MainApp.ChangeScene(refreshScene.getScene());
        } catch (IOException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
           
        }


        

    }

}

