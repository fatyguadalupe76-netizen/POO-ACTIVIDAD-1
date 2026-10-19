package com.mycompany.gastos;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion;

    @FXML
    private TextField txtRefrigerios;

    @FXML
    private TextField txtTransporte;

    @FXML
    private TextField txtTelefonia;

    @FXML
    private TextField txtOtros;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtGastoAlto;

    @FXML
    private void calcular(ActionEvent event) {
        try {
            double alimentacion = txtAlimentacion.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtAlimentacion.getText().trim());
            double refrigerios = txtRefrigerios.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtRefrigerios.getText().trim());
            double transporte = txtTransporte.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtTransporte.getText().trim());
            double telefonia = txtTelefonia.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtTelefonia.getText().trim());
            double otros = txtOtros.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtOtros.getText().trim());

            double total = alimentacion + refrigerios + transporte + telefonia + otros;
            txtTotal.setText(String.valueOf(total));

            double max = alimentacion;
            String mayor = "Alimentación";

            if (refrigerios > max) {
                max = refrigerios;
                mayor = "Refrigerios";
            }
            if (transporte > max) {
                max = transporte;
                mayor = "Transporte";
            }
            if (telefonia > max) {
                max = telefonia;
                mayor = "Telefonía";
            }
            if (otros > max) {
                max = otros;
                mayor = "Otros";
            }

            txtGastoAlto.setText(mayor);

        } catch (NumberFormatException e) {
            txtTotal.setText("Error");
            txtGastoAlto.setText("Valores inválidos");
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtGastoAlto.clear();
    }
}