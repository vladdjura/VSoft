package model;

public class Cardiolog extends Doctor {

	public Cardiolog(long id, String name, String lastName, String email) {
		super(id, name, lastName, email);
		// TODO Auto-generated constructor stub
	}
	
	public void getEkg() {
		System.out.println("Get your ekg: ");
		
	}
	
	
}
