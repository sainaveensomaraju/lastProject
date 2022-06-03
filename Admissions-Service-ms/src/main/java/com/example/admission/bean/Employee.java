package com.example.admission.bean;

public class Employee {
	
	private String Id;
	private String firstname;
	private String lastname;
	private String specialty;
	
	public Employee() {
		
	}

	public Employee(String id, String firstname, String lastname, String specialty) {
	
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialty = specialty;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	

}
