package lt.vcs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Cukrus on 2016.10.20.
 */
public class GameUtils {

    /**
     * isvercia masyvo reiksmes i suprantama formata
     *
     * @param arr masyvas, kuri versim
     * @return suprantama masyvo tekstine reprezentacija
     */
    public static String intArrayToString(int[] arr) {
        String result = "";
        for (int val : arr) {
            result += "[" + val + "] ";
        }
        return result.trim();
    }

    public static int[] rollHand() {
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = rollDice();
        }
        return result;
    }

    /**
     * Isridena viena kauliuka
     * @return iskritusi kauliu skaiciu
     */
    public static int rollDice() {
        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }

    /**
     * Nustato kuris is zaideju laimejo
     * @param p1
     * @param p2
     * @return zaideja kurisl iamejo
     */
    public static Player kasLaimejo(Player p1, Player p2) {
        Player winner = null;
        Hand p1h = p1.getHand();
        Hand p2h = p2.getHand();
        if (p1h.getCombination().getStrength() > p2h.getCombination().getStrength()) {
            winner = p1;
        } else if (p1h.getCombination().getStrength() < p2h.getCombination().getStrength()) {
            winner = p2;
        } else {
            switch (p1h.getCombination()) {
                case KIND5:
                    break;
                case KIND4:
                    break;
                case FULL_HOUSE:
                    break;
                case STRAIGHT:
                    break;
                case KIND3:
                    break;
                case PAIR2:
                    break;
                case PAIR:
                    break;
                case NONE:
                    break;
            }
        }
        return winner;
    }
}
