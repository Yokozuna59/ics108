package event_driven_programming;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class App extends Application {
    private int imageIndex = 0;

    public Image[] getImages() throws MalformedURLException {
        File[] files = new File("images").listFiles();
        Image[] localImages = new Image[files.length];
        for (int i = 0; i < files.length; i++)
            localImages[i] = new Image(files[i].toURI().toURL().toString());
        return localImages;
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Random Images with Buttons");

        BorderPane borderPane = new BorderPane();

        Image[] images = getImages();

        ImageView imageView = new ImageView(images[imageIndex]);
        imageView.setFitWidth(576);
        imageView.setFitHeight(432);

        borderPane.setCenter(imageView);

        HBox hBox = new HBox();

        Button previousButton = new Button("Previous Image");
        Button nextButton = new Button("Next Image");

        previousButton.setDisable(true);
        previousButton.setOnAction(event -> {
            imageView.setImage(images[--imageIndex]);

            if (imageIndex == 0)
                previousButton.setDisable(true);

            if (imageIndex < images.length - 1)
                nextButton.setDisable(false);
        });

        if (images.length < 2)
            nextButton.setDisable(true);
        nextButton.setOnAction(event -> {
            imageView.setImage(images[++imageIndex]);

            if (imageIndex == images.length - 1)
                nextButton.setDisable(true);

            if (imageIndex > 0)
                previousButton.setDisable(false);
        });

        hBox.getChildren().add(previousButton);
        hBox.getChildren().add(nextButton);

        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
