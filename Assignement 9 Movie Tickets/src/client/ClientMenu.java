package client;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Movie;
import service.AdminMyMenu;
import service.CustomerMyMenu;

public class ClientMenu{
	private long id;
	private Scanner sc;
	private static ArrayList<Movie>movies = new ArrayList<>(); 
	private static boolean flag = false;
	
	
	public ClientMenu() {
		if(!flag) {
			insertDemoData();
			flag = true;
		}
		
		
		sc = new Scanner(System.in);
	menu();	
		
	}
	private void menu() {
		System.out.println("for admin menu press 1");
		System.out.println("for customer  menu press 2");
		System.out.println("for exit 3");
		try {
		int userChoice = sc.nextInt();
		
		switch(userChoice) {
		case 1:AdminMyMenu a = new AdminMyMenu(movies);
		a.adminMenu();
		break;
		case 2: CustomerMyMenu customerMyMenu= new CustomerMyMenu(movies);
		customerMyMenu.menu();
		break;
		case 3:System.exit(0);
		default: System.out.println("you selected wrong value, please try again");
		menu();
		}
		}catch(InputMismatchException e) {
			System.err.println("please use digits only");
			sc = new Scanner(System.in);
		}
		menu();

	}
	
	private void insertDemoData() {
		movies.add(new Movie(setId(), "movie title", "movie director", "movie category"));
		movies.add(new Movie(setId(), "movie title 2", "movie director 2", "movie category 2"));
		movies.add(new Movie(setId(), "movie title 3", "movie director 3", "movie category 3"));
		
	}
	private long setId() {
		id++;
		return id;
	}
	public static ArrayList<Movie> getMovies() {
		return movies;
	}
	public static void setMovies(ArrayList<Movie> movies) {
		ClientMenu.movies = movies;
	}

	
}
