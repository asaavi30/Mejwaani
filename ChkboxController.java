package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ChkboxController {
	public String items = "";
	public int price = 0; 
	public double TOTAL;
//	public String ite;
	
	public void switchToSouthPaid(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("SouthPaid.fxml"));
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
	
	public void switchToWelcomePage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
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
	
	//MahaPaid1.............
	 @FXML
	    private CheckBox Caamrakha;

	    @FXML
	    private CheckBox Caamras;

	    @FXML
	    private CheckBox Caamti;

	    @FXML
	    private CheckBox Cbaji;

	    @FXML
	    private CheckBox Cbasundi;

	    @FXML
	    private CheckBox Cbatata;

	    @FXML
	    private CheckBox Ckadhi;

	    @FXML
	    private CheckBox Ckande;

	    @FXML
	    private CheckBox Ckothibir;

	    @FXML
	    private CheckBox Cmisal;

	    @FXML
	    private CheckBox Cmodak;

	    @FXML
	    private CheckBox Cpandhra;

	    @FXML
	    private CheckBox Cpithla;

	    @FXML
	    private CheckBox Cpuran;

	    @FXML
	    private CheckBox Cshreekhand;

	    @FXML
	    private CheckBox Csol;

	    @FXML
	    private CheckBox Ctambda;

	    @FXML
	    private CheckBox Ctarri;

	    @FXML
	    private CheckBox Cthali;

	    @FXML
	    private CheckBox Cupma;

	    @FXML
	    private CheckBox Cvada;

	    @FXML
	    private CheckBox Cvangi;
	    
//	    @FXML
//	    public Label lbl;
	    
	    //String lbl = lblorder.toString();

	    @FXML
	    private Button PTP1;
	    
	    @FXML
	    public Label lbl1;
	    
	    @FXML
	    private TextField upma;

	    @FXML
	    private TextField vada;

	    @FXML
	    private TextField vangi;
	    

	    @FXML
	    private TextField total;

//	@FXML
//	TextField nameTextField;
	    
	    
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	public void PTP(ActionEvent event) throws IOException {
		
        if(Cvangi.isSelected()) 
    	{
    		int b = Integer.parseInt(Cvangi.getText());
    		items += "\n" +Cvangi.getText() + "\n";
    		price = price + (10*b);
            
    	}
    	
    	if(Cvada.isSelected()) 
    	{
    		int c = Integer.parseInt(Cvada.getText());
    		items +="\n" + Cvada.getText() + "\n";
    		price = price +(20*c);
            
    	}
    	
    	if(Cupma.isSelected()) 
    	{
    		int a = Integer.parseInt(Cupma.getText());
    		items += "\n" +Cupma.getText() + "\n";
    		price = price + (30*a);
            
    	}
    	
    	if(Cthali.isSelected()) 
    	{
       
    		items += "\n" +Cthali.getText() + "\n";
            
    	}
    	
    	if(Ctarri.isSelected()) 
    	{
       
    		items += "\n" +Ctarri.getText() + "\n";
            
    	}
    	
    	if(Ctambda.isSelected()) 
    	{
       
    		items +="\n" + Ctambda.getText() + "\n";
            
    	}
    	
    	if(Csol.isSelected()) 
    	{
       
    		items +="\n" + Csol.getText() + "\n";
            
    	}
    	
    	if(Cshreekhand.isSelected()) 
    	{
       
    		items += "\n" +Cshreekhand.getText() + "\n";
            
    	}
    	
    	if(Cpuran.isSelected()) 
    	{
       
    		items +="\n" + Cpuran.getText() + "\n";
            
    	}
    	
    	if(Cpithla.isSelected()) 
    	{
       
    		items += "\n" +Cpithla.getText() + "\n";
            
    	}
    	
    	if(Cpandhra.isSelected()) 
    	{
       
    		items += "\n" +Cpandhra.getText() + "\n";
            
    	}
    	
    	if(Cmodak.isSelected()) 
    	{
       
    		items += "\n" +Cmodak.getText() + "\n";
            
    	}
    	
    	if(Cmisal.isSelected()) 
    	{
       
    		items +="\n" + Cmisal.getText() + "\n";
            
    	}
    	
    	if(Ckothibir.isSelected()) 
    	{
       
    		items += "\n" +Ckothibir.getText() + "\n";
    		
            
    	}
    	
    	if(Ckande.isSelected()) 
    	{
       
    		items += "\n" +Ckande.getText() + "\n";
            
    	}
    	
    	if(Ckadhi.isSelected()) 
    	{
       
    		items +="\n" + Ckadhi.getText() + "\n";
            
    	}
    	
    	if(Cbatata.isSelected()) 
    	{
       
    		items += "\n" +Cbatata.getText() + "\n";
            
    	}
    	
    	if(Cbasundi.isSelected()) 
    	{
       
    		items += "\n" +Cbasundi.getText() + "\n";
            
    	}
    	
    	if(Cbaji.isSelected()) 
    	{
       
    		items +="\n" + Cbaji.getText() + "\n";
            
    	}
    	
    	if(Caamti.isSelected()) 
    	{
       
    		items +="\n" + Caamti.getText() + "\n";
            
    	}
    	
    	if(Caamras.isSelected()) 
    	{
       
    		items += "\n" +Caamras.getText() + "\n";
            
    	}
    	
    	if(Caamrakha.isSelected()) 
    	{
       
    		items += "\n" +Caamrakha.getText() + "\n";
            
    	}
    	
    
		TOTAL = price  + (price*0.18);
		//System.out.println(price);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("BILL.fxml"));	
		root = loader.load();	
		
		BILLController bill = loader.getController();
//	scene2Controller.displayName(username);
		bill.displayName(items);
		bill.display(price);
		bill.displayTotal(TOTAL);
		
		//System.out.println(price);
		//root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));	
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//MahaPaid2...........
	
	  @FXML
	    private CheckBox CM2aamrakha;

	    @FXML
	    private CheckBox CM2aamras;

	    @FXML
	    private CheckBox CM2aamti;

	    @FXML
	    private CheckBox CM2baji;

	    @FXML
	    private CheckBox CM2basundi;

	    @FXML
	    private CheckBox CM2batata;

	    @FXML
	    private CheckBox CM2kadhi;

	    @FXML
	    private CheckBox CM2kande;

	    @FXML
	    private CheckBox CM2kothibir;

	    @FXML
	    private CheckBox CM2misal;

	    @FXML
	    private CheckBox CM2modak;

	    @FXML
	    private CheckBox CM2pandhra;

	    @FXML
	    private CheckBox CM2pithla;

	    @FXML
	    private CheckBox CM2puran;

	    @FXML
	    private CheckBox CM2shreekhand;

	    @FXML
	    private CheckBox CM2sol;

	    @FXML
	    private CheckBox CM2tambda;

	    @FXML
	    private CheckBox CM2tarri;

	    @FXML
	    private CheckBox CM2thali;

	    @FXML
	    private CheckBox CM2upma;

	    @FXML
	    private CheckBox CM2vada;

	    @FXML
	    private CheckBox CM2vangi;

	    @FXML
	    private Button Proceed;

	    @FXML
	    void PTP1(ActionEvent event) throws IOException {
              
	    	 if(CM2vangi.isSelected()) 
	     	{
	     		int b = Integer.parseInt(CM2vangi.getText());
	     		items += "\n" +CM2vangi.getText() + "\n";
	     		price = price + (10*b);
	             
	     	}
	     	
	     	if(CM2vada.isSelected()) 
	     	{
	     		int c = Integer.parseInt(CM2vada.getText());
	     		items +="\n" + CM2vada.getText() + "\n";
	     		price = price +(20*c);
	             
	     	}
	     	
	     	if(CM2upma.isSelected()) 
	     	{
	     		int a = Integer.parseInt(CM2upma.getText());
	     		items += "\n" +CM2upma.getText() + "\n";
	     		price = price + (30*a);
	             
	     	}
	     	
	     	if(CM2thali.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2thali.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2tarri.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2tarri.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2tambda.isSelected()) 
	     	{
	        
	     		items +="\n" + CM2tambda.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2sol.isSelected()) 
	     	{
	        
	     		items +="\n" + CM2sol.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2shreekhand.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2shreekhand.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2puran.isSelected()) 
	     	{
	        
	     		items +="\n" + CM2puran.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2pithla.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2pithla.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2pandhra.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2pandhra.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2modak.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2modak.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2misal.isSelected()) 
	     	{
	        
	     		items +="\n" + CM2misal.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2kothibir.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2kothibir.getText() + "\n";
	     		
	             
	     	}
	     	
	     	if(CM2kande.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2kande.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2kadhi.isSelected()) 
	     	{
	        
	     		items +="\n" + CM2kadhi.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2batata.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2batata.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2basundi.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2basundi.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2baji.isSelected()) 
	     	{
	        
	     		items +="\n" + CM2baji.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2aamti.isSelected()) 
	     	{
	        
	     		items +="\n" + CM2aamti.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2aamras.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2aamras.getText() + "\n";
	             
	     	}
	     	
	     	if(CM2aamrakha.isSelected()) 
	     	{
	        
	     		items += "\n" +CM2aamrakha.getText() + "\n";
	             
	     	}
	     	
	     	TOTAL = price  + (price*0.18);
			//System.out.println(price);
			FXMLLoader loader = new FXMLLoader(getClass().getResource("BILL.fxml"));	
			root = loader.load();	
			
			BILLController bill = loader.getController();
			bill.displayName(items);
			bill.display(price);
			bill.displayTotal(TOTAL);
			
			//System.out.println(price);	
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	    	
	    }
	    
	    //MahaPaid3..........
	    @FXML
	    private CheckBox CM3aamrakha;

	    @FXML
	    private CheckBox CM3aamras;

	    @FXML
	    private CheckBox CM3aamti;

	    @FXML
	    private CheckBox CM3baji;

	    @FXML
	    private CheckBox CM3basundi;

	    @FXML
	    private CheckBox CM3batata;

	    @FXML
	    private CheckBox CM3kadhi;

	    @FXML
	    private CheckBox CM3kande;

	    @FXML
	    private CheckBox CM3kothibir;

	    @FXML
	    private CheckBox CM3misal;

	    @FXML
	    private CheckBox CM3modak;

	    @FXML
	    private CheckBox CM3pandhra;

	    @FXML
	    private CheckBox CM3pithla;

	    @FXML
	    private CheckBox CM3puran;

	    @FXML
	    private CheckBox CM3shreekhand;

	    @FXML
	    private CheckBox CM3sol;

	    @FXML
	    private CheckBox CM3tambda;

	    @FXML
	    private CheckBox CM3tarri;

	    @FXML
	    private CheckBox CM3thali;

	    @FXML
	    private CheckBox CM3upma;

	    @FXML
	    private CheckBox CM3vada;

	    @FXML
	    private CheckBox CM3vangi;


	    @FXML
	    void PTP2(ActionEvent event) throws IOException {
	    	
	    	 if(CM3vangi.isSelected()) 
		     	{
		     		int b = Integer.parseInt(CM3vangi.getText());
		     		items += "\n" +CM3vangi.getText() + "\n";
		     		price = price + (10*b);
		             
		     	}
		     	
		     	if(CM3vada.isSelected()) 
		     	{
		     		int c = Integer.parseInt(CM3vada.getText());
		     		items +="\n" + CM3vada.getText() + "\n";
		     		price = price +(20*c);
		             
		     	}
		     	
		     	if(CM3upma.isSelected()) 
		     	{
		     		int a = Integer.parseInt(CM3upma.getText());
		     		items += "\n" +CM3upma.getText() + "\n";
		     		price = price + (30*a);
		             
		     	}
		     	
		     	if(CM3thali.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3thali.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3tarri.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3tarri.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3tambda.isSelected()) 
		     	{
		        
		     		items +="\n" + CM3tambda.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3sol.isSelected()) 
		     	{
		        
		     		items +="\n" + CM3sol.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3shreekhand.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3shreekhand.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3puran.isSelected()) 
		     	{
		        
		     		items +="\n" + CM3puran.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3pithla.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3pithla.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3pandhra.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3pandhra.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3modak.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3modak.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3misal.isSelected()) 
		     	{
		        
		     		items +="\n" + CM3misal.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3kothibir.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3kothibir.getText() + "\n";
		     		
		             
		     	}
		     	
		     	if(CM3kande.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3kande.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3kadhi.isSelected()) 
		     	{
		        
		     		items +="\n" + CM3kadhi.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3batata.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3batata.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3basundi.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3basundi.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3baji.isSelected()) 
		     	{
		        
		     		items +="\n" + CM3baji.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3aamti.isSelected()) 
		     	{
		        
		     		items +="\n" + CM3aamti.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3aamras.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3aamras.getText() + "\n";
		             
		     	}
		     	
		     	if(CM3aamrakha.isSelected()) 
		     	{
		        
		     		items += "\n" +CM3aamrakha.getText() + "\n";
		             
		     	}
		     	
		     	TOTAL = price  + (price*0.18);
				//System.out.println(price);
				FXMLLoader loader = new FXMLLoader(getClass().getResource("BILL.fxml"));	
				root = loader.load();	
				
				BILLController bill = loader.getController();
				bill.displayName(items);
				bill.display(price);
				bill.displayTotal(TOTAL);
				
				//System.out.println(price);	
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
	    	
	    }
	    
	    //SouthPaid............
	    
	    @FXML
	    private CheckBox CSbanpongal;

	    @FXML
	    private CheckBox CSela;

	    @FXML
	    private CheckBox CSidli;

	    @FXML
	    private CheckBox CSkheer;

	    @FXML
	    private CheckBox CSmasala;

	    @FXML
	    private CheckBox CSmasdosa;

	    @FXML
	    private CheckBox CSonion;

	    @FXML
	    private CheckBox CSpaal;

	    @FXML
	    private CheckBox CSpaneer;

	    @FXML
	    private CheckBox CSpapermas;

	    @FXML
	    private CheckBox CSpaperpaneer;

	    @FXML
	    private CheckBox CSplain;

	    @FXML
	    private CheckBox CSpongal;

	    @FXML
	    private CheckBox CSrava;

	    @FXML
	    private CheckBox CSravadosa;

	    @FXML
	    private CheckBox CSsambar;

	    @FXML
	    private CheckBox CSswtidli;

	    @FXML
	    private CheckBox CSuppama;

	    @FXML
	    private CheckBox CSvada;


	    @FXML
	    void PTP3(ActionEvent event) throws IOException {
	    	
	    	 if(CSbanpongal.isSelected()) 
		     	{
		     		int b = Integer.parseInt(CSbanpongal.getText());
		     		items += "\n" +CSbanpongal.getText() + "\n";
		     		price = price + (10*b);
		             
		     	}
		     	
		     	if(CSela.isSelected()) 
		     	{
		     		int c = Integer.parseInt(CSela.getText());
		     		items +="\n" + CSela.getText() + "\n";
		     		price = price +(20*c);
		             
		     	}
		     	
		     	if(CSidli.isSelected()) 
		     	{
		     		int a = Integer.parseInt(CSidli.getText());
		     		items += "\n" +CSidli.getText() + "\n";
		     		price = price + (30*a);
		             
		     	}
		     	
		     	if(CSkheer.isSelected()) 
		     	{
		        
		     		items += "\n" +CSkheer.getText() + "\n";
		             
		     	}
		     	
		     	if(CSmasala.isSelected()) 
		     	{
		        
		     		items += "\n" +CSmasala.getText() + "\n";
		             
		     	}
		     	
		     	if(CSmasdosa.isSelected()) 
		     	{
		        
		     		items +="\n" + CSmasdosa.getText() + "\n";
		             
		     	}
		     	
		     	if(CSonion.isSelected()) 
		     	{
		        
		     		items +="\n" + CSonion.getText() + "\n";
		             
		     	}
		     	
		     	if(CSpaal.isSelected()) 
		     	{
		        
		     		items += "\n" +CSpaal.getText() + "\n";
		             
		     	}
		     	
		     	if(CSpaneer.isSelected()) 
		     	{
		        
		     		items +="\n" + CSpaneer.getText() + "\n";
		             
		     	}
		     	
		     	if(CSpapermas.isSelected()) 
		     	{
		        
		     		items += "\n" +CSpapermas.getText() + "\n";
		             
		     	}
		     	
		     	if(CSpaperpaneer.isSelected()) 
		     	{
		        
		     		items += "\n" +CSpaperpaneer.getText() + "\n";
		             
		     	}
		     	
		     	if(CSplain.isSelected()) 
		     	{
		        
		     		items += "\n" +CSplain.getText() + "\n";
		             
		     	}
		     	
		     	if(CSpongal.isSelected()) 
		     	{
		        
		     		items +="\n" + CSpongal.getText() + "\n";
		             
		     	}
		     	
		     	if(CSrava.isSelected()) 
		     	{
		        
		     		items += "\n" +CSrava.getText() + "\n";
		     		
		             
		     	}
		     	
		     	if(CSravadosa.isSelected()) 
		     	{
		        
		     		items += "\n" +CSravadosa.getText() + "\n";
		             
		     	}
		     	
		     	if(CSsambar.isSelected()) 
		     	{
		        
		     		items +="\n" + CSsambar.getText() + "\n";
		             
		     	}
		     	
		     	if(CSswtidli.isSelected()) 
		     	{
		        
		     		items += "\n" +CSswtidli.getText() + "\n";
		             
		     	}
		     	
		     	if(CSuppama.isSelected()) 
		     	{
		        
		     		items += "\n" +CSuppama.getText() + "\n";
		             
		     	}
		     	
		     	if(CSvada.isSelected()) 
		     	{
		        
		     		items +="\n" + CSvada.getText() + "\n";
		             
		     	}
		     	
		     	    	
		     	TOTAL = price  + (price*0.18);
				//System.out.println(price);
				FXMLLoader loader = new FXMLLoader(getClass().getResource("BILL.fxml"));	
				root = loader.load();	
				
				BILLController bill = loader.getController();
				bill.displayName(items);
				bill.display(price);
				bill.displayTotal(TOTAL);
				
				//System.out.println(price);	
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
	    	
	    }
	    
	    //SouthPaid2...........
	    

	    @FXML
	    private CheckBox CS2banpongal;

	    @FXML
	    private CheckBox CS2ela;

	    @FXML
	    private CheckBox CS2idli;

	    @FXML
	    private CheckBox CS2kheer;

	    @FXML
	    private CheckBox CS2masala;

	    @FXML
	    private CheckBox CS2masdosa;

	    @FXML
	    private CheckBox CS2onion;

	    @FXML
	    private CheckBox CS2paal;

	    @FXML
	    private CheckBox CS2paneer;

	    @FXML
	    private CheckBox CS2papermas;

	    @FXML
	    private CheckBox CS2paperpaneer;

	    @FXML
	    private CheckBox CS2plain;

	    @FXML
	    private CheckBox CS2pongal;

	    @FXML
	    private CheckBox CS2rava;

	    @FXML
	    private CheckBox CS2ravadosa;

	    @FXML
	    private CheckBox CS2sambar;

	    @FXML
	    private CheckBox CS2swtidli;

	    @FXML
	    private CheckBox CS2uppama;

	    @FXML
	    private CheckBox CS2vada;

	    @FXML
	    void PTP4(ActionEvent event) throws IOException {
	    	
	    	if(CS2banpongal.isSelected()) 
	     	{
	     		int b = Integer.parseInt(CS2banpongal.getText());
	     		items += "\n" +CS2banpongal.getText() + "\n";
	     		price = price + (10*b);
	             
	     	}
	     	
	     	if(CS2ela.isSelected()) 
	     	{
	     		int c = Integer.parseInt(CS2ela.getText());
	     		items +="\n" + CS2ela.getText() + "\n";
	     		price = price +(20*c);
	             
	     	}
	     	
	     	if(CS2idli.isSelected()) 
	     	{
	     		int a = Integer.parseInt(CS2idli.getText());
	     		items += "\n" +CS2idli.getText() + "\n";
	     		price = price + (30*a);
	             
	     	}
	     	
	     	if(CS2kheer.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2kheer.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2masala.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2masala.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2masdosa.isSelected()) 
	     	{
	        
	     		items +="\n" + CS2masdosa.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2onion.isSelected()) 
	     	{
	        
	     		items +="\n" + CS2onion.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2paal.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2paal.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2paneer.isSelected()) 
	     	{
	        
	     		items +="\n" + CS2paneer.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2papermas.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2papermas.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2paperpaneer.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2paperpaneer.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2plain.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2plain.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2pongal.isSelected()) 
	     	{
	        
	     		items +="\n" + CS2pongal.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2rava.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2rava.getText() + "\n";
	     		
	             
	     	}
	     	
	     	if(CS2ravadosa.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2ravadosa.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2sambar.isSelected()) 
	     	{
	        
	     		items +="\n" + CS2sambar.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2swtidli.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2swtidli.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2uppama.isSelected()) 
	     	{
	        
	     		items += "\n" +CS2uppama.getText() + "\n";
	             
	     	}
	     	
	     	if(CS2vada.isSelected()) 
	     	{
	        
	     		items +="\n" + CS2vada.getText() + "\n";
	             
	     	}
	     	
	     	    	
	     	TOTAL = price  + (price*0.18);
			//System.out.println(price);
			FXMLLoader loader = new FXMLLoader(getClass().getResource("BILL.fxml"));	
			root = loader.load();	
			
			BILLController bill = loader.getController();
			bill.displayName(items);
			bill.display(price);
			bill.displayTotal(TOTAL);
			
			//System.out.println(price);	
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
    	
	    }

	    //GujuPaid........
	    
	    @FXML
	    private CheckBox CGbardoli;

	    @FXML
	    private CheckBox CGdal;

	    @FXML
	    private CheckBox CGdoodh;

	    @FXML
	    private CheckBox CGfafda;

	    @FXML
	    private CheckBox CGgehu;

	    @FXML
	    private CheckBox CGjalebi;

	    @FXML
	    private CheckBox CGkadhi;

	    @FXML
	    private CheckBox CGkansar;

	    @FXML
	    private CheckBox CGkhandvi;

	    @FXML
	    private CheckBox CGlauki;

	    @FXML
	    private CheckBox CGmethi;

	    @FXML
	    private CheckBox CGmohan;

	    @FXML
	    private CheckBox CGmooli;

	    @FXML
	    private CheckBox CGmuthia;

	    @FXML
	    private CheckBox CGnagli;

	    @FXML
	    private CheckBox CGrabdi;

	    @FXML
	    private CheckBox CGsev;

	    @FXML
	    private CheckBox CGshaak;

	    @FXML
	    private CheckBox CGsukhdi;

	    @FXML
	    private CheckBox CGundhi;

	    @FXML
	    void PTP5(ActionEvent event) throws IOException {
	    	
	    	if(CGbardoli.isSelected()) 
	     	{
	     		int b = Integer.parseInt(CGbardoli.getText());
	     		items += "\n" +CGbardoli.getText() + "\n";
	     		price = price + (10*b);
	             
	     	}
	     	
	     	if(CGdal.isSelected()) 
	     	{
	     		int c = Integer.parseInt(CGdal.getText());
	     		items +="\n" + CGdal.getText() + "\n";
	     		price = price +(20*c);
	             
	     	}
	     	
	     	if(CGdoodh.isSelected()) 
	     	{
	     		int a = Integer.parseInt(CGdoodh.getText());
	     		items += "\n" +CGdoodh.getText() + "\n";
	     		price = price + (30*a);
	             
	     	}
	     	
	     	if(CGfafda.isSelected()) 
	     	{
	        
	     		items += "\n" +CGfafda.getText() + "\n";
	             
	     	}
	     	
	     	if(CGgehu.isSelected()) 
	     	{
	        
	     		items += "\n" +CGgehu.getText() + "\n";
	             
	     	}
	     	
	     	if(CGjalebi.isSelected()) 
	     	{
	        
	     		items +="\n" + CGjalebi.getText() + "\n";
	             
	     	}
	     	
	     	if(CGkadhi.isSelected()) 
	     	{
	        
	     		items +="\n" + CGkadhi.getText() + "\n";
	             
	     	}
	     	
	     	if(CGkansar.isSelected()) 
	     	{
	        
	     		items += "\n" +CGkansar.getText() + "\n";
	             
	     	}
	     	
	     	if(CGkhandvi.isSelected()) 
	     	{
	        
	     		items +="\n" + CGkhandvi.getText() + "\n";
	             
	     	}
	     	
	     	if(CGlauki.isSelected()) 
	     	{
	        
	     		items += "\n" +CGlauki.getText() + "\n";
	             
	     	}
	     	
	     	if(CGmethi.isSelected()) 
	     	{
	        
	     		items += "\n" +CGmethi.getText() + "\n";
	             
	     	}
	     	
	     	if(CGmohan.isSelected()) 
	     	{
	        
	     		items += "\n" +CGmohan.getText() + "\n";
	             
	     	}
	     	
	     	if(CGmooli.isSelected()) 
	     	{
	        
	     		items +="\n" + CGmooli.getText() + "\n";
	             
	     	}
	     	
	     	if(CGmuthia.isSelected()) 
	     	{
	        
	     		items += "\n" +CGmuthia.getText() + "\n";
	     		
	             
	     	}
	     	
	     	if(CGnagli.isSelected()) 
	     	{
	        
	     		items += "\n" +CGnagli.getText() + "\n";
	             
	     	}
	     	
	     	if(CGrabdi.isSelected()) 
	     	{
	        
	     		items +="\n" + CGrabdi.getText() + "\n";
	             
	     	}
	     	
	     	if(CGsev.isSelected()) 
	     	{
	        
	     		items += "\n" +CGsev.getText() + "\n";
	             
	     	}
	     	
	     	if(CGshaak.isSelected()) 
	     	{
	        
	     		items += "\n" +CGshaak.getText() + "\n";
	             
	     	}
	     	
	     	if(CGsukhdi.isSelected()) 
	     	{
	        
	     		items +="\n" + CGsukhdi.getText() + "\n";
	             
	     	}
	     	
	     	if(CGundhi.isSelected()) 
	     	{
	        
	     		items +="\n" + CGundhi.getText() + "\n";
	             
	     	}
	     	
	     	    	
	     	TOTAL = price  + (price*0.18);
			//System.out.println(price);
			FXMLLoader loader = new FXMLLoader(getClass().getResource("BILL.fxml"));	
			root = loader.load();	
			
			BILLController bill = loader.getController();
			bill.displayName(items);
			bill.display(price);
			bill.displayTotal(TOTAL);
			
			//System.out.println(price);	
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	    }

	    
	    
}
	
	
	
	
	
