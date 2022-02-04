package student;


public class Student {

	
	private long stundentId;
	private String name;
	private String mobileNumber;
	private String address;
	private String Course;
	
	public int calculateFee(String c) {
		switch(c) {
		case "it": return 10000;
		case "management": return 15000;
		case "art": return 20000;
		}
		return 0;
		
	}
	public long getStundentId() {
		return stundentId;
	}
	public void setStundentId(long stundentId) {
		this.stundentId = stundentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
	
	
	
}
