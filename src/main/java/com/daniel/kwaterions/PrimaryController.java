package com.daniel.kwaterions;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws Exception {
        Kwaterions.setRoot("secondary");
    }
}
