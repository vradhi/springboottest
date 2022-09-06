package com.springboot.springtest;

import com.springboot.springtest.entities.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);

		Person person = new Person(104, "vradhi", "Indore");
		System.out.println(person);
	}



}
