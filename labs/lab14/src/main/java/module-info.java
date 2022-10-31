module lab14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens random_images to javafx.fxml;
    exports random_images;
}
