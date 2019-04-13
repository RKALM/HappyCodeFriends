import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class Controller1 {

    @FXML
    Button btnScene1;
    @FXML
    private AnchorPane myPane;
    @FXML
    public void initialize(){

    }

    public void btnPressed(ActionEvent event)throws Exception{
       // SceneData.getInstance().setData(numClicks); //update the data storage before we change scene
        Main.getInstance().setScene(Main.Scene2);


    }

}
