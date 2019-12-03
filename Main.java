package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/*
 * KnownIssues: none it works so far
 * TODO: Create a way to change scenes easily
 * right now it's just commenting out whichever scenes you don't want
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Parent root = FXMLLoader.load(getClass().getResource("/application/ViewChMnd.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("/application/ViewDoge.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("/application/ViewExpMind.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("/application/Sample.fxml"));
			Parent root = FXMLLoader.load(getClass().getResource("/application/Testing.fxml"));
			Scene scene = new Scene(root,1000,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
