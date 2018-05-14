package com.mongodb;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient client = new MongoClient();
		MongoDatabase db = client.getDatabase("course");
		MongoCollection<Document> coll = db.getCollection("insertTest");
		
		coll.drop();
		Document smith = new Document("name", "Smith")
				.append("age",  30)
				.append("profession",  "programmer");
	}

}
