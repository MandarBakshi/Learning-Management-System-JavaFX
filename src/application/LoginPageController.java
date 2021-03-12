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
import javafx.stage.Stage;

public class LoginPageController {
	
	@FXML private TextField enteredUsername;
	
	@FXML private TextField enteredPassword;
	
	@FXML private Label displayWarning;
	
	
	String username = "admin";
	String password = "admin";
	String title = "Study Time - Dashboard";
	
	Parent mainRoot;
	Scene mainScene;
	Stage mainStage;
	
	
	
	/*
	 * this function is called when clicked on login button
	 * but the credentials should be correct
	 */
	
	public void loadDashboardScreen(ActionEvent event) throws IOException {
		
		
		String fxml = "/application/Dashboard.fxml";
		
		if (enteredUsername.getText().equals(username) 
				&& enteredPassword.getText().equals(password)) 
		{
			mainRoot = FXMLLoader.load(getClass().getResource(fxml));
			mainScene = new Scene(mainRoot);
				
				/*
				 * this method works but not needed...
				 * 
				 * Stage mainStage = (Stage) buttonLogin.getScene().getWindow();
				 * 
				 * 
				*/
				
				
				/*
				 * below method takes the action event and gets its action source
				 * and casts that to a node
				 * then cast that to a stage
				 */
				
				mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();
								
				mainStage.setResizable(true);
				mainStage.setTitle(title);
				mainStage.setScene(mainScene);
				mainStage.show();
			}
			else {
				displayWarning.setText("INVALID CREDENTIALS!");
			}
			
	}
	
	
	
	
	/*
	 * this function is called when you click on create account
	 * that is provided on the sign in screen
	 */
	
	
	public void loadRegisterScreen(ActionEvent event) throws IOException {
		
		String NewAccountFXML = "/application/CreateNewAccount.fxml";
		
		
		mainRoot = FXMLLoader.load(getClass().getResource(NewAccountFXML));
		mainScene = new Scene(mainRoot);
		
		mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		mainStage.setResizable(false);
		mainStage.setTitle("Study Hour - Create New Account");
		mainStage.setScene(mainScene);
		mainStage.show();
		
	}
	
	
	/*
	
	public void loadLoginScreen(ActionEvent event) throws IOException {
		
		String LoginPageFXML = "/application/LoginPage.fxml";
		
		mainRoot = FXMLLoader.load(getClass().getResource(LoginPageFXML));
		mainScene = new Scene(mainRoot);
		
		mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		mainStage.setResizable(false);
		mainStage.setTitle("Study Hour - Create New Account");
		mainStage.setScene(mainScene);
		mainStage.show();
		
		
	}
	
	
	*/

}
