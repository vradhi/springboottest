package com.springboot.springtest;

import com.springboot.springtest.entities.Person;
import com.springboot.springtest.repo.PersonRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringTestApplicationTests {

	//private Calculator c = new Calculator();

	//private PersonRepo personRepo;

//	public SpringTestApplicationTests(PersonRepo personRepo) {
//		this.personRepo = personRepo;
//	}

	@Test
	void contextLoads() {
	}

//	@Test
//	void testSum(){
//		int expectedResult = 17;
//		int actualResult = c.doSum(12,3,2);
//		assertThat(actualResult).isEqualTo(expectedResult);
//	}
//
//    @Test
//	void testProduct(){
//		int expectedResult = 36;
//		int actualResult = c.doProduct(12, 3);
//		assertThat(actualResult).isEqualTo(expectedResult);
//	}
//
//	@Test
//	void isPersonExistsById(){
//		Person person = new Person(123, "Bhumika", "Indore");
//		personRepo.save(person);
//		Boolean actualResult = personRepo.isPersonExistsById(123);
//		assertThat(actualResult).isTrue();
//	}
//
//	@BeforeEach
//	void setup() {
//		System.out.println("setting up");
//	}
//
//	@AfterEach
//	void tearDown() {
//		System.out.println("tearing down");
//		personRepo.deleteAll();
//	}









}
