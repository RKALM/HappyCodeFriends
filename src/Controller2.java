import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller2 {

    public void secondButtonPressed(ActionEvent event) throws Exception{
        Main.getInstance().setScene(Main.Scene1);
    }

    public void goToThirdScene()throws Exception{
        Main.getInstance().setScene(Main.Scene3);
    }
    @FXML
    public void initialize(){}
}
