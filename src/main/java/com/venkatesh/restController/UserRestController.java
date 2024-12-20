package com.venkatesh.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkatesh.entity.User;
import com.venkatesh.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<String> saveData(@RequestBody User user){
		String msg =  userService.upsartUserData(user);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
		
	}
	
	@PutMapping("/user")
	public ResponseEntity<String> updateData(@RequestBody User user){
		String msg =  userService.upsartUserData(user);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@PostMapping("/user/{userId}")
	public ResponseEntity<Optional<User>> findData(@PathVariable Integer userId){
		Optional<User> msg =  userService.findUserById(userId);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<String> delteData(@PathVariable Integer userId){
		String msg =  userService.deleteUserById(userId);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	

}
