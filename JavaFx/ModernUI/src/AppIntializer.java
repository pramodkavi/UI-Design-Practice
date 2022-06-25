import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppIntializer extends Application {
    private double x,y;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("view/DashBoard.fxml"));
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);

//        primaryStage.initStyle(StageStyle.UNDECORATED);

//        //Drag it here
//        load.setOnMousePressed(event ->{
//            x=event.getSceneX();
//            y=event.getSceneY();
//        });
//
//        load.setOnMouseDragged(event ->{
//            primaryStage.setX(event.getSceneX() - x);
//            primaryStage.setY(event.getSceneY() -y);
//        });


        primaryStage.show();
    }
}
