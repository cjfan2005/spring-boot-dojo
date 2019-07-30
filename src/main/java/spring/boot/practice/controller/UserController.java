package spring.boot.practice.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.practice.model.User;

@RestController
public class UserController {
	
	@PostMapping("users")
	ResponseEntity<String> addUser(@Valid @RequestBody User user) {
		return ResponseEntity.ok("User is Valid");
	}

}
