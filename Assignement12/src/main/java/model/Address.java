package model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int houseNumber;
	private String street;
	private String city;
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int houseNumber, String street, String city) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + "]";
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
}
