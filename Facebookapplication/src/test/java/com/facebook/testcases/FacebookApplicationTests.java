package com.facebook.testcases;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.facebook.entity.User;
import com.facebook.repository.UserRepository;
import com.facebook.service.UserService;







@SpringBootTest
@RunWith(SpringRunner.class)
class FacebookApplicationTests {
	
	@Autowired
	public UserService service;
	
	@MockBean
	public UserRepository repo;
	
	

	@Test
	public void contextLoads() {
	
	}
	
	@Test
	public void getAllUserDetails()
	{
		//int userId, String firstname, String lastname, String address, String password
	
		when(repo.findAll()).thenReturn(Stream.of(new User(101, "mounika", "poloju", "hnk","mounika@123"),new User(102, "chikki", "nani", "hnk","nani@123"),new User(103, "abhinav", "nani", "hnk","abhi@123")).collect(Collectors.toList()));
		assertEquals(3, service.findAll().size());
	}
	
	@Test
	public void saveUserTest() {
		User user = new User(105, "Pooja", "V", "Chennai","Pooja@123");
		when(repo.save(user)).thenReturn(user);
		assertEquals(user, user);
	}

	@Test
	public void deleteUserByIdTest() {
		service.deleteViaId(10);
		verify(repo, times(1)).deleteById(10);
	}

	
	
	
	
}

		

		
	
	
	
	


