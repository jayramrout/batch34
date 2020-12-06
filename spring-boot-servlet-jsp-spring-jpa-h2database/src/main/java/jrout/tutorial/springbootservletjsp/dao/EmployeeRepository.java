package jrout.tutorial.springbootservletjsp.dao;

import jrout.tutorial.springbootservletjsp.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    public List<Employee> findByFirstName(String fname);
    public List<Employee> findAllByFirstNameAndLastName(String fname, String lname);
    // select * from employees where first_name = ? and last_name = ?

    public Employee findById(int id); /// select  * from employees where id = ?

}
