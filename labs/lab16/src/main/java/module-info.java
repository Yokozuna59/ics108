module lab16 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens animation to javafx.fxml;
    exports animation;
}
