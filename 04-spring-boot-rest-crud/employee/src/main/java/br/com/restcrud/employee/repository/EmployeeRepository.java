package br.com.restcrud.employee.repository;

import br.com.restcrud.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author juliane.maran
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
