package com.careem.school;

import com.careem.school.entity.Student;
import com.careem.school.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot2RestServiceBasicApplication {
	private static StudentRepository studentRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringBoot2RestServiceBasicApplication.class, args);
		studentRepository = appContext.getBean(StudentRepository.class);
		studentRepository.save(new Student("mohamed", "3433"));
	}

}
