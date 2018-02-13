package domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
    private Long iduser;
	
	private String firstname;
	private String lastname;
	private String qualification;
	
	public Long getIduser() {
		return iduser;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	protected User(){}
	
	public User(String pFirstname, String pLastname, String pQualification) {
		iduser = generateId();
        setFirstname(pFirstname);
        setLastname(pLastname);
        setQualification(pQualification);
	}
	
	private Long generateId() {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		return timestamp.getTime();
	}

	
	
}
