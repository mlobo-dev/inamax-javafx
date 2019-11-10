package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Ocorrence;

public class OcorrencesController implements Initializable {

	@FXML
	private TableView<Ocorrence> tableViewOcorrence;
	
	@FXML
	private TableColumn<Ocorrence, Integer> tableColumnCostumerId;
	
	@FXML
	private TableColumn<Ocorrence, String> tableColumnCostumerName;
	
	@FXML
	private TableColumn<Ocorrence, String> tableColumnCostumerEmail;
	
	@FXML
	private TableColumn<Ocorrence, Double> tableColumnDebit;
	
	private ObservableList<Ocorrence> obsList;
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		initializeNodes();
		
	}

	private void initializeNodes() {
		
		tableColumnCostumerId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnCostumerName.setCellValueFactory(new PropertyValueFactory<>("costumerName"));
		tableColumnCostumerEmail.setCellValueFactory(new PropertyValueFactory<>("costumerEmail"));
		tableColumnDebit.setCellValueFactory(new PropertyValueFactory<>("debit"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewOcorrence.prefHeightProperty().bind(stage.heightProperty());
	}

}
