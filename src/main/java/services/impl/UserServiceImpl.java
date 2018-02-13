package services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import domain.User;
import repositories.UserRepository;
import services.UserService;

@Service("userSvc")
public class UserServiceImpl implements UserService {

	@Autowired @Qualifier("userRepo") private UserRepository userRepository;
	
	public List<User> getAll() {
		// TODO Auto-generated method stub
		List<User> users = (List<User>) this.userRepository.findAll();
		
		return users;
	}

}
