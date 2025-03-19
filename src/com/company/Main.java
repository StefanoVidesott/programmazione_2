package com.company;

import data.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map mappa = new Map(32, 8);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mappa iniziale:");
        mappa.displayOnOut();

        for (int i = 0; i < 3; i++) {
            System.out.print("Inserisci riga: ");
            int row = scanner.nextInt();

            System.out.print("Inserisci colonna: ");
            int col = scanner.nextInt();

            mappa.insertAtCoords(row, col);
            mappa.displayOnOut();
        }

        scanner.close();
    }
}


//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Button button = new Button("Say Hello World!");
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hello World!");
//            }
//        });
//
//        StackPane root = new StackPane(button);
//
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }
//}

