package lt.vcs;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
	//-----------------------main metodo pradzia

        Connection conn = VcsDbUtils.connect("antra");

        Statement state = conn.createStatement();
//        int updatedCount = 0;
//        for (int i = 1; i <6; i++) {
//            updatedCount += state.executeUpdate(
//                    "insert into person(vardas,pavarde) values('Tomas"
//                    + i + "','Tomauskas"
//                    + i + "');");
//        }
//        VcsUtils.println("Viso pakeista: " + updatedCount);
        ResultSet result = state.executeQuery("select * from person where vardas like 'Tomas_'");
        while (result.next()) {
            VcsUtils.println(result.getString(2) + " " + result.getString("pavarde"));
        }


        VcsDbUtils.disconnect(conn);

    }//----------------------main metodo pabaiga


}
