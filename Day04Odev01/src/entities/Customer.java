package entities;

import java.util.Date;

import abstracts.CustomerService;

public class Customer implements CustomerService{
	private int id;
	private String firstName;
	private String LastName;
	private String dateOfBirth;
	private String nationalityId;

	/*
	public Customer() {

	}
	*/
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalityId) {

		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	

}
