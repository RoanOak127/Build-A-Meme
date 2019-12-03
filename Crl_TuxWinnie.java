package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
 * Known Issues: none?
 */
public class Crl_TuxWinnie {
	@FXML
	public TextField input1; //what's to be put in the top text area
	public TextField input2; //what's to be put in the bottom text area
	public Label view1; //displays what's in the top textfield
	public Label view2; //displays what's in the bottom textfield
	
	/*
	 * set's the top display text to whatever's in the input textfield
	 */
	@FXML
	public void PressButton1(ActionEvent e){
		view1.setText(input1.getText());
		view2.setText(input2.getText());
	}

}
