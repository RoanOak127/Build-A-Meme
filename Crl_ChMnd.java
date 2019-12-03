package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*
 * Known Issues: none?
 * TODO: change font to be better, probably add a copyright for the bee movie script
 */
public class Crl_ChMnd {
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

	@FXML
	public void goBack (ActionEvent event)
	{
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("ViewMemeChooser.fxml"));
			Parent test = loader.load();
			Scene test_Scene = new Scene(test);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(test_Scene);
			stage.show();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
