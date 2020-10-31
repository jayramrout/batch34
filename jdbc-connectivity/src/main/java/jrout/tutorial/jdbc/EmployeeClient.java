package jrout.tutorial.jdbc;

import jrout.tutorial.jdbc.domain.Employee;
import jrout.tutorial.jdbc.service.IEmployee;
import jrout.tutorial.jdbc.service.impl.EmployeeImpl;

public class EmployeeClient {
    public static void main(String[] args) {
        IEmployee employee = new EmployeeImpl();

        Employee employees = employee.getEmployees(10001);

    }
}
