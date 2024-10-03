package com.example.jQuery.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class DataModel {

    @Id
    private String id;
    private String data;

    public DataModel() {}

    public DataModel(String data) {
        this.data = data;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
