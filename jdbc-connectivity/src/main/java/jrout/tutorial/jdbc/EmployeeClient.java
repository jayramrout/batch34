package jrout.tutorial.jdbc;

import jrout.tutorial.jdbc.domain.Employee;
import jrout.tutorial.jdbc.service.IEmployeeService;
import jrout.tutorial.jdbc.service.impl.EmployeeServiceServiceImpl;

public class EmployeeClient {
    public static void main(String[] args) {
        IEmployeeService employee = new EmployeeServiceServiceImpl();

        Employee employees = employee.getEmployees(10001);

    }
}
