package spring.boot.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;



@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotBlank(message = "Name is mandatory") // must be not null and their trimmed length must be greater than zero
//	@Size(min = 5, max = 25)
	private String name;
	
	@NotBlank(message = "Name is mandatory")
	@Email
	private String email;
	
	
	public User() {}
	
	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
