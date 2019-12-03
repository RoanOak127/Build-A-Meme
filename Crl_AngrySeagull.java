package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
 * Known Issues: none?
 */
public class Crl_AngrySeagull {
	@FXML
	public TextField input1; //what's to be put in the 1 text area
	public TextField input2; //what's to be put in the 2 text area
	public TextField input3; //what's to be put in the 3 text area
	public TextField input4; //what's to be put in the 4 text area
	public Label view1; //displays what's in the 1 textfield
	public Label view2; //displays what's in the 2 textfield
	public Label view3; //displays what's in the 3 textfield
	public Label view4; //displays what's in the 4 textfield
	
	/*
	 * set's the top display text to whatever's in the input textfield
	 */
	@FXML
	public void PressButton1(ActionEvent e){
		view1.setText(input1.getText());
		view2.setText(input2.getText());
		view3.setText(input3.getText());
		view4.setText(input4.getText());
	}

}
