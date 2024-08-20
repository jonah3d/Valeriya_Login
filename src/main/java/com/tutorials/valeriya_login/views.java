package com.tutorials.valeriya_login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class views extends Application {  // Renamed to Views

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);


        stage.setResizable(false);
        stage.setTitle("Valeriya's Login Page");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
