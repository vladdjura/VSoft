package model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String eName;
	private double salary;
	private String designation;
	@AttributeOverrides({
		@AttributeOverride(name = "houseNumber",column = @Column(name = "house_number")),
		@AttributeOverride(name = "street",column = @Column(name = "street_name"))
		
	})
	private Address address;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(String eName, double salary, String designation, Address address) {
		super();
		this.eName = eName;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", eName=" + eName + ", salary=" + salary + ", designation="
				+ designation + ", address=" + address + "]";
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
