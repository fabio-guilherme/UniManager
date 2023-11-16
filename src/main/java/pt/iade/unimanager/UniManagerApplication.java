package pt.iade.unimanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pt.iade.unimanager.models.repositories.StudentRepository;

@SpringBootApplication
public class UniManagerApplication {

	public static void main(String[] args) {
		StudentRepository.populate();
		SpringApplication.run(UniManageApplication.class, args);
	}

}
