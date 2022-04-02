
package com.facebook.service;

import java.util.List;
import java.util.Optional;

import com.facebook.entity.User;


public interface UserService {

	public List<User> findAll();
	public User findById(int id);
	public void save(User user);
	
	public Optional<User> getByuserId(int id);
	public void deleteViaId(int id);
	public void update(User user);


}
