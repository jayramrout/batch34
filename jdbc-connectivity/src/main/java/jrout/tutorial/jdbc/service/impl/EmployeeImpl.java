package jrout.tutorial.jdbc.service.impl;

import jrout.tutorial.jdbc.domain.Employee;
import jrout.tutorial.jdbc.service.IEmployee;

import java.util.List;

public class EmployeeImpl implements IEmployee {
    @Override
    public List<Employee> getEmployees(String firstName, String gender) {
        return null;
    }

    @Override
    public Employee getEmployees(int empId) {
        return null;
    }
}
