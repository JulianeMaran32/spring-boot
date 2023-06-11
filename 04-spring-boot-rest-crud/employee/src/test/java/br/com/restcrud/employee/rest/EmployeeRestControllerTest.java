package br.com.restcrud.employee.rest;

import br.com.restcrud.employee.entity.Employee;
import br.com.restcrud.employee.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmployeeRestControllerTest {

    public Long id = 1L;
    public String firstName = "Juliane";
    public String lastName = "Maran";
    public String email = "julianemaran@gmail.com";

    @Mock
    private EmployeeService service;

    @InjectMocks
    private EmployeeRestController restController;

    @Test
    void getAll() {
        restController.getAll();
    }

    @Test
    void getEmployeeById() {

    }

    @Test
    void createdEmployee() {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        restController.createdEmployee(employee);
    }

    @Test
    void updateEmployee() {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        restController.updateEmployee(employee);
    }

    @Test
    void deleteEmployee() {

    }

}