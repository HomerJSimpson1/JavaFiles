package com.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Hello world!
 *
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

*/

public class App 
{
    public static void main( String[] args )
    {
    	MongoClientOptions options = new MongoClientOptions.Builder().connectionsPerHost(100).build();
    	// MongoClient client = new MongoClient();
    	MongoClient client = new MongoClient(new ServerAddress(), options);
    	
    	MongoDatabase db = client.getDatabase("test");
    	
    	MongoCollection<Document> coll = db.getCollection("grades");
    	
        System.out.println( "Hello World!" );
    }
}




