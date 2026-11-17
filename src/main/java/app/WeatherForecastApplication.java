package app;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class WeatherForecastApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/weatherview.fxml"));
        Scene scene = new Scene(root, 720, 720);

        stage.setScene(scene);
        stage.setTitle("Weather Forecasting Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
