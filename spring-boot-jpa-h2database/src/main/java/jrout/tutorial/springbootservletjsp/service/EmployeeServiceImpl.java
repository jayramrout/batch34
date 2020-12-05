package jrout.tutorial.springbootservletjsp.service;

import jrout.tutorial.springbootservletjsp.dao.EmployeeRepository;
import jrout.tutorial.springbootservletjsp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(int empId) {
        System.out.println("Entered geEmployee withId "+ empId);
        Employee employee = employeeRepository.findById(empId).get();

        if(empId == 100){
            employee.setSalary(200f);
        }
        return employee;
    }

    @Override
    public List<Employee> getEmployeeList(String fname) {
        List<Employee> allByFirstName = employeeRepository.findByFirstName(fname);
        return allByFirstName;
    }
}
