package com.facebook.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.facebook.entity.User;
import com.facebook.repository.UserRepository;


@Service
public class UserServiceImp  implements UserService{
	
	
	
	@Autowired
	public UserRepository userRepo;
	


	@Override
	public List<User> findAll() {                        
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}                                           

	@Override
	public User findById(int id) {
		
		// TODO Auto-generated method stub
		Optional<User> userOp= userRepo.findById(id);
		if(userOp.isPresent())
		{
			return userOp.get();
		}
		return null;
	}

	@Override
	public void save(User user) {
		
		// TODO Auto-generated method stub
		userRepo.save(user);
	}
	 @Override
	public Optional<User> getByuserId(int id) {
		// TODO Auto-generated method stub
		 
		return userRepo.findById(id);
	}

	@Override
	public void deleteViaId(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}
	
	   

		@Override
		public void update(User user) {
			// TODO Auto-generated method stub
			userRepo.save(user);
		}

}
