package lt.vcs.users;

import lt.vcs.interfeisai.User;
import lt.vcs.interfeisai.VcsEntity;

/**
 * Standartine User klases implementacija
 */
public abstract class AbstractUser implements User, VcsEntity {
    private String name;
    private String lastName;
    protected String email;

    public AbstractUser(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return email;
    }

    /**
     * Metodas turi apibudinti User'i
     * @return User'io apibudinima
     */
    public abstract String describe();

}
