package net.toregard.respository;

import net.toregard.ShadowMessageApplication;
import net.toregard.model.KontaktDetaljer;
import net.toregard.model.KontaktDetaljerId;
import net.toregard.model.TypeMelding;
import net.toregard.repository.KontaktDetaljerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(ShadowMessageApplication.class)
public class KontaktDetaljerRepositoryTest {
//    @Autowired
//    KontaktDetaljerRepository kontaktDetaljerRepository;

    //@Test
//    public void generalTest() {
//        kontaktDetaljerRepository.saveAndFlush(new KontaktDetaljer("1", TypeMelding.TELEFON, "23233434"));
//        kontaktDetaljerRepository.saveAndFlush(new KontaktDetaljer("1", TypeMelding.EPOST, "toregard@live.com"));
//        kontaktDetaljerRepository.saveAndFlush(new KontaktDetaljer("1", TypeMelding.SMS, "23233434"));
//        kontaktDetaljerRepository.saveAndFlush(new KontaktDetaljer("1", TypeMelding.SMS, "23233434"));
//
//        List<KontaktDetaljer> kontaktDetaljerList = kontaktDetaljerRepository.findAll();
//        assertEquals(3,kontaktDetaljerList.size());
//        assertNotNull(kontaktDetaljerRepository.findOne(new KontaktDetaljerId("1", TypeMelding.TELEFON)));
//        assertNotNull(kontaktDetaljerRepository.findOne(new KontaktDetaljerId("1", TypeMelding.EPOST)));
//        assertNotNull(kontaktDetaljerRepository.findOne(new KontaktDetaljerId("1", TypeMelding.SMS)));
//        kontaktDetaljerRepository.delete(new KontaktDetaljerId("1", TypeMelding.TELEFON));
//        assertEquals(2,(kontaktDetaljerRepository.findAll()).size());
//        assertNull(kontaktDetaljerRepository.findOne(new KontaktDetaljerId("1", TypeMelding.TELEFON)));
//    }
}
