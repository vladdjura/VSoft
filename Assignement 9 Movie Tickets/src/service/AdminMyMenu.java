package service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import client.ClientMenu;
import model.Movie;

public class AdminMyMenu implements MovieInterface {

	private ArrayList<Movie>movies ;
	private Scanner sc;
	private String title;
	private String director;
	private String category;
	private long id = 3;
	
	
	
	
	public AdminMyMenu(ArrayList<Movie> movies) {
		super();
		this.movies = movies;
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
	public void addMovie() {
		System.out.println("please insert movie title: ");
		title = sc.next();
		System.out.println("please insert movie director: ");
		director = sc.next();
		setCategory();
		movies.add(new Movie(setId(), title, director, category));
		System.err.println(movies.size()+"size");
		ClientMenu.setMovies(movies);
	}
	private void setCategory() {
		

System.out.println("please insert movie category: ");
		System.out.println("1. comedy");
		System.out.println("2. thriller");
		System.out.println("3. Sci-Fi");
		System.out.println("4. drama");
		try {
		
			int userChoice = sc.nextInt();
			switch(userChoice) {
			case 1:this.category = "comedy";
			break;
			case 2:this.category = "thriller";
			break;
			case 3:this.category = "Sci-Fi";
			break;
			case 4:this.category ="drama";
			break;
			default:System.out.println("you are choosing wrong value");
			setCategory();
			
			
			}
		}catch(InputMismatchException e) {
			System.err.println("please use digits only");
			sc = new Scanner(System.in);
			
			setCategory();
		
		}
		
		
		
	}
	private long setId() {
		id++;
		return id;
	}
	
	private void update(String title) {
		Movie m = viewMovie(title);
		if(m!= null) {
		
		System.out.println("please insert updated movie title");
		title = sc.next();
		System.out.println("please insert movie director: ");
		director = sc.next();
		setCategory();
		movies.set(movies.indexOf(m),new Movie(m.getId(), title, director, category));
		}
		else {
			System.err.println("wrong movie title");
		}
		
		
	}
	private void delete(String title) {
		Movie m = viewMovie(title);
		if(m!= null) {
			movies.remove(m);
		}
		else {
			System.err.println("wrong movie title");
		}
	}
	
	public void adminMenu() {
		System.out.println("press 1 to add movie");
		System.out.println("press 2 to view all movies");
		System.out.println("press 3 to view one movie");
		System.out.println("press 4 to update movie");
		System.out.println("press 5 to delete movie");
		System.out.println("press 6 to go back");
		int userChoice = 0;
		try {
			userChoice = sc.nextInt();	
		}catch(InputMismatchException e) {
			System.err.println("please use digits only");
			adminMenu();
		}
		switch(userChoice) {
		case 1:addMovie();
		break;
		case 2:ViewAllMovies();
		break;
		case 3: System.out.println("please insert movie title");
		sc.skip("\\R?");
		title = sc.nextLine();
		viewMovie(title);
		break;
		case 4: System.out.println("please insert movie title");
		sc.skip("\\R?");
		
		title = sc.nextLine();
			update(title);
			break;
		case 5:System.out.println("please insert movie title");
		sc.skip("\\R?");
		title = sc.nextLine(); 
			delete(title);
			break;
		case 6: 
			new ClientMenu();
			default:System.out.println("you choose number, please try again");
			
		
		}
		adminMenu();
	}
}
