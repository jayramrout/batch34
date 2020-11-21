package jrout.tutorial.springbootservletjsp.listeners;

import jrout.tutorial.springbootservletjsp.dao.EmployeeRepository;
import jrout.tutorial.springbootservletjsp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeJMSListener {

    @Autowired
    private EmployeeRepository repository;

    @JmsListener(destination = "readmessage")
    public void receiveTextMessage(String message) {
        System.out.println("Message Received : " + message);
    }

    @JmsListener(destination = "employeeObject")
    public void receiveTextMessage(Employee employee) {
        repository.save(employee);
        System.out.println("Message Received : " + employee);
    }
}
