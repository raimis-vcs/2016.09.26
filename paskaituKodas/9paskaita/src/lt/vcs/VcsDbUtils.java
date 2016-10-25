package lt.vcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Cukrus on 2016.10.25.
 */
public class VcsDbUtils {

    public static Connection connect(String dbName) throws SQLException {
        // url points to jdbc protocol : mysql subprotocol; localhost is the address
        // of the server where we installed our DBMS (i.e. on local machine) and
        // 3306 is the port on which we need to contact our DBMS
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url + dbName, userName, password);
        VcsUtils.println("prisijungem prie " + url + dbName);
        return conn;
    }

    public static void disconnect(Connection conn) throws SQLException {
        conn.close();
        VcsUtils.println("Atsijungem nuo DB");
    }

}
