package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
 * Known Issues: none?
 * TODO: change font to be better, probably add a copyright for the bee movie script
 */
public class Controller_ChMnd {
	@FXML
	public TextField input; //what's to be put in the text area
	public Label view; //displays what's in the textfield
	
	/*
	 * set's the display text to whatever's in the input textfield
	 */
	@FXML
	public void PressButton(ActionEvent e){
		view.setText(input.getText());
	}

}
