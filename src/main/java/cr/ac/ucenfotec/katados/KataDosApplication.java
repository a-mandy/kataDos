package cr.ac.ucenfotec.katados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KataDosApplication {

	public static void main(String[] args) {
		SpringApplication.run(KataDosApplication.class, args);
		Generator generator = new Generator();
		generator.generate(36);
		
	}
}
