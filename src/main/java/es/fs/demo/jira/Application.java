package es.fs.demo.jira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Running Spring Boot Application...");
		SpringApplication.run(Application.class, args);
		System.out.println("Spring Boot Application startup completed.");
	}

}
