package service;
import java.util.ArrayList;

import model.Movie;



public interface MovieInterface {

	ArrayList<Movie>ViewAllMovies();
	
	Movie viewMovie(String title);
	
	
}
