package net.toregard.model;

/**
 * Created by toregard on 18.08.2016.
 */
public class BrukerAggregatesImpl implements BrukerAggregates {
    private Bruker bruker;

    @Override
    public Bruker getBruker(String ssn) {
        if(bruker ==null) return bruker;
        else return new Bruker();
    }

}

