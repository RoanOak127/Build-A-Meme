package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
 * Known Issues: none?
 */
public class Crl_KillHannibal {
	@FXML
	public TextField input1; //what's to be put in the Hannibal text area
	public TextField input2; //what's to be put in the Andre text area
	public TextField input3; //what's to be put in the Bottom text area
	public Label view1; //displays what's in Hannibal textfield
	public Label view2; //displays what's in the Andre textfield
	public Label view3; //displays what's in the bottom textfield
	
	/*
	 * set's the top display text to whatever's in the input textfield
	 */
	@FXML
	public void PressButton1(ActionEvent e){
		view1.setText(input1.getText());
		view2.setText(input2.getText());
		view3.setText(input3.getText());
	}

}
