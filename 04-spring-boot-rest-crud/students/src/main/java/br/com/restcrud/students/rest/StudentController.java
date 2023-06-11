package br.com.restcrud.students.rest;

import br.com.restcrud.students.entity.Student;
import br.com.restcrud.students.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students;

    /**
     * Definindo o @PostConstruct para carregar os dados do aluno, apenas uma vez!
     */
    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Poornima", "Patel"));
        students.add(new Student("Mario", "Rossi"));
        students.add(new Student("Mary", "Smith"));
    }

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if ((studentId >= students.size()) || (studentId < 0))
            throw new StudentNotFoundException("Student id not found: " + studentId);

        return students.get(studentId);

    }


}
