package net.toregard.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by toregard on 18.08.2016.
 *
 *
 */
@Entity
public class BrukerBaatPlass {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "baatPlass_id")
    private BaatPlass baatplass;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bruker_id")
    private Bruker bruker;

    public BrukerBaatPlass(BaatPlass baatplass, Bruker bruker) {
        this.baatplass = baatplass;
        this.bruker = bruker;
    }

    public BaatPlass getBaatplass() {
        return baatplass;
    }

    public Bruker getBruker() {
        return bruker;
    }

    public void setBaatplass(BaatPlass baatplass) {
        this.baatplass = baatplass;
    }

    public void setBruker(Bruker bruker) {
        this.bruker = bruker;
    }
}
