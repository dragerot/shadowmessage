package net.toregard;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ShadowMessageApplication.class)
@WebAppConfiguration
public class ShadowMessageApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertTrue(true);
	}

}
