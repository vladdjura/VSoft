package student;
import java.util.Objects;

public class Student {

	
	private long sno;
	private String sName;
	private String sAdd;
	private String phoneNumber;
	private String emailId;
	public Student(long sno, String sName, String sAdd, String phoneNumber, String emailId) {
		super();
		this.sno = sno;
		this.sName = sName;
		this.sAdd = sAdd;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	public long getSno() {
		return sno;
	}
	public void setSno(long sno) {
		this.sno = sno;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAdd() {
		return sAdd;
	}
	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(emailId, phoneNumber, sAdd, sName, sno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(sAdd, other.sAdd) && Objects.equals(sName, other.sName) && sno == other.sno;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sName=" + sName + ", sAdd=" + sAdd + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + "]";
	}
	
	
	
}
