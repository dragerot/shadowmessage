package net.toregard.respository;

import net.toregard.ShadowMessageApplication;
import net.toregard.model.BaatPlass;
import net.toregard.repository.BaatPlassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ShadowMessageApplication.class)
public class BaatPlassRepositoryTest {
    @Autowired
    BaatPlassRepository baatPlassRepository;

    @Test
    public void generalTest() {
        baatPlassRepository.saveAndFlush(new BaatPlass("1", Integer.valueOf(3), Integer.valueOf(10)));
        baatPlassRepository.saveAndFlush(new BaatPlass("2", Integer.valueOf(4), Integer.valueOf(11)));
        baatPlassRepository.saveAndFlush(new BaatPlass("3", Integer.valueOf(5), Integer.valueOf(12)));
        baatPlassRepository.saveAndFlush(new BaatPlass("4", Integer.valueOf(6), Integer.valueOf(13)));
        baatPlassRepository.saveAndFlush(new BaatPlass("5", Integer.valueOf(7), Integer.valueOf(14)));
        baatPlassRepository.saveAndFlush(new BaatPlass("6", Integer.valueOf(8), Integer.valueOf(15)));

        List<BaatPlass> baatPlassList = baatPlassRepository.findAll();
        assertEquals("4", baatPlassRepository.findOne("4").getNr());

        baatPlassList = baatPlassRepository.findAll();
        assertEquals(6,baatPlassList.size());

        baatPlassRepository.delete("4");
        assertEquals(5,(baatPlassRepository.findAll()).size());
    }
}
