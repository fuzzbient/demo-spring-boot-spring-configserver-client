package cfg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cfg.ConfigclientApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigclientApplication.class)
@WebAppConfiguration
public class ConfigclientApplicationTests {

	@Test
	public void contextLoads() {
	}

}
