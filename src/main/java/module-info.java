module com.stk.stk {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires javax.mail;

    opens com.stk.stk to javafx.fxml;
    exports com.stk.stk;
}