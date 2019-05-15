import java.sql.DriverManager;
//import com.mysql.jdbc.Connection;
import java.sql.*;

public class DB {


    String url = "jdbc:mysql://den1.mysql5.gear.host:3306?user=xtracker&password=Kt4j_?V18w07";

    Statement statement;

    public DB() {
        try {
            Connection c = (Connection) DriverManager.getConnection(url);
            statement = c.createStatement();
        } catch (SQLException ex) {
            System.out.println("the connection fails");
        }
    }


    public void doAHandshake() {
        try {
            ResultSet rs = statement.executeQuery("SHOW databases");

            while(rs.next())
            {
                System.out.println(" This database ==> " + rs.getString(1));
            }

        }
        catch (SQLException ex)
        {
            System.out.println("error on executing the handshake");
        }
    }
}

