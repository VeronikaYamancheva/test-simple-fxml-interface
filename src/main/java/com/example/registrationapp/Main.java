package com.example.registrationapp;

import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public static void main(String[] args) {
        Application.launch(new String[0]);
    }

    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Registration");
        InputStream iconStream = this.getClass().getResourceAsStream("/images/iconForRegistrationApp.png");
        if (iconStream != null) {
            Image image = new Image(iconStream);
            primaryStage.getIcons().add(image);
        } else {
            System.out.println("Не удалось загрузить иконку.");
        }

        primaryStage.setHeight(400.0);
        primaryStage.setWidth(600.0);
        primaryStage.centerOnScreen();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("main-view.fxml"));
        primaryStage.setScene(new Scene((Parent)loader.load()));
        primaryStage.show();
    }
}
