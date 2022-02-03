package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToWelcomePage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMahaCuisine(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MahaCuisine.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSouthIndianCuisine(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("SouthIndian.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToGujuCuisine(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("GujuCuisine.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToDesktop2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Desktop2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToDineIn(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("DineIN.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	public void switchToPunjabiCuisine(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("PunjabiCuisine.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMahaPaid(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MahaPaid.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSouthPaid(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("SouthPaid.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToGujuPaid(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("GujuPaid.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToPunPaid(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("PunPaid.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToBILL(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("BILL.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	

}
