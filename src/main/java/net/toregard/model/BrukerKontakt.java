package net.toregard.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@IdClass(BrukerKontaktId.class)
public class BrukerKontakt implements Serializable {
//    @Id
//    private String id;
    @Id
    private TypeMelding type;
    private String kontakt;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bruker_id")
     private Bruker bruker;


    public BrukerKontakt() {
    }

    public BrukerKontakt(TypeMelding type, String kontakt, Bruker bruker) {
        this.type = type;
        this.kontakt = kontakt;
        this.bruker=bruker;
    }


    public TypeMelding getType() {
        return type;
    }

    public void setType(TypeMelding type) {
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


//    @Override
//    public int compareTo(BrukerKontakt brukerKontakt) {
//        if(this.type. > brukerKontakt.getType()) return -1;
//
//        return
//    }
}
