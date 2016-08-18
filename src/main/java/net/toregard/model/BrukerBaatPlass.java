package net.toregard.model;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by toregard on 18.08.2016.
 *
 *
 */
public class BrukerBaatPlass {

    private BaatPlass baatplass;
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
}
