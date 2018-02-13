package repositories.impl;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import domain.User;
import repositories.UserRepository;

@Repository("userRepo")
public class UserRepositoryImpl extends SimpleJpaRepository<User, Long> 
	implements UserRepository {

	private CriteriaBuilder cb;
    private EntityManager em;
	
	public UserRepositoryImpl(EntityManager em) {
		super(User.class, em);
		this.em = em;
        this.cb = em.getCriteriaBuilder();
	}

}