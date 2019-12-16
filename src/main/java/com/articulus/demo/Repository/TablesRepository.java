package com.articulus.demo.Repository;

import com.articulus.demo.Document.Tables;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface TablesRepository extends MongoRepository<Tables, Integer> {

    public ArrayList<Tables> findAll();

    public Tables findByTableID(int tableID);

}
