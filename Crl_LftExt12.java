package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/*
 * Known Issues: none?
 */
public class Crl_LftExt12 {
	@FXML
	public TextField input1; //what's to be put in the text area
	public Label view1; //displays what's in the textfield

	/*
	 * set's the display text to whatever's in the input textfield
	 */
	@FXML
	public void PressButton1(ActionEvent e){
		view1.setText(input1.getText());
		view1.setTextFill(Color.GHOSTWHITE);
	}

}
