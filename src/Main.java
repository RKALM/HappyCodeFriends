import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
        System.out.println(encrypted("Robert"));
        HelloWorld.PdfFun();
    }
    public static void main(String[] args) {
        //JDBC starts
        DB db = new DB();
        db.doAHandshake();
        //JDBC ends
        launch(args);

    }

    //transforms a string to a hash encryption. This method uses the help of bytesToHex method.
    public static String encrypted(String digested) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(
                digested.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedhash);
    }

    //this method transforms  a byte stream to a Hex format. We use this method for our hash encryption.
    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
