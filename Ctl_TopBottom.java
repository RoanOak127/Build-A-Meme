package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ctl_TopBottom implements Initializable{

	@FXML private ImageView image; 
	@FXML private Text textTop; 
	@FXML private Text textButtom; 
	@FXML private TextField topTextField;
	@FXML private TextField buttomTextField;
	
	
	
	public void preview (ActionEvent event)
	{
		String topText = topTextField.getText();
		String ButtomText = buttomTextField.getText();
		
		textTop.setText(topText);
		textButtom.setText(ButtomText);
	}
	
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

	//Generates the image in the template 
	public void getName (String text) //text 
	{
		
		Image image1 = new Image("application/Images/" + text ); //Roan Changed this part to take out .jpg
		image.setImage(image1);	
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	
		
		
	}

}
