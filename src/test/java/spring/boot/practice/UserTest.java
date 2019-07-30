package spring.boot.practice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import spring.boot.practice.model.User;
import spring.boot.practice.repository.UserRepository;


@TestPropertySource(locations = "classpath:test.properties")
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	private static final Logger log = LoggerFactory.getLogger(UserTest.class);

	@Autowired
	UserRepository repository;
	
	@Before
	public void initial()
	{
		// save a couple of customers
		repository.save(new User(1, "1mail", "Bauer"));
		repository.save(new User(2, "2mail", "O'Brian"));
		repository.save(new User(3, "3mail", "Bauer2"));
		repository.save(new User(4, "4mail", "Palmer"));
		repository.save(new User(5, "5mail", "Dessler"));
	}
	
	@Test
	public void listAllUsersTest() {
		// fetch all customers
		log.info("Users found with findAll():");
		log.info("-------------------------------");
		for (User user : repository.findAll()) {
			log.info(user.getId() +","+ user.getName() + "," + user.getEmail() );
		}
		log.info("");
	}
}
