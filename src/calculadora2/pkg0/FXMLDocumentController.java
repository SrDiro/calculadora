package calculadora2.pkg0;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField field1;
    @FXML
    private TextField field2;
    @FXML
    private Button botonSumar;
    @FXML
    private Button botonPorcentaje;
    @FXML
    private Button botonElevar;
    @FXML
    private Button botonDivir;
    @FXML
    private TextField fieldResultado;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void operacionSumar(ActionEvent event) {
        
    }

    @FXML
    private void operacionPorcentaje(ActionEvent event) {
    }

    @FXML
    private void operacionElevar(ActionEvent event) {
    }

    @FXML
    private void operacionDividir(ActionEvent event) {
    }

    
}
