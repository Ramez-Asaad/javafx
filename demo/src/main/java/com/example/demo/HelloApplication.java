package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
//maraim test

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        System.out.println(scene.getWidth());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        System.out.println("ddd");
    }

    public static void main(String[] args) {
        launch();
    }
}