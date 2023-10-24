package pt.iade.unimanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pt.iade.unimanage.models.repositories.StudentRepository;

@SpringBootApplication
public class UniManageApplication {

	public static void main(String[] args) {
		StudentRepository.populate();
		SpringApplication.run(UniManageApplication.class, args);
	}

}
