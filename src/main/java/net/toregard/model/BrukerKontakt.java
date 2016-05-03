package net.toregard.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@IdClass(BrukerKontaktId.class)
public class BrukerKontakt implements Serializable {
//    @Id
//    private String id;
    @Id
    private String type;
    private String kontakt;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bruker_id")
     private Bruker bruker;


    public BrukerKontakt() {
    }

    public BrukerKontakt(String type, String kontakt) {

        this.type = type;
        this.kontakt = kontakt;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public Bruker getBruker() {
        return bruker;
    }

    public void setBruker(Bruker bruker) {
        this.bruker = bruker;
    }


}