package spring.boot.practice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import spring.boot.practice.model.Customer;
import spring.boot.practice.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationTest.class);

	@Autowired  
	CustomerRepository repository;
	
	@Before
	public void initial()
	{
		// save a couple of customers
		repository.save(new Customer("Jack", "Bauer"));
		repository.save(new Customer("Chloe", "O'Brian"));
		repository.save(new Customer("Kim", "Bauer"));
		repository.save(new Customer("David", "Palmer"));
		repository.save(new Customer("Michelle", "Dessler"));
	}
	
	@Test
	public void crudTest() {
		
		// fetch all customers
//		log.info("Customers found with findAll():");
//		log.info("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			log.info(customer.toString());
//		}
//		log.info("");
		
		// fetch customers by last name
		log.info("Customer found with findByLastName('Bauer'):");
		log.info("--------------------------------------------");
		repository.findByLastName("Bauer").forEach(bauer -> {
			log.info(bauer.toString());
		});
		// for (Customer bauer : repository.findByLastName("Bauer")) {
		// 	log.info(bauer.toString());
		// }
		log.info("");
	}
	
	// TODO find by order
	
	// TODO update data
	
	// TODO delete data
	
	// TODO where like

}
