import javafx.fxml.FXML;

public class Controller3 {


    public void goToFirstScene() throws Exception{
        Main.getInstance().setScene(Main.Scene1);


    }
    public void goToSecondScene()throws Exception{
        Main.getInstance().setScene(Main.Scene2);
    }
    public void exit(){
        System.exit(0);
    }
    @FXML
    public void initialize(){}
}
