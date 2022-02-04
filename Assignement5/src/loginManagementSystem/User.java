package loginManagementSystem;

public class User {
private long id;
private String fName;
private String lName;
private String email;
private String userName;
private String password;
public User(long id, String fName, String lName, String email, String userName, String password) {
	super();
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.email = email;
	this.userName = userName;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", userName=" + userName
			+ ", password=" + password + ", getId()=" + getId() + ", getfName()=" + getfName() + ", getlName()="
			+ getlName() + ", getEmail()=" + getEmail() + ", getUserName()=" + getUserName() + ", getPassword()="
			+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
