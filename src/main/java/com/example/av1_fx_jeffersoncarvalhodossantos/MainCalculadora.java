package com.example.av1_fx_jeffersoncarvalhodossantos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainCalculadora extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainCalculadora.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("JOECALK - Calculadora");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}