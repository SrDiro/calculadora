package calculadora2.pkg0;

import java.net.URL;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
    private TextField fieldResultado;
    @FXML
    private Button botonLimpiar;
    @FXML
    private TextArea resumenOperaciones;

    private static int num;
    @FXML
    private Button botonResto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void operacionSumar(ActionEvent event) {
        num++;
        double num1, num2, operacion;

        try {
            num1 = Double.parseDouble(field1.getText());
            num2 = Double.parseDouble(field2.getText());

            operacion = num1 + num2;

            this.fieldResultado.setText(operacion + "");
            this.resumenOperaciones.appendText("Operación " + num + " Sumar: " + num1 + " + " + num2 + " = " + operacion + "\n");
        } catch (NumberFormatException e) {
            this.resumenOperaciones.appendText("¡ERROR!, parametros incorrectos \n");
        }
    }

    @FXML
    private void operacionPorcentaje(ActionEvent event) {
        num++;
        double num1, num2, operacion;
        String porcentaje;

        porcentaje = field1.getText();

        try {
            num1 = Double.parseDouble(porcentaje.substring(0, porcentaje.length() - 1));
            num2 = Double.parseDouble(field2.getText());

            operacion = num1 * num2 / 100;

            this.fieldResultado.setText(operacion + "");
            this.resumenOperaciones.appendText("Operación " + num + " Porcentaje: " + porcentaje
                    + " de " + num2 + " = " + operacion + "\n");
        } catch (NumberFormatException e) {
            this.resumenOperaciones.appendText("¡ERROR!, parametros incorrectos \n");
        }

    }

    @FXML
    private void operacionElevar(ActionEvent event) {
        num++;
        double num1, num2, operacion;

        try {
            num1 = Double.parseDouble(field1.getText());
            num2 = Double.parseDouble(field2.getText());

            operacion = Math.pow(num1, num2);

            this.fieldResultado.setText(operacion + "");
            this.resumenOperaciones.appendText("Operación " + num + " Potencia: " + num1
                    + " elevado a " + num2 + " = " + operacion + "\n");
        } catch (NumberFormatException e) {
            this.resumenOperaciones.appendText("¡ERROR!, parametros incorrectos \n");
        }
    }

    @FXML
    private void operacionResto(ActionEvent event) {
        num++;
        double num1, num2, operacion = 0;

        try {
            num1 = Double.parseDouble(field1.getText());
            num2 = Double.parseDouble(field2.getText());

            if (num2 != 0) {
                operacion = num1 % num2;
                operacion = Math.round(operacion * 100.0) / 100.0;
            }

            this.fieldResultado.setText(operacion + "");
            this.resumenOperaciones.appendText("Operación " + num + " Resto: " + num1 + " % " + num2 + " = " + operacion + "\n");
        } catch (NumberFormatException e) {
            this.resumenOperaciones.appendText("¡ERROR!, parametros incorrectos \n");
        }
    }

    @FXML
    private void operacionLimpiar(ActionEvent event) {

        this.fieldResultado.setText(" ");

    }

}
