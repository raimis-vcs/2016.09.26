package lt.vcs;

import java.io.File;

public class PvzKlase<T> {

    private T reiksme;

    public PvzKlase(T arg) {
        reiksme = arg;
    }

    public T getReiksme() {
        return reiksme;
    }
}

