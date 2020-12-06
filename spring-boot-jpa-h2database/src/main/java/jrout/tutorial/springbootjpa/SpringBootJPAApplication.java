package jrout.tutorial.springbootjpa;

import jrout.tutorial.springbootjpa.dao.EmployeeRepository;
import jrout.tutorial.springbootjpa.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootJPAApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringBootJPAApplication.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Employees {}", employeeRepository.findById(1));

		Employee employee1 = new Employee("John", "Kelly", "Machine", 444);
		Employee employee = employeeRepository.insert(employee1);

		logger.info("Employee Inserted {}", employee.getId());
		logger.info("Employee Inserted {}", employee);

		employee.setAddress("NY");
		employee = employeeRepository.update(employee);

		logger.info("Employee Inserted {}", employee.getId());
		logger.info("Employee Inserted {}", employee);

		employeeRepository.remove(1);
		logger.info("Employee Removed...");

		List<Employee> all = employeeRepository.findAll();
		logger.info("All employees \n{}" , all);
	}
}