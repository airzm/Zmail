module it.unito.clientzmail {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unito.clientzmail to javafx.fxml;
    exports it.unito.clientzmail;
}