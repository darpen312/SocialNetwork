package com.project.socialmedia.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.socialmedia.dal.entities.User;
import com.project.socialmedia.dal.repos.UserRepository;

@SpringBootTest
class SocialMediaDalApplicationTests {
	
	//test repository
	@Autowired
	private UserRepository userRepository;

	@Test
	public void testCreateUser() {
		
		User user = new User();
		user.setName("John Doe");
		user.setAge(20);
		user.setLocation("Ireland");
		userRepository.save(user);
		
	}
	
	@Test
	public void findUserByID() {
		Optional<User> userOptional = userRepository.findById(1);
		if(userOptional.isPresent())
		{
			System.out.println(userOptional.get().getName());
		}
		else
		{
			System.out.println("Error: User not found.");
		}
	}
	
	/*Write two junit tests to Update and Delete
	*Resources: https://www.baeldung.com/ e.g. https://www.baeldung.com/spring-data-jpa-delete, https://junit.org/junit5/docs/current/user-guide/
	*/

}
