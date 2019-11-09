package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemNew;
	
	@FXML 
	private MenuItem menuItemAbout;
	
	@FXML
	private void onMenuItemNewAction() {
		Alerts.showAlert("Alert Test", null, "This is an simple test for show information alerts", AlertType.INFORMATION);
	}
	
	@FXML
	private void onMenuItemAboutAction() {
		Alerts.showAlert("Alert Test", null, "This is an simple test for show Errors alerts", AlertType.ERROR);
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	
}
