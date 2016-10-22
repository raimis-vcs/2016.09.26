package lt.vcs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Cukrus on 2016.10.21.
 */
public class Hand {

    private final int[] handArray;
    private Combination combination;
    private Integer highestComboNumber;
    private Integer secondHighestComboNumber;

    public Hand(int[] handArray) {
        this.handArray = handArray;
        Map<Integer, Integer> handMap = constructHandMap(handArray);
        this.combination = findCombination(handMap);
    }

    /**
     * perridena norimu kauliukus ir perskaiciuoja kombinacija
     * @param dices kauliuku skaiciai, atskirti kableliu, kuriuos norim perridenti
     */
    public void reRollDice(String dices) {
        dices = dices.replaceAll(" ", "");
        for (String dice : dices.split(",")) {
            Integer nr = new Integer(dice);
            reRoll1Dice(nr);
        }
        Map<Integer, Integer> handMap = constructHandMap(handArray);
        this.combination = findCombination(handMap);
    }

    private void reRoll1Dice(int dicePos) {
        handArray[dicePos-1] = GameUtils.rollDice();
    }

    private Combination findCombination(Map<Integer, Integer> mapas) {
        if (mapas.values().contains(5)) {
            return Combination.KIND5;
        } else if (mapas.values().contains(4)) {
            return Combination.KIND4;
        } else if (mapas.values().contains(3)) {
            if (mapas.values().contains(2)) {
                return Combination.FULL_HOUSE;
            }
            return Combination.KIND3;
        } else {
            Set<Integer> valSet = new HashSet<>(mapas.values());
            if (valSet.size() == 2 && (mapas.get(1) == 0 || mapas.get(6) == 0)) {
                return Combination.STRAIGHT;
            }
            int pairCount = 0;
            for (Integer val : mapas.values()) {
                if (val.equals(2)) {
                    pairCount++;
                }
            }
            if (pairCount == 2) {
                return Combination.PAIR2;
            }
            if (pairCount == 1) {
                return Combination.PAIR;
            }
            return Combination.NONE;
        }
    }

    private Map<Integer, Integer> constructHandMap(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 0); result.put(2, 0); result.put(3, 0);
        result.put(4, 0); result.put(5, 0); result.put(6, 0);
        for (int i : arr) {
            result.put(i, result.get(i) + 1);
        }
        return result;
    }

    public int[] getHandArray() {
        return handArray;
    }

    public Combination getCombination() {
        return combination;
    }

    public Integer getHighestComboNumber() {
        return highestComboNumber;
    }

    public Integer getSecondHighestComboNumber() {
        return secondHighestComboNumber;
    }

}
