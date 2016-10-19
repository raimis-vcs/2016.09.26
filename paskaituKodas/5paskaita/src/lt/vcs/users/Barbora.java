package lt.vcs.users;

import lt.vcs.paskaita5.User;

/**
 * Created by Cukrus on 2016.10.19.
 */
public class Barbora extends User {

    private String spalva;

    public Barbora(String spalva) {
        super("Barbora");
        this.spalva = spalva;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    @Override
    public String toString() {

        return super.toString() + " megstamiausia spalva " + this.spalva;
    }
}
