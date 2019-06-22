package com.example.myspringboot.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.mapping.Mapper;
import org.mongodb.morphia.mapping.MapperOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({org.mongodb.morphia.Morphia.class})
public class MongoDBConfig {

    @Value("${spring.data.mongodb.database}")
    private String database = "test";

    @Bean
    public Morphia morphia() {
        MapperOptions mapperOptions = new MapperOptions();
        mapperOptions.setMapSubPackages(true);
        return new Morphia(new Mapper(mapperOptions)).mapPackage("com.example.bootdemo.mongo", true);
    }

    @Bean
    public Datastore datastore() {
        Datastore datastore = morphia().createDatastore(mongoClient(), database);
        datastore.ensureIndexes();
        return datastore;
    }

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI("mongodb://localhost:27017/" + database));
    }

    @Bean
    public MongoDatabase mongoDatabase() {
        return mongoClient().getDatabase(database);
    }
}
