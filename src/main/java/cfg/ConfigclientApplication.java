package cfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigclientApplication {
	
	@RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    // --spring.profiles.active=dev on startup
	public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }
}
