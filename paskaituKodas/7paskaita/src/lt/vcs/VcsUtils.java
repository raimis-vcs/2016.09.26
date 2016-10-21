package lt.vcs;

import java.io.*;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Klase skirta pagalbiniams metodams
 */
public class VcsUtils {

    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final String NEW_LINE = System.lineSeparator();

    /**
     * grazina nauja Scanner instanca
     * @return
     */
    private static Scanner newScanner(){

        return new Scanner(System.in);
    }

    /**
     * Metodas isveda teksta i nauja eilute cmd lange su laiku priekyje
     */
    public static void println(String text) {
        Date data = new Date();
        String formatas = "'['HH:mm:ss:SSS']' ";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        System.out.println(sdf.format(data) + text);
    }

    /**
     * perskaito zodi ivesta per cmd
     * @return perskaityta zodi
     */
    public static String inputWord() {
        return newScanner().next();
    }

    /**
     * perskaito eilute ivesta per cmd
     * @return perskaityta eilute
     */
    public static String inputLine() {
        return newScanner().nextLine();
    }

    /**
     * perskaito integeri(sveika skaiciu) ivesta per cmd
     * @return perskaityta integeri
     */
    public static int inputInt() {
        return newScanner().nextInt();
    }

    /**
     * Metodas failo readeriui gauti
     * @param file failo pavadinimas su keliu iki jo (path)
     * @return readeri failui
     * @throws IOException gali mesti exceptiona
     */
    public static BufferedReader newReader(String file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, VcsUtils.UTF_8);
        return new BufferedReader(isr);
    }

    /**
     * Metodas failo writeriui gauti
     * @param file failo pavadinimas su keliu iki jo (path)
     * @return writer failui
     * @throws IOException gali mesti exceptiona
     */
    public static BufferedWriter newWriter(String file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        return new BufferedWriter(osw);
    }

}
