package model;

public class Patient {

	private long id;
	private String name;
	private String lastName;
	private String email;
	private String symptoms;
	public Patient(long id, String name, String lastName, String email, String symptoms) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.symptoms = symptoms;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", symptoms="
				+ symptoms + "]";
	}
	
	
}
