import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String Scene1 = "Scene1";
    public static final String Scene2 = "Scene2";
    public static final String Scene3 = "Scene3";

    private Stage primaryStage;
    private static Main instance = null;
    public static Main getInstance(){return instance;}



    @Override
    public void start(Stage primaryStage) throws Exception {
       instance = this;
       this.primaryStage = primaryStage;
       primaryStage.setTitle("Change Scenes");
        setScene(Scene1);
        primaryStage.show();
    }


    public void setScene(String nameOfScene) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(nameOfScene+".fxml"));
        root.getStylesheets().add(getClass().getResource(nameOfScene+".fxml").toExternalForm());
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        System.out.println("Great implementation Lavdim!");
        System.out.println("my name is raghudeep");
    }
    public static void main(String[] args) {
        launch(args);

    }
}
