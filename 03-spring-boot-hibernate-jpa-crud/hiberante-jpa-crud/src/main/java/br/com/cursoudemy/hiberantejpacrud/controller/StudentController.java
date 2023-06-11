package br.com.cursoudemy.hiberantejpacrud.controller;

import br.com.cursoudemy.hiberantejpacrud.entity.Student;
import br.com.cursoudemy.hiberantejpacrud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/student")
@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable(name = "id") Long id) {
        return studentService.findStudentById(id);
    }

    @GetMapping
    public List<Student> getAll() {
        return studentService.findAll();
    }

    @GetMapping("/list")
    public List<Student> getStudentByLastName(@RequestParam String lastName) {
        return studentService.listByLastName(lastName);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable(name = "id") Long id) {
        studentService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllStudent() {
        studentService.deleteAll();
    }

}