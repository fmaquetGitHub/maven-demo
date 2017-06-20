package appli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import appli.domain.Biere;
import appli.repository.BiereRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory
			.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner initialisationBieres(BiereRepository biereRepo) {
		return (args) -> {
			log.info("Insertion de bières...");
			biereRepo.save(new Biere("Leffe", 6.6f));
			biereRepo.save(new Biere("Kaarmeliett", 8.0f));
			biereRepo.save(new Biere("Angélus blonde", 7f));
			biereRepo.save(new Biere("Queue de Charrue triple", 9f));
		};
	}

}
