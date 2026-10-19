module com.mycompany.gastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gastos to javafx.fxml;
    exports com.mycompany.gastos;
}
