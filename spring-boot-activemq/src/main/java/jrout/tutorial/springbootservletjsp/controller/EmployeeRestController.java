package jrout.tutorial.springbootservletjsp.controller;

import jrout.tutorial.springbootservletjsp.model.Employee;
import jrout.tutorial.springbootservletjsp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/restemp")
    public Employee getEmployeeWithId(@RequestParam(value="id") int id){
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }
}
