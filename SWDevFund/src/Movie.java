// package movieDatabase;

import java.util.ArrayList;

public class Movie {
	// Instance variables
	private String name;
	private ArrayList<Actor> actors;
	private double rating;
	
	public Movie(String movieName, ArrayList<Actor> actorList, double movieRating) {
		this.name = movieName;
		this.actors = actorList;
		this.rating = movieRating;
	}
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Actor> getActors() {
		return actors;
	}


	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
