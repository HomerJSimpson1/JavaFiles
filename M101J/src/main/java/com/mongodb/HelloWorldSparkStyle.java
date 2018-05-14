package com.mongodb;

import spark.Route;
import spark.Spark;
import spark.Request;
import spark.Response;

public class HelloWorldSparkStyle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spark.get("/", new Route() {
			public Object handle(final Request request, final Response response) {
				//throw new UnsupportedOperationException();
				return "Hello World From Spark.";
			}
		});
		
		
		//Spark.get
		//Spark.get(null, "/");
		
		//myRoute = new Spark.Route();
		//Spark.get(null, new Route());
	}

}
