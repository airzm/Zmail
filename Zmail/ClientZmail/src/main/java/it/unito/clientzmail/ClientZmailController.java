package it.unito.clientzmail;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import it.unito.clientzmail.model.Email;

public class ClientZmailController {

  @FXML
    Button composeBtn;
  @FXML
    Button inboxBtn;
  @FXML
    Button sentBtn;
  @FXML
  Label logoLabel;
  @FXML
    Button searchBtn;
  @FXML
  TextField searchText;
  @FXML
  AnchorPane inboxList;
  @FXML
  AnchorPane sentList;

  public void composeAction(ActionEvent actionEvent) {
    logoLabel.setText("Ciao bello");
  }

  public void searchAction(ActionEvent actionEvent) {
    logoLabel.setText(searchText.getText());
  }

  public void inboxAction(ActionEvent actionEvent) {



  }

  public void sentAction(ActionEvent actionEvent) {


  }
}
