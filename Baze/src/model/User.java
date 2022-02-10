package model;

public class User {

	private long id;
	private String phoneNumber;
	private String gender;
	private String adress;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String phoneNumber, String gender, String adress, String email) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.adress = adress;
		this.email = email;
	}

	public User( String phoneNumber, String gender, String adress, String email) {
		super();
		
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.adress = adress;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", adress=" + adress
				+ ", email=" + email + "]";
	}
	
}
