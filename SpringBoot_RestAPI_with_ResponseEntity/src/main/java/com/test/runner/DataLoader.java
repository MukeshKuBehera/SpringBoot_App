package com.test.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.test.entity.User;
import com.test.repo.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private UserRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		
		User u1=new User();
		
		u1.setId(101);
		u1.setUserName("John Cena");
		u1.setPassword("rertert345435");
		u1.setEmailId("john@gmail.com");
		u1.setMobileNo("54664646645");
		u1.setCity("Hyderabad");
		
User u2=new User();
		
		u2.setId(102);
		u2.setUserName("Johny Sink");
		u2.setPassword("rertert345435");
		u2.setEmailId("johny@gmail.com");
		u2.setMobileNo("85758383334");
		u2.setCity("Delhi");
		
User u3=new User();
		
		u3.setId(103);
		u3.setUserName("Tom Cruise");
		u3.setPassword("rertert345435");
		u3.setEmailId("tom@gmail.com");
		u3.setMobileNo("54664646645");
		u3.setCity("Bbsr");
		
		List<User> users=Arrays.asList(u1,u2,u3);
		
		repo.saveAll(users);
	}

}
