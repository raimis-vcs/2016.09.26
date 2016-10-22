package lt.vcs;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        //----------------------------------

        VcsUtils.println("Kauliuku pokeris");
        VcsUtils.println("Zaidejas 1, iveskite savo varda");
        String player1 = VcsUtils.inputWord();
        VcsUtils.println("Zaidejas 2, iveskite savo varda");
        String player2 = VcsUtils.inputWord();

        boolean zaisti = true;
        while (zaisti) {
            Game newGame = new Game(new Player(player1), new Player(player2));
            newGame.start();
            VcsUtils.println("Ar norite zaisti toliau? (y - taip; n - ne)");
            String pasirinkimas = VcsUtils.inputWord();
            zaisti = "y".equalsIgnoreCase(pasirinkimas);
        }

        int p1Cash = 150; //pradine zaideju turima suma
        int p2Cash = 150;

//        do {





//        int[] arr = {1, 3, 5};// pavyzdys :)
//        VcsUtils.println(intArrayToString(arr));//pagalbinio metodo naudojimo pvz, kuri issitrinkit arba uzsikomentuokit :)
//        VcsUtils.println("" + arr[1]);//priminimas kaip galima pasiekti masyvo elementus :)

        //TODO: jums prireiks jau naudotu metodu is String klases
        //P.S. nepamirskit apziureti klasiu turimu metodu dokumentacijos pagalba (Ctrl+q  arba  View->Quick Documentation)
        //P.P.S. Jei iskyla klausimu nebijokit ju uzduoti FB komentaruose po namu darbu ar rasyti PM, nors geriau komentuoti,
        // nes gali buti naudinga ir kitiems :)
        //TODO: Google is your friend ;)


        //----------------------------------
    }//-----main end-----\\

    private static int getSum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    private static void reRollDice(int[] hand, int dicePos) {
        hand[dicePos-1] = rand();
    }

    private static int[] rollHand() {
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = rand();
        }
        return result;
    }

    private static int rand() {
        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }

    /**
     * isvercia masyvo reiksmes i suprantama formata
     *
     * @param arr masyvas, kuri versim
     * @return suprantama masyvo tekstine reprezentacija
     */
    private static String intArrayToString(int[] arr) {
        String result = "";
        for (int val : arr) {
            result += "[" + val + "] ";
        }
        return result.trim();
    }


    //TODO: nebijokit pasirasyti sau pagalbiniu metodu, jei reikia/norit, jie padaro koda tvarkingesni
    // pvz galit pasirasyti metoda pagalbini random generavimui kad nereiktu pastoviai rasyti ilgu litaniju
    // ThreadLocalRandom.current().nextInt(min, max + 1);
    //TODO: nepamirskit kad main metodas statinis todel ir pagalbiniai metodai turetu buti statiniai, kad
    //juos butu galima naudoti main metode

}
