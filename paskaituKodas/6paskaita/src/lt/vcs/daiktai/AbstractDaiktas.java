package lt.vcs.daiktai;

import lt.vcs.interfeisai.Daiktas;
import lt.vcs.interfeisai.VcsEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Standartine Daiktas interfeiso implementacija
 */
public abstract class AbstractDaiktas implements Daiktas, VcsEntity {

    private String name;
    private Date purchaseDate;

    public AbstractDaiktas(String name, Date purchaseDate) {
        this.name = name;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    @Override
    public String getId(){
        SimpleDateFormat spf = new SimpleDateFormat("'['ss']['mm']['HH']'");
        return name + "-" + spf.format(purchaseDate);
    }
}
