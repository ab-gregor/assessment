package com.springboot.assessment;

import com.springboot.assessment.Schema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springboot.assessment.Doa.UserDoa;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class AssessmentApplication {
	@Autowired
	private UserDoa userDao;
	@PostConstruct
	public void initialiseUsers(){
		List<User> users = Stream.of(new User(1,"Thoma","thoma","Admin", null),
				new User(2,"Sagar","sagar","User", null)).collect(Collectors.toList());
		userDao.saveAll(users);
	}
	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

}
