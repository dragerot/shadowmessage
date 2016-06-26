package net.toregard.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="BaatPlass")
public class BaatPlass implements Serializable {

    @Id
    String nr;
    Integer bredde;
    Integer lengde;

    protected BaatPlass() {
    }

    public BaatPlass(String nr) {
        this.nr = nr;
    }

    public BaatPlass(String nr, Integer bredde, Integer lengde) {
        this.nr = nr;
        this.bredde = bredde;
        this.lengde = lengde;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public Integer getBredde() {
        return bredde;
    }

    public void setBredde(Integer bredde) {
        this.bredde = bredde;
    }

    public Integer getLengde() {
        return lengde;
    }

    public void setLengde(Integer lengde) {
        this.lengde = lengde;
    }

    @Override
    public String toString() {
        return "BaatPlass{" +
                "nr='" + nr + '\'' +
                ", bredde=" + bredde +
                ", lengde=" + lengde +
                '}';
    }


}
