package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

