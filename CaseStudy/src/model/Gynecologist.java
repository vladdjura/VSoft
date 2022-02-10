package model;

public class Gynecologist extends Doctor {

	public Gynecologist(long id, String name, String lastName, String email) {
		super(id, name, lastName, email);
		// TODO Auto-generated constructor stub
	}
	
	public void ultraSound(){
		System.out.println("ultra sound is going to start now");
		
		
	}
}
