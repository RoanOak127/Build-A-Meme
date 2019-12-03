package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
 * Known issues: Text is not bound inside picture and can escape into the blank space
 * 
 * TODO: change font type, size, and color to memefy it
 */

public class Crl_Doge {

	//Textfields and Labels correspond to the presets
	
	//user/preset input
	@FXML
	public Button preview;
	public TextField wowIn;
	public TextField suchIn;
	public TextField muchIn;
	public TextField veryIn;
	public TextField coolIn;
	public TextField howIn;
	
	//user/preset output onto the image
	@FXML
	public Label wowOut;
	public Label suchOut;
	public Label muchOut;
	public Label veryOut;
	public Label coolOut;
	public Label howOut;
	
	
	/*
	 * When the preview button is pushed
	 * takes all the text currently in the textfields
	 * and changes the text on the picture to match
	 */
	@FXML
	public void PressPreview(ActionEvent e){
		wowOut.setText(wowIn.getText());
		suchOut.setText(suchIn.getText());
		muchOut.setText(muchIn.getText());
		veryOut.setText(veryIn.getText());
		coolOut.setText(coolIn.getText());
		howOut.setText(howIn.getText());
	}
}
