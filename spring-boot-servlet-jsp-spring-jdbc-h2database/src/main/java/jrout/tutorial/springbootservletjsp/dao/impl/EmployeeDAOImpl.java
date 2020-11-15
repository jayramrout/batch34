package jrout.tutorial.springbootservletjsp.dao.impl;

import jrout.tutorial.springbootservletjsp.dao.IEmployeeDAO;
import jrout.tutorial.springbootservletjsp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee getEmployee(int empId) {
        Employee employee = jdbcTemplate.queryForObject("select * from employees where id = ?", new Object[]{empId}, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee(empId, resultSet.getString("first_name"), resultSet.getString("last_name"));
                employee.setAddress(resultSet.getString("address"));
                return employee;
            }
        });

        return employee;
    }


    @Override
    public List<Employee> getEmployeeList(String fname) {
        List<Employee> employees = jdbcTemplate.query("select * from employees where first_name = ? ", new Object[]{fname},
                new RowMapper<Employee>() {
                    @Override
                    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                        Employee employee = new Employee(resultSet.getInt("id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"));
                        employee.setAddress(resultSet.getString("address"));
                        return employee;
                    }
                }
        );

        return employees;
    }
}
