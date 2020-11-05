package jrout.tutorial.jdbc.service;

import jrout.tutorial.jdbc.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getEmployees(String firstName, String gender);
    public Employee getEmployees(int empId);

}
