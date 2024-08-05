package com.example.juego_mercado;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Mi primer programa en JavaFx: Josue Jahir Santiago Sanchez");
    }
}