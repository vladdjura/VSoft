package model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String sName;
	private int courseFee;
	@AttributeOverrides({
		@AttributeOverride(name = "houseNumber",column = @Column(name = "house_number")),
		@AttributeOverride(name = "street",column = @Column(name = "street_name"))
	})
	private Address adress ;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public Student(int studentId, String sName, int courseFee, Address adress) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.courseFee = courseFee;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sName=" + sName + ", courseFee=" + courseFee + ", adress="
				+ adress + "]";
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
