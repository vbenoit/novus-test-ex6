package services;

import java.util.List;

import domain.User;

public interface UserService {

	List<User> getAll();

	void addUser();

	void updateUser();

}
