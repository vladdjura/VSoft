package assignement13Spring.model;

public class Student {
	
private long id;
private String fullName;
private String major;
private String minor;
private double courseFee;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public String getMinor() {
	return minor;
}
public void setMinor(String minor) {
	this.minor = minor;
}
public double getCourseFee() {
	return courseFee;
}
public void setCourseFee(double courseFee) {
	this.courseFee = courseFee;
}
@Override
public String toString() {
	return "Student [id=" + id + ", fullName=" + fullName + ", major=" + major + ", minor=" + minor + ", courseFee="
			+ courseFee + "]";
}
public Student(long id, String fullName, String major, String minor, double courseFee) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.major = major;
	this.minor = minor;
	this.courseFee = courseFee;
}


}
