package net.toregard.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 *  id foreslår jeg er telefon nummer
 */
@Entity
public class Bruker implements Serializable {
    @Id
    private String id;
    private String fornavn;
    private String etterNavn;
    @OneToMany(mappedBy="bruker")
    private Set<KontaktDetaljer> kontaktDetaljer;

    public Bruker() {
    }

    public Bruker(String id, String fornavn, String etterNavn, Set<KontaktDetaljer> kontaktDetaljer) {
        this.id = id;
        this.fornavn = fornavn;
        this.etterNavn = etterNavn;
        this.kontaktDetaljer = kontaktDetaljer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }

    public Set<KontaktDetaljer> getKontaktDetaljer() {
        return kontaktDetaljer;
    }

    public void setKontaktDetaljer(Set<KontaktDetaljer> kontaktDetaljer) {
        this.kontaktDetaljer = kontaktDetaljer;
    }
}
