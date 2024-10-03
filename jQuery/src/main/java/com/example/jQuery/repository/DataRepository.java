package com.example.jQuery.repository;



import com.example.jQuery.model.DataModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<DataModel, String> {
}
