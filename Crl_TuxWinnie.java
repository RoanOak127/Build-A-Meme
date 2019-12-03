package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
