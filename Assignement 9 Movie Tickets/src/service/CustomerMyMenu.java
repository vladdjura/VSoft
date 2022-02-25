package service;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.Scanner;

import client.ClientMenu;
import model.BookTickets;
import model.Movie;

public class CustomerMyMenu implements MovieInterface {
	private long id;
	
	private ArrayList<Movie>movies ;
	private ArrayList<BookTickets>bookTickets;
	
	private Scanner sc;
	
	public CustomerMyMenu(ArrayList<Movie> movies) {
		super();
		System.err.println(ClientMenu.getMovies().size());
		this.movies = ClientMenu.getMovies();
		bookTickets = new ArrayList<>();
		sc = new Scanner(System.in);
		
	}

	
	@Override
	public ArrayList<Movie> ViewAllMovies() {
		
		for(Movie m: movies) {
			System.out.println(m.toString());
		}
		return movies;
	}

	@Override
	public Movie viewMovie(String title) {
		
		for(Movie m:movies) {
			if(title.equalsIgnoreCase(m.getTitle())){
				
				System.out.println(m.toString());
				return m;
			}
			
		}
	System.err.println("movie with title "+title+" is not exist");
		return null;
	}
	public void bookMovieTicket() {
		ViewAllMovies();
		System.out.println("please insert movie title: ");
		sc.skip("\\R?");
		
		String userChoice = sc.nextLine();
		Movie m = viewMovie(userChoice);
		
		if(m!= null) {
			System.out.println("please insert your name");
			String name = sc.nextLine();
			System.out.println("please insert number of tickets:");
			try {
				int quantity = sc.nextInt();
				bookTickets.add(new BookTickets(increaseId(), name, m.getTitle(), quantity));
				System.out.println("you have book the tickets succsessfuly");
				
			}catch(InputMismatchException e){
				System.err.println("please input a number, not a caracter ");
				bookMovieTicket();
				
			}
			
		}
	}
	private long increaseId() {
		id++;
		return id;
	}
	public void removeReservation() {
		for(BookTickets b:bookTickets) {
			System.out.println(b.toString());
		}
		System.out.println("to cancel your reservation put your reservation id");
		try {
			int userChoice = sc.nextInt();
			for(BookTickets b:bookTickets) {
				if(b.getId()==userChoice) {
					bookTickets.remove(b);
					System.out.println("you have deleted your reservation");
				}
			}
		}catch(InputMismatchException e) {
			System.err.println("please input a number, not a caracter ");
			removeReservation();
		}catch(ConcurrentModificationException e) {
			
		}
		
	}public void menu() {
		System.out.println("press 1 to view movie: ");
		System.out.println("press 2 to view all movies");
		System.out.println("press 3 to book movie ticket");
		System.out.println("press 4 to cancel reservation");
		System.out.println("press 5 to go back");
		try {
			int userChoice = sc.nextInt();
			
			switch(userChoice) {
			case 1: System.out.println("please insert movie title");
			sc.skip("\\R?");
			String title = sc.nextLine();
			viewMovie(title);
			break;
			case 2: ViewAllMovies();
			break;
			case 3: bookMovieTicket();
			break;
			case 4: removeReservation();
			break;
			case 5: new ClientMenu();
			break;
			default:System.out.println("you select wrong value please choose again");
			menu();
			}
		}catch(InputMismatchException e) {
			System.err.println("please input a number, not a caracter ");
			sc = new Scanner(System.in);
			menu();
		}
		menu();
	}
}
