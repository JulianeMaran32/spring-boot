package br.com.cursoudemy.hiberantejpacrud.service;

import br.com.cursoudemy.hiberantejpacrud.entity.Student;
import br.com.cursoudemy.hiberantejpacrud.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    // injetar o repository
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE and UPDATE
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    // READ - buscar por ID
    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // READ - buscar todos
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // READ - buscar pelo sobrenome
    public List<Student> listByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    // DELETE
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public void deleteAll() {
        studentRepository.deleteAll();
    }

}
