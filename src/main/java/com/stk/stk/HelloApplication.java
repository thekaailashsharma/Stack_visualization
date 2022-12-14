package com.stk.stk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("log.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 764, 446);
//        Scene scene = new Scene(fxmlLoader.load(), 800, 465);
        stage.setTitle("Data Structure Visualization!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(e -> {
            System.out.println("Bubbye");
        });
    }

    public static void main(String[] args) {
        launch();
    }
}