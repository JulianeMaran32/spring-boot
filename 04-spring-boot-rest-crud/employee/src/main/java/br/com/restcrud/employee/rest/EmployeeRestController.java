package br.com.restcrud.employee.rest;

import br.com.restcrud.employee.entity.Employee;
import br.com.restcrud.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author juliane.maran
 */
@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    private final EmployeeService service;

    @Autowired
    public EmployeeRestController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public List<Employee> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        Employee employee = service.findById(id);
        if (employee == null)
            throw new RuntimeException("Employee id not found - " + id);
        return employee;
    }

    @PostMapping
    public Employee createdEmployee(@RequestBody Employee employee) {
        employee.setId(0L);
        return service.save(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        Employee employee = service.findById(id);
        if (employee == null)
            throw new RuntimeException("Employee id not found - " + id);
        service.deleteById(id);
        return "Deleted employee id - " + id;
    }

}