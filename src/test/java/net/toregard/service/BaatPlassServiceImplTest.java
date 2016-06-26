package net.toregard.service;


import net.toregard.model.BaatPlass;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaatPlassServiceImplTest {

    @Test
    public void findAll(){
        BaatPlassServiceImpl baatPlassServiceImpl = mock(BaatPlassServiceImpl.class);
        // stubbing appears before the actual execution
        when(baatPlassServiceImpl.getAll()).thenReturn(getBaatPlass());
        when(baatPlassServiceImpl.calcBaatPlass()).thenReturn(2);

        Assert.assertEquals(2,baatPlassServiceImpl.getAll().size());
        Assert.assertEquals(2,baatPlassServiceImpl.calcBaatPlass());
    }

    private List<BaatPlass> getBaatPlass(){
        List<BaatPlass> baat = new ArrayList<BaatPlass>();
        baat.add(new BaatPlass("1",new Integer(23), new Integer(34)));
        baat.add(new BaatPlass("2",new Integer(13), new Integer(33)));
        return baat ;
    }
}
