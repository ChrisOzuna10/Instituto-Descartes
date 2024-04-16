module org.manuel.dev.instituto {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.ozuna.chris.instituto to javafx.fxml;
    exports org.ozuna.chris.instituto;
    opens org.ozuna.chris.instituto.Controllers to javafx.fxml;
    opens org.ozuna.chris.instituto.Models to javafx.fxml;
    exports org.ozuna.chris.instituto.Models;
    exports org.ozuna.chris.instituto.Controllers;
}