package application;

import java.awt.Component;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PageController {

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

public void switchToSouthIndian(ActionEvent event) throws IOException {
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
	

public void switchToPunjabiCuisine(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("PunjabiCuisine.fxml"));
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}





public void switchToSouthPaid2(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("SouthPaid2.fxml"));
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


public void switchToGujuPaid2(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("GujuPaid2.fxml"));
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


public void switchToPunPaid2(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("PunPaid2.fxml"));
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


public void switchTosignin2(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("signin2.fxml"));
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


public void switchToMahaPaid3(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("MahaPaid3.fxml"));
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}	





    @FXML
    private Button btnuserLD2;

    @FXML
    private Button btnuserSD2;

    @FXML
    private TextField txtuserLD2email;

    @FXML
    private PasswordField txtuserLD2pass;

    @FXML
    private TextField txtuserSD2address;

    @FXML
    private TextField txtuserSD2contact;

    @FXML
    private TextField txtuserSD2email;

    @FXML
    private TextField txtuserSD2name;

    @FXML
    private PasswordField txtuserSD2pass;
    
    @FXML
    private Button btnuserLS;

    @FXML
    private Button btnuserSS;

    @FXML
    private TextField txtuserLSemail;

    @FXML
    private PasswordField txtuserLSpass;

    @FXML
    private TextField txtuserSSaddress;

    @FXML
    private TextField txtuserSScontact;

    @FXML
    private TextField txtuserSSemail;

    @FXML
    private TextField txtuserSSname;

    @FXML
    private PasswordField txtuserSSpass;
   

  

	
  //.......  	
    Connection con;
    PreparedStatement pst;
    
    //......
    
   
   
    
    // SIGN IN(signin2).............
    @FXML
    void switchToDineIN1(ActionEvent event) throws IOException {

String uname = txtuserSSname.getText();
String uaddress = txtuserSSaddress.getText();
String ucontact = txtuserSScontact.getText();
String uemail = txtuserSSemail.getText();
String upass = txtuserSSpass.getText();


if(uname.equals("") || uaddress.equals("") || ucontact.equals("") || uemail.equals("") || upass.equals("") )
{
JOptionPane.showMessageDialog(null,"ALL DETAILS ARE REQUIRED!");
}
else if(uemail.indexOf("@")<0 || uemail.indexOf(".")<0)
{
JOptionPane.showMessageDialog(null,"INVALID EMAIL!");
}
else
{
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mejwaani","root","Tonyst@rk26");
pst = con.prepareStatement("insert into signin2(Name,Address,Contact,EmailID,Password)values(?,?,?,?,?)");
pst.setString(1, uname);
pst.setString(2, uaddress);
pst.setString(3, ucontact);
pst.setString(4, uemail);
pst.setString(5, upass);


int status = pst.executeUpdate();
if(status==1)
{
JOptionPane.showMessageDialog(null,"YOU'VE SUCCESSFULLY SIGNED UP!");


root = FXMLLoader.load(getClass().getResource("DineIN1.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}



else
{
JOptionPane.showMessageDialog(null,"SIGNIN FAILED!");
txtuserSSname.setText("");
txtuserSSaddress.setText("");
txtuserSScontact.setText("");
txtuserSSemail.setText("");
txtuserSSpass.setText("");


txtuserSSname.requestFocus();
}
}
catch (ClassNotFoundException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
catch (SQLException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}

    
    // LOGIN(signin2)...........
    @FXML
    void switchToDineIN2(ActionEvent event) throws IOException {
    	
    		String uemail = txtuserLSemail.getText();
    		String upass =  txtuserLSpass.getText();
    		

    		if(uemail.equals("") || upass.equals(""))
    		{
    		JOptionPane.showMessageDialog(null,"INCOMPLETE DETAILS");
    		}
    		else
    		{
    		try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mejwaani","root","Tonyst@rk26");
    		Statement stm = con.createStatement();
    		String sql = "select * from signin2 where EmailID='"+uemail+"' and Password='"+upass.toString()+"'";
    		 

    		ResultSet rs = stm.executeQuery(sql);
    		 if(rs.next())
    		{
    		
    			 JOptionPane.showMessageDialog(null,"YOU'VE SUCCESSFULLY LOGGED IN!");
    		  root = FXMLLoader.load(getClass().getResource("DineIN2.fxml"));
    	    //Parent root = FXMLLoader.load(getClass().getResource("DineIN2.fxml"));
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	}
    		
 
    		else
    		{
    		
    			JOptionPane.showMessageDialog(null,"LOGIN FAILED!");

    		}
    		}
    		catch (ClassNotFoundException e)
    		{

    		 // TODO Auto-generated catch block
    		e.printStackTrace();
    		}
    		catch (SQLException e)
    		{

    		 // TODO Auto-generated catch block
    		e.printStackTrace();
    		}
    		}
    }

    
    
    
    
    
    
    
    
    
    
    // SIGN IN(Desktop2)...........
    @FXML
    void switchToMahaPaid1(ActionEvent event) throws IOException {

String uname = txtuserSD2name.getText();
String uaddress = txtuserSD2address.getText();
String ucontact = txtuserSD2contact.getText();
String uemail = txtuserSD2email.getText();
String upass = txtuserSD2pass.getText();

    
if(uname.equals("") || uaddress.equals("") || ucontact.equals("") || uemail.equals("") || upass.equals("") )
{
JOptionPane.showMessageDialog(null,"ALL DETAILS ARE REQUIRED!");
}
else if(uemail.indexOf("@")<0 || uemail.indexOf(".")<0)
{
JOptionPane.showMessageDialog(null,"INVALID EMAIL!");
}
else
{
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mejwaani","root","Tonyst@rk26");
pst = con.prepareStatement("insert into desktop2(Name,Address,Contact,EmailID,Password)values(?,?,?,?,?)");
pst.setString(1, uname);
pst.setString(2, uaddress);
pst.setString(3, ucontact);
pst.setString(4, uemail);
pst.setString(5, upass);


int status = pst.executeUpdate();
if(status==1)
{
JOptionPane.showMessageDialog(null,"YOU'VE SUCCESSFULLY SIGNED UP!");
 

root= FXMLLoader.load(getClass().getResource("MahaPaid1.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

else
{
JOptionPane.showMessageDialog(null,"SIGNIN FAILED!");
txtuserSD2name.setText("");
txtuserSD2address.setText("");
txtuserSD2contact.setText("");
txtuserSD2email.setText("");
txtuserSD2pass.setText("");


txtuserSD2name.requestFocus();
}
}
catch (ClassNotFoundException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
catch (SQLException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}

    	
    	

    
      //LOGIN(Desktop2)...............
    @FXML
    void switchToMahaPaid2(ActionEvent event) throws IOException {
    	
		String uemail = txtuserLD2email.getText();
		String upass =  txtuserLD2pass.getText();
		

		if(uemail.equals("") || upass.equals(""))
		{
		JOptionPane.showMessageDialog(null,"INCOMPLETE DETAILS");
		}
		else
		{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mejwaani","root","Tonyst@rk26");
		Statement stm = con.createStatement();
		String sql = "select * from desktop2 where EmailID='"+uemail+"' and Password='"+upass.toString()+"'";
		 

		ResultSet rs = stm.executeQuery(sql);
		 if(rs.next())
		{
		JOptionPane.showMessageDialog(null,"YOU'VE SUCCESSFULLY LOGGED IN!");
		

	    root = FXMLLoader.load(getClass().getResource("MahaPaid2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
		

		else
		{
		JOptionPane.showMessageDialog(null,"LOGIN FAILED!");

		}
		}
		catch (ClassNotFoundException e)
		{

		 // TODO Auto-generated catch block
		e.printStackTrace();
		}
		catch (SQLException e)
		{

		 // TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
    }
    }



