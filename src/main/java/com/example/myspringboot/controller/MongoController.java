package com.example.myspringboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/mongo")
public class MongoController {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Value("${spring.data.mongodb.database}")
    private String database;

    @GetMapping("/insert")
    public JSONObject test() {
        MongoClient mongoClient = new MongoClient(new MongoClientURI(uri));
        MongoDatabase mongoDatabase = mongoClient.getDatabase(this.database);
        for (int j = 0; j < 1000; j++) {
            List<Document> documentList = new ArrayList<>();
            Document document = null;
            Random random = new Random(10);
            for (int i = 0; i < 1000; i++) {
                document = new Document();
                document.append("name", UUID.randomUUID().toString());
                List<Document> contacts = new ArrayList<>();
                contacts.add(new Document("phone", random.nextInt(30)+"").append("name", random.nextInt(30)+""));
                contacts.add(new Document("phone", random.nextInt(30)+"").append("name", random.nextInt(30)+""));
                contacts.add(new Document("phone", random.nextInt(30)+"").append("name", random.nextInt(30)+""));
                document.append("contacts", contacts);
                document.append("createTime", new Date());
                documentList.add(document);
            }
            System.out.println("sssss>>>>" + j);
            mongoDatabase.getCollection("user_contacts").insertMany(documentList);
        }
        return new JSONObject();
    }

    @GetMapping("/find")
    public JSONObject test2() {
        MongoClient mongoClient = new MongoClient(new MongoClientURI(uri));
        MongoDatabase mongoDatabase = mongoClient.getDatabase(this.database);

        Document elemMatch = new Document("$elemMatch", new Document("phone", "3"));
        Document document = new Document("contacts", elemMatch);

        MongoCursor<Document> user_contacts = mongoDatabase.getCollection("user_contacts").find(document).iterator();
        while (user_contacts.hasNext()) {
            Document next = user_contacts.next();
            System.out.println(JSON.toJSONString(next));
        }
        return new JSONObject();
    }

}

