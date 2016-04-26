package net.toregard.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@IdClass(KontaktDetaljerId.class)
public class KontaktDetaljer implements Serializable {
    @Id
    //@Enumerated(EnumType.ORDINAL)
    private String type;
    @ManyToOne
    @JoinColumn(name = "id")
    private Bruker bruker;
    private String kontakt;


    public KontaktDetaljer() {
    }

    public KontaktDetaljer(String type,String kontakt) {
        this.type = type;
        this.kontakt = kontakt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bruker getBruker() {
        return bruker;
    }

    public void setBruker(Bruker bruker) {
        this.bruker = bruker;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }
}
