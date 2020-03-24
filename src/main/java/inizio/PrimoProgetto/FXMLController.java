package inizio.PrimoProgetto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEta;

    @FXML
    private Label txtMessage;

    @FXML
    void clicked(ActionEvent event) {
    	String nome = txtNome.getText();
    	if (txtNome.getText().length() == 0)
    		if (txtEta.getText().length() == 0) {
    			txtMessage.setText("Nome ed età non inseriti!");
    			return;
    		}
    		else {
    			txtMessage.setText("Nome non inserito!");
    			return;
    		}
    	if (txtEta.getText().length() == 0) {
    		txtMessage.setText("Età non inserita!");
    		return;
    	}
    	try {
    		int eta = Integer.parseInt(txtEta.getText());
    		if (eta < 18)
        		txtMessage.setText("Ciao" + ", " + nome + "!");
        	else
        		txtMessage.setText("Buongiorno" + ", " + nome + "!");
    	}
    	catch (NumberFormatException nfe) {
    		txtMessage.setText("Errore di inserimento nel campo età");
    		return;
    	}
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtEta != null : "fx:id=\"txtEta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtMessage != null : "fx:id=\"txtMessage\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

