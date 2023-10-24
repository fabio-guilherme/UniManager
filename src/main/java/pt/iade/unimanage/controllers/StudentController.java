package pt.iade.unimanage.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.unimanage.models.*;
import pt.iade.unimanage.models.repositories.StudentRepository;

@RestController
@RequestMapping(path = "/api/students")

public class StudentController {
    private Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudents() {
        List<Student> students = StudentRepository.getStudents();
        logger.info("Getting students");
        return students;
    }
}