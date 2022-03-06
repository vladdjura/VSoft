package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private Scanner sc;
	public Menu() {
		
		sc = new Scanner(System.in);
		mainMenu();
	}
	private void mainMenu() {
		System.out.println("for Student press 1");
		System.out.println("for employee press 2");
		System.out.println("for exit press 0");
		try {
			int uc = sc.nextInt();
			switch(uc) {
			case 1:new StudentMenu();
				break;
			case 2:new EmployeeMenu();
				break;
			
				default: System.err.println("You choose wrong value. Please try again! ");
				mainMenu();
				
				
			}
		}catch(InputMismatchException e) {
			System.err.println("please select only digit ");
			sc = new Scanner(System.in);
			mainMenu();
			
			
		}
	}
	
}
