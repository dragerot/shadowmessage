package net.toregard.respository;

import net.toregard.ShadowMessageApplication;
import net.toregard.model.Bruker;
import net.toregard.model.KontaktDetaljer;
import net.toregard.model.TypeMelding;
import net.toregard.repository.BrukerRepository;
import net.toregard.repository.KontaktDetaljerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ShadowMessageApplication.class)
public class BrukerRepositoryTest {
    @Autowired
    BrukerRepository brukerRepository;

    @Autowired
    KontaktDetaljerRepository kontaktDetaljerRepository;

    @Test
    public void generalTest() {

        Set<KontaktDetaljer> kontakter = new HashSet<KontaktDetaljer>();
        kontakter.add(new KontaktDetaljer("TELEFON", "90513529"));
        kontakter.add(new KontaktDetaljer("SMS","90513529"));
        kontakter.add(new KontaktDetaljer("EPOST","sasa@dfd.no"));

        Bruker bruker = new Bruker("90513529", "Tore Gard","Andersen",kontakter);
        kontaktDetaljerRepository.saveAndFlush(kontakter);
        brukerRepository.saveAndFlush(bruker);
        Assert.assertTrue(true);

    }
}
