package controllers;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import domain.User;
import services.UserService;

/**
 * User Controller
 */
@Controller
@EnableAutoConfiguration
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired @Qualifier("userSvc") UserService userService;
	
	//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
	@CrossOrigin
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "User home!";
    }
    
    /**
     * Get the complete list of users
     * @param
     * @return the users
     */
	@CrossOrigin
    @RequestMapping("/users")
    public @ResponseBody List<User> getUserList() {
        
    	this.logger.info("Get the complete list of user");
    	
    	return userService.getAll();
    }
	
	/**
     * Add user with values ending with first 3 letters of candidate name
     * @param
     * @return the users
     */
	@CrossOrigin
    @RequestMapping("/add-user-ben")
    public @ResponseBody List<User> addUser() {
        
		this.logger.info("Add user with values ending "
				+ "with first 3 letters of candidate name");
		userService.addUser();
		
    	this.logger.info("Get the complete list of user");
    	return userService.getAll();
    }
    
}
