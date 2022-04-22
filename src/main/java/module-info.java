module edu.uab.dgreen.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.uab.dgreen.mavenproject1 to javafx.fxml;
    exports edu.uab.dgreen.mavenproject1;
}
