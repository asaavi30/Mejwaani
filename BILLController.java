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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



public class BILLController {
	
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
	
	public void switchToBill2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("BILL2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	


	   @FXML
	    private Label lbl;
	   
	   @FXML
	    private TextField total;
	   
	   @FXML
	   private TextField total1;
	
	
	
	   public void displayName(String items) {
			// TODO Auto-generated method stub
			lbl.setText(items +"\n");
		}
	   
	   public void display(int price) {
			// TODO Auto-generated method stub
		total.setText(price +"\n");
		}
	   
	   public void displayTotal(double TOTAL) {
			// TODO Auto-generated method stub
		total1.setText(TOTAL +"\n");
		}
	
	}
	

