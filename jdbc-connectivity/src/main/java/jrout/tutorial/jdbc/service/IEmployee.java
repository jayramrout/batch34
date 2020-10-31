package jrout.tutorial.jdbc.service;

import jrout.tutorial.jdbc.domain.Employee;

import java.util.List;

public interface IEmployee {
    public List<Employee> getEmployees(String firstName, String gender);
    public Employee getEmployees(int empId);

}
