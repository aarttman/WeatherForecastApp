package controller;

import api.CoordinateService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import model.WeatherObject;
import parser.WeatherParser;
import service.WeatherService;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.net.URL;

public class WeatherController {

    @FXML protected void handleSearchAgainButtonAction(ActionEvent event) {
        System.out.println("hello world");
    }
}
