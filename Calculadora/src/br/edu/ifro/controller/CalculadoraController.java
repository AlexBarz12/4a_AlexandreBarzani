package br.edu.ifro.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController implements Initializable {
    
    @FXML
    private TextField txtNumero1,txtNumero2;
    
    @FXML
    private Button btnSoma;
    
    private Button btnDivicao;
    
    private Button btnMutiplicacao;
    
    private Button btnSubitracao;
    
    @FXML
    private Label lbResultado;
    
    private void soma(ActionEvent event) {
       Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double result = null;
                result = num1+num2;
        lbResultado.setText(result.toString());
    }
    
    private void subtracao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double result = null;
                result = num1-num2;
        lbResultado.setText(result.toString());
    }
    
    private void mutiplicacao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double result = null;
                result = num1*num2;
        lbResultado.setText(result.toString());
    }
    
    private void divicao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double result = null;
                result = num1/num2;
        lbResultado.setText(result.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
