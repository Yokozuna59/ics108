package random_images;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;

public class App extends Application {
    private static Scene scene;

    public Image[] getImages() throws MalformedURLException {
        File[] files = new File("images").listFiles();
        Image[] localImages = new Image[files.length];
        for (int i = 0; i < files.length; i++)
            localImages[i] = new Image(files[i].toURI().toURL().toString());
        return localImages;
    }

    @Override
    public void start(Stage stage) throws IOException {
        Image[] images = getImages();

        Random random = new Random();
        int randomInt = random.nextInt(images.length);

        Image image = images[randomInt];
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(640);
        imageView.setFitHeight(480);

        Pane pane = new Pane();
        pane.getChildren().add(imageView);
        scene = new Scene(pane, 640, 480);
        stage.setTitle("Random Images");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
