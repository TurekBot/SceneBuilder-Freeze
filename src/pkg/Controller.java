package pkg;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField textField;

    @FXML
    private void initialize() {
        for (int i = 0; i < 5; i++) {
            comboBox.getItems().add("Item " + i);
        }

    }

}
