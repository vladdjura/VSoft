package loginManagementSystem;

import java.util.Scanner;

public class UserClient {

	private Scanner sc;
	private UserDaoImpl impl;
	
	
	public UserClient() {
		impl = new UserDaoImpl();
		sc = new Scanner(System.in);
		menu();
	}
	private void menu() {
		System.out.println("press 1 to register: ");
		System.out.println("press 2 for login: ");
		System.out.println("press 3 for exit:");
		
		int userChoice = sc.nextInt();
		if(userChoice == 1) {
			impl.register();
		}
		else if(userChoice == 2) {
			System.out.println("insert username: ");
			String username = sc.next();
			System.out.println("insert password");
			String password = sc.next();
			if(impl.verifiedUsed(username, password)) {
				System.out.println("you have logged in succsesfully: ");
			}
			else {
				System.err.println("username and password wrong");
			}
		}
		else if(userChoice == 3) {
			System.out.println("goodbye");
			System.exit(0);
		}
		else {
			System.err.println("you choose invalid value");
		}
		menu();
		 
	}
}
