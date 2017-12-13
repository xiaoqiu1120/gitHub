package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController implements Initializable{

	@FXML
	TableColumn IPAddress;
	@FXML
	TableColumn loginNum;

	@FXML
	TableColumn password;
	@FXML
	TableColumn mac;
	@FXML
	TableColumn diskID;
	@FXML
	TableColumn messageDate;
	@FXML
	TableColumn isDownload;


	@FXML
	TableView<UserInfo> userInfoTable;

	  private final ObservableList<UserInfo> data =
	            FXCollections.observableArrayList(
	            new UserInfo("192.168.0.1", "Smith", "jacob","23fd523fd","fsdfsfsfdsfsf","2017-12-1","是"),
	            new UserInfo("192.168.0.2", "Johnson", "isabella","23fd523fd","fsdfsfsfdsfsf","2017-12-1","是"),
	            new UserInfo("192.168.0.3", "Williams", "ethan","23fd523fd","fsdfsfsfdsfsf","2017-12-1","是"),
	            new UserInfo("192.168.0.4", "Jones", "emma.","23fd523fd","fsdfsfsfdsfsf","2017-12-1","是"),
	            new UserInfo("192.168.0.5", "Brown", "michael.b","23fd523fd","fsdfsfsfdsfsf","2017-12-1","是"));

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		IPAddress.setCellValueFactory( new PropertyValueFactory<>("IPAddress"));
		loginNum.setCellValueFactory(new PropertyValueFactory<>("loginNum"));
		mac.setCellValueFactory(new PropertyValueFactory<>("mac"));
		diskID.setCellValueFactory(new PropertyValueFactory<>("diskID"));
		messageDate.setCellValueFactory(new PropertyValueFactory<>("messageDate"));
		isDownload.setCellValueFactory(new PropertyValueFactory<>("isDownload"));
		password.setCellValueFactory(new PropertyValueFactory<>("password"));


		userInfoTable.setItems(data);

	}


}
