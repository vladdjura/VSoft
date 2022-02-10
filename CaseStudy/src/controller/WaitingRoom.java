package controller;



import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

import model.Cardiolog;
import model.Gynecologist;
import model.Patient;
import model.Pediatar;

public class WaitingRoom {
	
	private String name;
	private String lastName;
	private String email;
	private String symptoms;
	private boolean urgent;
	private int userCase;
	private int urgentCount;
	private int patientCount;
	private Scanner sc;
	private Cardiolog card;
	private Gynecologist gyne;
	private Pediatar ped;
	
	private ArrayList<Patient>urgentList;
	private ArrayList<Patient>patientList;
	public WaitingRoom() {
		sc = new Scanner(System.in);
	urgentList = new ArrayList<>();
	patientList = new ArrayList<>();
	card = new Cardiolog(1, "John", "Lenon", "jl@aol.edu");
	ped = new Pediatar(2, "Charley ", " Sheen", "ch@aol.edu");
	gyne = new Gynecologist(3, "Mark", "Williams", "mark@gmail.com");
	
	checkPoint(); 
	
		
	}
	
	private void checkPoint() {
		System.out.println("Welcome to the Hospital:");
		System.out.println("Is your case emergency? If yes press 1, in other case press 2." );
		userCase = sc.nextInt();
		urgent = userCase == 1?true:false;
		setPatient();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			doctorsAppt();
				
		}
		catch(ConcurrentModificationException e) {
			
		}
		
		
		
		
	}
	private void setPatient() {
		System.out.println("Please insert name of the patient:");
		name = sc.next();
		System.out.println("Please insert last name of the patient");
		lastName = sc.next();
		System.out.println("Please insert patient email");
		email = sc.next();
		symptoms = getSymptom();
	
		if(urgent) {
			urgentCount++;
			urgentList.add(new Patient(urgentCount, name, lastName, email, symptoms));
			System.out.println("Your waiting order number "+urgentCount);
		}
		else{
			patientCount++;
			patientList.add(new Patient(patientCount, name, lastName, email, symptoms));
			System.out.println("Your waiting order is"+(patientCount+urgentCount));
			
		}
	}
	private String getSymptom( ) {
		
		System.out.println("Please insert your symptom");
		if(urgent) {
			System.out.println("For Hearth attack press 1: ");
			System.out.println("For Xray press 2:");
			System.out.println("For labor press 3:");
			userCase = sc.nextInt();
		
		switch(userCase) {
		case 1: return"hearth attack";
		case 2: return"bone fracture";
		case 3: return "newborn";
		default:System.out.println("Wrong input please try again");
		getSymptom();
		}
		}else {
			System.out.println("for Ekg control press 1:");
			System.out.println("control your fracture press 2: ");
			System.out.println("first semester checking press 3:");
			userCase = sc.nextInt();
			switch(userCase) {
			case 1: return"ekg control";
			case 2: return"bone fracture control";
			case 3: return "first semester control";
			default:System.out.println("Wrong input please try again");
			getSymptom();
			}
		}
		return null;
		
	}
	private void doctorsAppt()throws ConcurrentModificationException {
		
		while(true) {
			if(urgentList.size()!=0) {
				for(Patient p: urgentList) {
					if(p.getSymptoms().equalsIgnoreCase("hearth attack")) {
						System.out.println(p.toString());
						System.out.println(card.toString());
						System.out.println("examination is over");
					}else if(p.getSymptoms().equalsIgnoreCase("bone fracture")) {
						System.out.println(p.toString());
						System.out.println(ped.toString());
						System.out.println("examination is over");
						
					}
					else if(p.getSymptoms().equalsIgnoreCase("newborn")) {
						System.out.println(p.toString());
						System.out.println(gyne.toString());
						System.out.println("examination is over");
				}
					urgentList.remove(p);
					
			}
		}else {
			for(Patient p: patientList) {
				if(p.getSymptoms().equalsIgnoreCase("ekg control")) {
					System.out.println(p.toString());
					System.out.println(card.toString());
					System.out.println("examination is over");
				}else if(p.getSymptoms().equalsIgnoreCase("bone fracture control")) {
					System.out.println(p.toString());
					System.out.println(ped.toString());
					System.out.println("examination is over");
					
				}
				else if(p.getSymptoms().equalsIgnoreCase("first semestar control")) {
					System.out.println(p.toString());
					System.out.println(gyne.toString());
					System.out.println("examination is over");
			}
				patientList.remove(p);
				
		}
			
	}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
}
