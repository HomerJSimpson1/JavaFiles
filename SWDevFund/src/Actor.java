// package movieDatabase;

import java.util.ArrayList;

public class Actor {
	// Instance Variables
	private String name;
	private ArrayList<Movie> movies;
	
	public Actor(String actorName, ArrayList<Movie> movieList) {
		this.name = actorName;
		this.movies = movieList;
	}
	
	public Actor(String actorName) {
		this.name = actorName;
		this.movies = new ArrayList<Movie>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
