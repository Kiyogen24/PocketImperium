package pimperium.views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import pimperium.controllers.GameController;
import java.util.ArrayList;
import java.util.List;

public class PlayerNamesView {
    private GameController controller;
    private VBox root;
    private List<TextField> nameFields;
    private int humanPlayerCount;

    // Constructor to initialize the view with the game controller and number of human players
    public PlayerNamesView(GameController controller, int humanPlayerCount) {
        this.controller = controller;
        this.humanPlayerCount = humanPlayerCount;
        createView();
    }

    // Method to create the view layout and components
    private void createView() {
        // Set background image
        BackgroundImage backgroundImage = new BackgroundImage(
                new Image("file:assets/background.png", 600, 400, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, BackgroundSize.DEFAULT);

        // Initialize root VBox with spacing and alignment
        root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setBackground(new Background(backgroundImage));

        // Create and style the title text
        Text title = new Text("Pocket Imperium");
        title.setFont(Font.font("Verdana", 40));
        title.setStyle("-fx-fill: white; -fx-effect: dropshadow(one-pass-box, black, 5, 0, 2, 2);");

        nameFields = new ArrayList<>();

        // VBox to hold the player name fields
        VBox fieldsBox = new VBox(15);
        fieldsBox.setAlignment(Pos.CENTER);

        // Create labels and text fields for each player
        for (int i = 1; i <= humanPlayerCount; i++) {
            Label nameLabel = new Label("Pseudo du joueur " + i + " :");
            nameLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
            TextField nameField = new TextField();
            nameField.setMaxWidth(200);
            nameField.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-text-fill: black;");
            nameFields.add(nameField);
            fieldsBox.getChildren().addAll(nameLabel, nameField);
        }

        // Create and style the start button
        Button startButton = new Button("Lancer la Partie");
        startButton.setStyle("-fx-background-color: rgba(255, 255, 255, 0.3);"
                + "-fx-text-fill: white;"
                + "-fx-font-size: 18px;"
                + "-fx-font-weight: bold;"
                + "-fx-background-radius: 10;");
        startButton.setOnAction(event -> controller.startGameWithPlayers(getPlayerNames()));

        // Add all components to the root VBox
        root.getChildren().addAll(title, fieldsBox, startButton);
        root.setPadding(new Insets(50));
        root.setSpacing(30);
    }

    // Method to get the player names from the text fields
    private List<String> getPlayerNames() {
        List<String> names = new ArrayList<>();
        for (TextField field : nameFields) {
            names.add(field.getText());
        }
        return names;
    }

    // Method to get the root VBox
    public VBox getRoot() {
        return root;
    }
}