package jrout.tutorial.springbootservletjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.jms.annotation.EnableJms;

@ServletComponentScan
@SpringBootApplication
@EnableJms
public class SpringBootServletJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServletJspApplication.class, args);
	}

}
