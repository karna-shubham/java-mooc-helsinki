package hurraa;

import java.applet.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;    // IMPORTANT: use javafx.media.AudioClip

public class HurraaSovellus extends Application {

    private AudioClip audioClip;

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");

        URL resource = getClass().getResource("Applause-Yannick_Lemieux.wav");
        audioClip = new AudioClip(resource.toExternalForm());

        pane.setCenter(nappi);

        nappi.setOnAction((event) -> {
            audioClip.play();
        });

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
