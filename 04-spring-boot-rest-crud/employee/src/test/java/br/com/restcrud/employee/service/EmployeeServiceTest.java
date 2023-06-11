package br.com.restcrud.employee.service;

import br.com.restcrud.employee.entity.Employee;
import br.com.restcrud.employee.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    public Long id = 1L;
    public String firstName = "Juliane";
    public String lastName = "Maran";
    public String email = "julianemaran@gmail.com";


    @Mock
    private EmployeeRepository repository;

    @InjectMocks
    private EmployeeService service;

    @Test
    void findAll() {
        service.findAll();
    }

    @Test
    void findById() {

    }

    @Test
    void save() {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        service.save(employee);
    }

    @Test
    void deleteById() {
        service.deleteById(id);
    }

}