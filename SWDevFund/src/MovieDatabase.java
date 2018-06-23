// package movieDatabase;

import java.util.ArrayList;

public class MovieDatabase {
	// Instance Variables
	private ArrayList<Movie> movieList;
	private ArrayList<Actor> actorList;
	
	// Not part of the specs
//	public MovieDatabase(ArrayList<Movie> movies, ArrayList<Actor> actors) {
//		this.movieList = movies;
//		this.actorList = actors;
//	}
	
	public MovieDatabase() {
		this.movieList = new ArrayList<Movie>();
		this.actorList = new ArrayList<Actor>();
	}
	
	private boolean checkMovieList(String movieName) {
		boolean found = false;
		
		for (Movie movie : movieList) {
			if (movie.getName() == movieName) {
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	
	private boolean checkActorList(String actorName) {
		boolean found = false;
		
		for (Actor actor : actorList) {
			if (actor.getName() == actorName) {
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	// Add a new movie and the actors from the movie to the database
	public void addMovie(String name, String[] actors) {
		// Check to see that the movie is already in the movieList
		// If not, add it; otherwise, just return
		//if (!movieList.contains(name)) {
		if (!checkMovieList(name)) {
			for (String actorName : actors) {
				if (!checkActorList(actorName)) {
					// Add the actor
					//Movie new Movie = 
					// ArrayList<Movie> actorMovieList = new ArrayList<Movie>();
					//actorMovieList.add()
					Actor newActor = new Actor(actorName);
					// Add this movie to the actor's movie list
					// newActor.
					
				}
			}
			
			
//			ArrayList<Actor> actorList = new ArrayList<Actor>(); 
//			for (String actor: actors) {
//				if (!actors.contains(actor)) {
//					
//					actorList.add(actor);
//				}
//			}
			
			//movieList.add(new Movie(name, actors));
		}
		
		// For each actor in the movie, check to see if they are in the actorList.
		// If not, add the actor to the actorList
		
		
	}
	
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public ArrayList<Actor> getActorList() {
		return actorList;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
