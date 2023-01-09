package com.daniel.kwaterions;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws Exception {
        Kwaterions.setRoot("primary");
    }
}