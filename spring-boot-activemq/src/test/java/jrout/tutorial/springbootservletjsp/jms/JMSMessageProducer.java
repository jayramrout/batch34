package jrout.tutorial.springbootservletjsp.jms;

import jrout.tutorial.springbootservletjsp.controller.EmployeeControllerServlet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@SpringBootTest
public class JMSMessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    public void messageProducer(){

        jmsTemplate.send("readmessage", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("Message producer from application...");
            }
        });
    }
}
