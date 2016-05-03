package net.toregard.respository;

import net.toregard.ShadowMessageApplication;
import net.toregard.model.Bruker;
import net.toregard.model.BrukerKontakt;
import net.toregard.repository.BrukerRepository;
import net.toregard.repository.BrukerKontaktRepository;
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
public class BrukerKontaktRepositoryTest {
    @Autowired
    BrukerRepository brukerRepository;

    @Autowired
    BrukerKontaktRepository brukerKontaktRepository;

    @Test
    public void general1Test() {
        Bruker bruker = new Bruker();
        bruker.setFornavn("Tore G");
        bruker.setEtterNavn("AND");
        bruker.setId("nokkel1");

        BrukerKontakt brukerKontakt = new BrukerKontakt();
        brukerKontakt.setBruker(bruker);
        brukerKontakt.setType("SMS");
        brukerKontakt.setKontakt("sms1");
        bruker.getBrukerKontaktene().add(brukerKontakt);
        brukerRepository.saveAndFlush(bruker);
        Assert.assertTrue(true);

    }

    //@Test
    public void generalTest() {
        final String ID="90513530";
//
//        brukerRepository.saveAndFlush(new Bruker("90513530", "Tore Gard","Andersen",null));
//        brukerRepository.saveAndFlush(new Bruker("90513531", "Tore Gard","Andersen",null));
//        brukerRepository.saveAndFlush(new Bruker("90513532", "Tore Gard","Andersen",null));
//
//        Bruker bruker =brukerRepository.findOne("90513531");
//        Set<BrukerKontakt> kontaktene = new HashSet<BrukerKontakt>();
//        kontaktene.add(new BrukerKontakt("90513531","TELEFON", "90513521"));
//        kontaktene.add(new BrukerKontakt("90513531","SMS","90513522"));
//        kontaktene.add(new BrukerKontakt("90513531","EPOST","sasa@dfd.no"));
//        bruker.setBrukerKontaktene(kontaktene);
//        brukerRepository.save(bruker);
//
//        Bruker bruker2 =brukerRepository.findOne("90513532");
//        Set<BrukerKontakt> kontaktene2 = new HashSet<BrukerKontakt>();
//        kontaktene2.add(new BrukerKontakt("90513532","TELEFON", "1"));
//        kontaktene2.add(new BrukerKontakt("90513532","SMS","2"));
//        kontaktene2.add(new BrukerKontakt("90513532","EPOST","aaaa@sss.no"));
//        bruker2.setBrukerKontaktene(kontaktene2);
//        brukerRepository.saveAndFlush(bruker2);
//
//        brukerRepository.delete("90513531");
//        Assert.assertTrue(true);
//      //  BrukerKontakt d=brukerKontaktRepository.findOne(ID);
//      //  Bruker _bruker = brukerRepository.findOne(ID);
//      //  Set<BrukerKontakt> dd=_bruker.getBrukerKontaktene();
    }
}
