module com.example.av1_fx_jeffersoncarvalhodossantos {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.scripting;

    opens com.example.av1_fx_jeffersoncarvalhodossantos to javafx.fxml;
    exports com.example.av1_fx_jeffersoncarvalhodossantos;
}