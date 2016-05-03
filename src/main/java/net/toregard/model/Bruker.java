package net.toregard.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *  id foreslår jeg er telefon nummer
 */
@Entity
public class Bruker implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String fornavn;
    private String etterNavn;
    @OneToMany(mappedBy = "bruker", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<BrukerKontakt> brukerKontaktene;

    public Bruker() {

    }

    public Bruker(String id, String fornavn, String etterNavn,Set<BrukerKontakt> brukerKontaktene) {
        this.id = id;
        this.fornavn = fornavn;
        this.etterNavn = etterNavn;
        this.brukerKontaktene=brukerKontaktene;
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

    public Set<BrukerKontakt> getBrukerKontaktene() {
        if(brukerKontaktene==null)  brukerKontaktene=new HashSet<BrukerKontakt>();
        return brukerKontaktene;
    }

    public void setBrukerKontaktene(Set<BrukerKontakt> brukerKontaktene) {
        this.brukerKontaktene = brukerKontaktene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bruker bruker = (Bruker) o;

        if (id != null ? !id.equals(bruker.id) : bruker.id != null) return false;
        if (fornavn != null ? !fornavn.equals(bruker.fornavn) : bruker.fornavn != null) return false;
        if (etterNavn != null ? !etterNavn.equals(bruker.etterNavn) : bruker.etterNavn != null) return false;
        return brukerKontaktene != null ? brukerKontaktene.equals(bruker.brukerKontaktene) : bruker.brukerKontaktene == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fornavn != null ? fornavn.hashCode() : 0);
        result = 31 * result + (etterNavn != null ? etterNavn.hashCode() : 0);
        result = 31 * result + (brukerKontaktene != null ? brukerKontaktene.hashCode() : 0);
        return result;
    }
}
