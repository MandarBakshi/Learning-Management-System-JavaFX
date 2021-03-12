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


public class CreateNewAccountController {
	
	Parent mainRoot;
	Scene mainScene;
	Stage mainStage;
	
	@FXML private Label usernameWarning;
	
	
	public void loadLoginScreen(ActionEvent event) throws IOException {
		
		String LoginPageFXML = "/application/LoginPage.fxml";
		
		
		mainRoot = FXMLLoader.load(getClass().getResource(LoginPageFXML));
		mainScene = new Scene(mainRoot);
		
		mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		mainStage.setResizable(false);
		mainStage.setTitle("Study Hour - Login");
		mainStage.setScene(mainScene);
		mainStage.show();
		
		
	}

}
