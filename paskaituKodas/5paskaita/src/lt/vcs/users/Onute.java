package lt.vcs.users;

import lt.vcs.paskaita5.User;

/**
 * Created by Cukrus on 2016.10.19.
 */
public class Onute extends User {

    private String prekinisZenklas;

    public Onute(String prekinisZenklas) {
        super("Onute");
        this.prekinisZenklas = prekinisZenklas;
    }

    public String getPrekinisZenklas() {
        return prekinisZenklas;
    }

    public void setPrekinisZenklas(String prekinisZenklas) {
        this.prekinisZenklas = prekinisZenklas;
    }

    @Override
    public String toString() {

        return super.toString() + " megstamiausia prekinisZenklas " + this.prekinisZenklas;
    }
}
