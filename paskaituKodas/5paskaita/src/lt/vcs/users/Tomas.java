package lt.vcs.users;

import lt.vcs.paskaita5.User;

/**
 * Created by Cukrus on 2016.10.19.
 */
public class Tomas extends User {

    private String hobis;

    public Tomas(String hobis) {
        super("Tomas");
        this.hobis = hobis;
    }

    public String getHobis() {
        return hobis;
    }

    public void setHobis(String hobis) {
        this.hobis = hobis;
    }

    @Override
    public String toString() {

        return super.toString() + " megsta " + this.hobis;
    }
}
