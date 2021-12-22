package tiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("tiny")
@EntityScan("tiny.domain")
@SpringBootApplication
public class TinyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyApplication.class, args);
	}

}
