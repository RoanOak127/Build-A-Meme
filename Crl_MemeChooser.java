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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Crl_MemeChooser implements Initializable {

	@FXML private ImageView mainImage;
	@FXML private ImageView baby;
	@FXML private ImageView Archer;
	@FXML private ImageView aliens;
	@FXML private ImageView chMind;
	@FXML private ImageView Doge;
	@FXML private ImageView ExpMind;
	@FXML private ImageView AgrSea;
	@FXML private ImageView HotBling;
	@FXML private ImageView KillHann;
	@FXML private ImageView LfEx12;
	@FXML private ImageView tuxWinn;
	

	@FXML private Image image1;
	@FXML private Image image2;
	@FXML private Image image3;
	@FXML private Image image4;
	@FXML private Image image5;
	@FXML private Image image6;
	@FXML private Image image7;
	@FXML private Image image8;
	@FXML private Image image9;
	@FXML private Image image10;
	@FXML private Image image11;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// corresponds to placement on grid
		//each set of 3 images is a row, going from left to right
		image1 = new Image("application/Images/baby.jpg");
		baby.setImage(image1);
		image2 = new Image("application/Images/Archer.jpg");
		Archer.setImage(image2);
		image3 = new Image("application/Images/aliens.jpg");
		aliens.setImage(image3);
		
		image4 = new Image("application/Images/ChangeMind.jpg");
		chMind.setImage(image4);
		image5 = new Image("application/Images/Doge.jpg");
		Doge.setImage(image5);
		image6 = new Image("application/Images/ExpandingMind.jpg");
		ExpMind.setImage(image6);
		
		image7 = new Image("application/Images/HotlinBling.jpg"); //except this and angry seagull, I messed up
		HotBling.setImage(image7);
		image8 = new Image("application/Images/AngrySeagull.jpg");
		AgrSea.setImage(image8);
		image9 = new Image("application/Images/KillHannible.jpg");
		KillHann.setImage(image9);
		
		image10 = new Image("application/Images/LeftExitRamp.jpg");
		LfEx12.setImage(image10);
		image11 = new Image("application/Images/TuxedoWinnie.jpg");
		tuxWinn.setImage(image11);
		
	}
	
	@FXML
	public void mouseClick (MouseEvent Event)
	{
		//when the user clicks an image, it will return the id 
		ImageView gridImage = (ImageView) Event.getSource();
		String gridImageID = gridImage.getId(); //this gives the imageview variable name
		//System.out.println(gridImageID);
		
		switch (gridImageID){
		case "baby":
			mainImage.setImage(image1);
			break;
		case "Archer":
			mainImage.setImage(image2);
			break;
		case "aliens":
			mainImage.setImage(image3);
			break;
		case "chMind":
			mainImage.setImage(image4);
			break;
		case "Doge":
			mainImage.setImage(image5);
			break;
		case "ExpMind":
			mainImage.setImage(image6);
			break;
		case "AgrSea":
			mainImage.setImage(image8);
			break;
		case "HotBling":
			mainImage.setImage(image7);
			break;
		case "KillHann":
			mainImage.setImage(image9);
			break;
		case "LfEx12":
			mainImage.setImage(image10);
			break;
		case "tuxWinn":
			mainImage.setImage(image11);
		}		
	}
	
	@FXML
	public void pressPickMe(ActionEvent e)
	{
		Image temp = mainImage.getImage();
		String id = temp.impl_getUrl();
		id = id.substring(id.lastIndexOf("/") + 1);
		//System.out.println(id);
		FXMLLoader loader = new FXMLLoader();

		try {
			
			//top bottom text
			if(id.equals("Archer.jpg") || id.equals("baby.jpg")  || id.equals("aliens.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewTopBottom.fxml"));
				
				Parent test = loader.load();
				Scene test_Scene = new Scene(test);
				Ctl_TopBottom controller = loader.getController();  //object controller
				controller.getName(id);  //sends the id to the controller2 class 
				
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(test_Scene);
				stage.show();
			}
			else if(id.equals("ChangeMind.jpg"))
			{
				//FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("ViewChMnd.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
			}
			else if(id.equals("Doge.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewDoge.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
				
			}
			else if(id.equals("ExpandingMind.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewExpMind.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
			}
			else if(id.equals("AngrySeagull.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewAngrySeagull.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
			}
			else if(id.equals("HotlinBling.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewHotBlng.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
			}
			else if(id.equals("KillHannible.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewKillHannibal.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
			}
			else if(id.equals("LeftExitRamp.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewLftExt12.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
			}
			else if(id.equals("TuxedoWinnie.jpg"))
			{
				loader.setLocation(getClass().getResource("ViewTuxWinnie.fxml"));
				Parent parentLoad = loader.load();
				Scene toMeme = new Scene(parentLoad);
				Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				stage.setScene(toMeme);
				stage.show();
			}
			
			
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
}
