package com.gazeboindustries.questionsgame.com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class SceneBase {
    Parent sceneXML;
    Scene scene;

    public SceneBase(Parent xml){
        this.sceneXML = xml;
    }

    public Scene getScene(){
        this.scene = new Scene(this.sceneXML);
        return this.scene;
    }
}