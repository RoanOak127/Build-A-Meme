package application;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;

public class SampleController implements Initializable {
	
	 
	@FXML private ImageView baby;
	@FXML private ImageView Archer;
	@FXML private ImageView aliens;
	
	
	
	public void mouseClick (MouseEvent Event)
	{
		
		//when the user clicks an image, it will return the id 
		ImageView m = (ImageView) Event.getSource();
		String user = m.getId();
		
	try {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("scene2.fxml"));
		
		Parent test = loader.load();
		Scene test_Scene = new Scene(test);
		controller2 controller = loader.getController();  //object controller
		controller.getName(user);  //sends the id to the controller2 class 
		
		Stage stage = (Stage) ((Node) Event.getSource()).getScene().getWindow();
		stage.setScene(test_Scene);
		stage.show();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Image image = new Image("application/Images/baby.jpg");
		baby.setImage(image);
		Image image2 = new Image("application/Images/Archer.jpg");
		Archer.setImage(image2);
	/*	Image image3 = new Image("application/Images/wonka.jpg");
		Wonka.setImage(image3);*/
		Image image4 = new Image("application/Images/aliens.jpg");
		aliens.setImage(image4);
		

	}
	
}
