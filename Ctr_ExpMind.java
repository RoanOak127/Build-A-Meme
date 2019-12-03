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
 * 
 * TODO: change font type, size to memefy it
 */

public class Ctr_ExpMind {

	//Textfields and Labels correspond to the presets
	
	//user/preset input
	@FXML
	public Button preview;
	public TextField topText;
	public TextField middleText1;
	public TextField middleText2;
	public TextField bottomText;
	
	//user/preset output onto the image
	@FXML
	public Label topDisp;
	public Label middleDisp1;
	public Label middleDisp2;
	public Label bottomDisp;
	
	
	/*
	 * When the preview button is pushed
	 * takes all the text currently in the textfields
	 * and changes the text on the picture to match
	 */
	@FXML
	public void PressPreview(ActionEvent e){
		topDisp.setText(topText.getText());
		middleDisp1.setText(middleText1.getText());
		middleDisp2.setText(middleText2.getText());
		bottomDisp.setText(bottomText.getText());
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
