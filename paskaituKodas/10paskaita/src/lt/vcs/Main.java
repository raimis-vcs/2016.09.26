package lt.vcs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        VcsUtils.println("Iveskite duomenu bazes pavadinima, prie kurios prisijungti");
        String userDb = VcsUtils.inputWord();
        Connection conn = null;
        try {
            conn = VcsDbUtils.connect(userDb);
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = state.executeQuery("select * from person where vardas='Raimundas'");
            while (result.next()) {
                result.updateString("pavarde","burtazodis");
                result.updateRow();
            }

            result.moveToInsertRow();
            result.updateString("pavarde","buratinas");
            result.updateString("vardas","Raimundas");
            result.insertRow();

            result.beforeFirst();
            while (result.next()) {
                VcsUtils.println(
                        result.getObject("vardas").toString()
                        + " " + result.getObject("pavarde")
                );
            }

            result.absolute(3);
            result.deleteRow();
            VcsUtils.println("------------------");

            result.beforeFirst();
            while (result.next()) {
                VcsUtils.println(
                        result.getObject("vardas").toString()
                                + " " + result.getObject("pavarde")
                );
            }
        } catch (SQLException e) {
            VcsUtils.println(e.getMessage());
        } finally {
            try {
                VcsDbUtils.disconnect(conn);
            } catch (SQLException se) {
                VcsUtils.println("whups, neuzsidare resursas");
            }
        }

    }
}
