package edu.cis232;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KMConvertController {

	private static final double KM_TO_MILES = 0.6214;
	
    @FXML
    private TextField txtKMInput;

    @FXML
    private Label lblMiles;

    @FXML
    void convertButtonListener(ActionEvent event) {
    	String input = txtKMInput.getText();
    	double kms = Double.parseDouble(input);
    	double miles = kms * KM_TO_MILES;
    	
    	lblMiles.setText(String.format("%.2f kms converts to %.2f miles", kms, miles));
    }

}
