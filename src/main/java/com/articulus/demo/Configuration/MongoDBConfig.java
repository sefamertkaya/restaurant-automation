package com.articulus.demo.Configuration;


import com.articulus.demo.Repository.TablesRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = TablesRepository.class)
public class MongoDBConfig {


}
