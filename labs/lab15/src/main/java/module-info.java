module event_driven_programming {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens event_driven_programming to javafx.fxml;

    exports event_driven_programming;
}
