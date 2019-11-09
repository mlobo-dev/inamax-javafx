package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.entities.Ocorrence;

public class OcorrencesController implements Initializable {

	@FXML
	private TableView<Ocorrence> tableViewOcorrence;
	
	@FXML
	private TableColumn<Ocorrence, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Ocorrence, String> costumerName;
	
	@FXML
	private TableColumn<Ocorrence, String> costumerEmail;
	
	@FXML
	private TableColumn<Ocorrence, Double> debit;
	
	private ObservableList<Ocorrence> obsList;
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
