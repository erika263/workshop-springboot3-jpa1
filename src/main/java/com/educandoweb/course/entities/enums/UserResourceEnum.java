package com.educandoweb.course.entities.enums;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

//@RestController
//@RequestMapping(value = "/users")
public class UserResourceEnum {
	
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findALL(){
		
	List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}" )
	public ResponseEntity<User> findById(@PathVariable long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
