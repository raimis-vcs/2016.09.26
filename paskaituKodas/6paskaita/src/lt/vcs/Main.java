package lt.vcs;

import lt.vcs.daiktai.AbstractDaiktas;
import lt.vcs.daiktai.Zaislas;
import lt.vcs.interfeisai.User;
import lt.vcs.users.AbstractUser;
import lt.vcs.users.Tomas;

public class Main {

    public static void main(String[] args) {
        User tomas1 = new Tomas("pavarde1", "tomas@email1.lt");
        Tomas tomas2 = new Tomas("pavarde2", "tomas@email2.lt");
        AbstractUser tomas3 = new Tomas("pavarde3", "tomas@email3.lt");

        Zaislas zaislas = new Zaislas("pliusinis pimpockiukas");
        VcsUtils.println(zaislas.getId());

        String result = VcsUtils.inputWord().split(",")[1];
        VcsUtils.println(result);

        if (tomas1 instanceof AbstractUser) {
            VcsUtils.println("tomas1 yra AbstractUser'is");
        }
        if (tomas3 instanceof AbstractUser) {
            VcsUtils.println("tomas3 yra AbstractUser'is");
        }
        if (tomas2 instanceof AbstractUser) {
            VcsUtils.println("tomas2 yra AbstractUser'is");
        }
        if (tomas2 instanceof User) {
            VcsUtils.println("tomas2 yra User'is");
        }
        if (tomas2 instanceof Object) {
            VcsUtils.println("tomas2 yra Object'as");
        }
        if (tomas1 instanceof User) {
            VcsUtils.println("tomas1 yra User'is");
        }
        if (tomas1 instanceof Object) {
            VcsUtils.println("tomas1 yra Object'as");
        }
    }
}
