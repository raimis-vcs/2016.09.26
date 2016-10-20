package lt.vcs;

import lt.vcs.paketas.PaketoKlase;
import lt.vcs.paskaita5.User;
import lt.vcs.users.Barbora;
import lt.vcs.users.Onute;
import lt.vcs.users.Tomas;

public class Main {

    public static void main(String[] args) {
        User tomas = new Tomas("tinginiauti");
        User barbora = new Barbora("rozine");
        User useris = new User("vardauskas", "pavardauskas");
        User pk = new Tomas("tekstas");
        User onute = new Onute("2ru2ra");
        if (onute instanceof User) {
            VcsUtils.println("User valio!");
        }
        if (onute instanceof Object) {
            VcsUtils.println("Object valio!");
        }
        if (tomas instanceof Tomas) {
            VcsUtils.println("Tomas valio!");
            Tomas tikraiTomas = (Tomas)tomas;
            VcsUtils.println(tikraiTomas.getHobis());
        }
        if (pk instanceof User) {
            VcsUtils.println("Paketas valio!");
        }
        VcsUtils.println(
                (useris).toString()
        );
        VcsUtils.println(
                (tomas).toString()
        );
        VcsUtils.println(
                (barbora).toString()
        );
        VcsUtils.println(
                (onute).toString()
        );
    }
}
