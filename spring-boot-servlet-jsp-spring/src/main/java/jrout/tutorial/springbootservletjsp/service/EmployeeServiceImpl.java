package jrout.tutorial.springbootservletjsp.service;

import jrout.tutorial.springbootservletjsp.dao.IEmployeeDAO;
import jrout.tutorial.springbootservletjsp.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.springbootservletjsp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Override
    public Employee getEmployee(int empId) {
        Employee employee = employeeDAO.getEmployee(empId);
        if(empId == 100){
            employee.setSalary(200f);
        }
        return employee;
    }

    @Override
    public List<Employee> getEmployeeList(String fname) {
        List<Employee> employeeList = employeeDAO.getEmployeeList(fname);
        return employeeList;
    }
}
