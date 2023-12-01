module com.example.cadastraall {
    requires javafx.controls;
    requires javafx.fxml;
    // outras dependências necessárias

    opens com.example.cadastraall.controller to javafx.fxml;
    exports com.example.cadastraall;
}