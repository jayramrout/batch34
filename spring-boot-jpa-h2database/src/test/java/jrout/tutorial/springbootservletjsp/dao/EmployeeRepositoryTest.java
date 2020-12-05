package jrout.tutorial.springbootservletjsp.dao;

import jrout.tutorial.springbootservletjsp.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void findAllByFirstName() {
        assertNotNull(employeeRepository);
        employeeRepository.save(new Employee("Peter","Pan"));
        employeeRepository.save(new Employee("Peter","Pack"));
        long count = employeeRepository.count();
        assertTrue(count == 2);

        List<Employee> employees = employeeRepository.findByFirstName("Peter");

        assertNotNull(employees);
        assertTrue(employees.size() == 2);

    }

    @Test
    void saveEmployee() {
        assertNotNull(employeeRepository);
        employeeRepository.save(new Employee(12,"Peter","Pan"));
        employeeRepository.save(new Employee(13,"Rod","Mleen"));
        long count = employeeRepository.count();
        assertTrue(count == 2);

        Employee employee = employeeRepository.findById(12).get();
        assertNotNull(employee);
        System.out.println("employee.getFirstName() = " + employee.getFirstName());
        employee.setFirstName("Rogan");
        employeeRepository.save(employee);

        employee = employeeRepository.findById(12).get();
        System.out.println("employee.getFirstName() = " + employee.getFirstName());

    }

    @Test
    void findAllByFirstNameAndLastName() {
        System.out.println();
    }
}