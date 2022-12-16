package it.unito.clientzmail;

import it.unito.clientzmail.model.Email;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.*;

public class ClientZmailApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader FmlxLoader = new FXMLLoader(ClientZmailApp.class.getResource("client-zmail-view.fxml"));
        Scene scene = new Scene(FmlxLoader.load(), 700, 500);
        primaryStage.setTitle("Zmail");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch();
        Email prima_emails = new Email("Giorgio", "Zakaria", "RISULTATO", "Ilò Risultato della prova sostenuto è 400");
    }
}

