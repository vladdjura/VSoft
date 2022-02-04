package loginManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDaoImpl implements Authorization{
	
	private long id;
	private String fName;
	private String lName;
	private String email;
	private String username;
	private String password;
	
	private ArrayList<User>arrayList;
	private Scanner sc;
	
	public UserDaoImpl() {
	arrayList = new ArrayList<>();
	sc = new Scanner(System.in);
	id = 1;
	
	}
	
	@Override
	public void register() {
		System.out.println("insert new user");
		System.out.println("please insert first name: ");
		fName = sc.next();
		System.out.println("please insert last name");
		lName = sc.next();
		System.out.println("please insert email");
		email = sc.next();
		System.out.println("please insert username");
		username = sc.next();
		System.out.println("please insert password");
		password = sc.next();
		arrayList.add(new User(id, fName, lName, email, username, password));
		id++;
	}

	@Override
	public boolean verifiedUsed(String username, String password) {
		for(User u:arrayList) {
			if(u.getUserName().equals(username)&&u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
