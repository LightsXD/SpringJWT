package com.jwt.example.services;

import org.springframework.stereotype.Service;
 import com.jwt.example.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Pranav Patil","pranav@email.com"));
		store.add(new User(UUID.randomUUID().toString(),"Pratik Patil","pratik@email.com"));
		store.add(new User(UUID.randomUUID().toString(),"Prachi Patil","prachi@email.com"));
		store.add(new User(UUID.randomUUID().toString(),"Prajakta Patil","prajakta@email.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}

}
