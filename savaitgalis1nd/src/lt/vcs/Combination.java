package lt.vcs;

/**
 * galimos kauliuku pokerio kombinacijos ir ju bonus laimejimai
 */
public enum Combination {
    /** nera kombinacijos (high number) [bonus - 0] */
    NONE,

    /** pora - 2 vienodi (pair - 2 of a kind) [bonus - 0] */
    PAIR,

    /** 2 poros (2 pairs) [bonus - 5] */
    PAIR2,

    /** 3 vienodi (3 of a kind) [bonus - 10] */
    KIND3,

    /** eile (straight) [bonus - 15] */
    STRAIGHT,

    /** pilna troba - pora ir 3 vienodi (full house) [bonus - 20] */
    FULL_HOUSE,

    /** 4 vienodi (4 of a kind) [bonus - 25] */
    KIND4,

    /** 5 vienodi (5 of a kind) [bonus - 30] */
    KIND5;

    //TODO: prideti bonusu kintamaji, parasyti konstruktoriu, padaryti metoda, leidzianti
    //gauti bonuso kintamaji (Alt+insert  arba  Code->Generate...)

}
