package spring.boot.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.boot.practice.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    
    @Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query("update Customer c set c.firstName = :updatedFirstName where c.firstName = :origiFirstName")
	public void updateFirstNameByFirstName(@Param("updatedFirstName") String updatedFirstName,
										   @Param("origiFirstName") String origiFirstName);
}
