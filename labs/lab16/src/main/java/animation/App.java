package animation;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class App extends Application {
    private int imageIndex = 0;
    private Image[] images;
    private ImageView imageView;
    private Button previousButton = new Button("Previous Image");
    private Button nextButton = new Button("Next Image");

    private boolean isReversed = false;
    private Button animationButton = new Button("slideshow");
    private Timeline animate = new Timeline(new KeyFrame(Duration.millis(2000), event -> slideShow()));

    public Image[] getImages() throws MalformedURLException {
        File[] files = new File("images").listFiles();
        Image[] localImages = new Image[files.length];
        for (int i = 0; i < files.length; i++)
            localImages[i] = new Image(files[i].toURI().toURL().toString());
        return localImages;
    }

    public void slideShow() {
        if (!isReversed) {
            imageIndex++;
            if (imageIndex == images.length - 1)
                isReversed = true;
        } else {
            imageIndex--;
            if (imageIndex == 0)
                isReversed = false;
        }
        imageView.setImage(images[imageIndex]);
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Random Images with Buttons");

        // animate.setAutoReverse(true);
        animate.cycleDurationProperty();
        animate.setCycleCount(Timeline.INDEFINITE);

        BorderPane borderPane = new BorderPane();

        images = getImages();
        imageView = new ImageView(images[imageIndex]);
        imageView.setFitWidth(576);
        imageView.setFitHeight(432);

        borderPane.setCenter(imageView);

        HBox hBox = new HBox();

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

        animationButton.setOnAction(event -> {
            if (animate.getStatus() != Animation.Status.RUNNING) {
                animate.play();
                nextButton.setDisable(true);
                previousButton.setDisable(true);
            } else {
                animate.pause();

                if (imageIndex == 0)
                    nextButton.setDisable(false);

                if (imageIndex == images.length - 1)
                    previousButton.setDisable(false);

                if ((imageIndex != 0) && (imageIndex != images.length - 1)) {
                    nextButton.setDisable(false);
                    previousButton.setDisable(false);
                }
            }
        });

        hBox.getChildren().add(previousButton);
        hBox.getChildren().add(animationButton);
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
