package com.example.jQuery.service;

import com.example.jQuery.model.DataModel;
import com.example.jQuery.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public List<DataModel> getAllData() {
        return dataRepository.findAll();
    }

    public DataModel addData(String data) {
        DataModel dataModel = new DataModel(data);
        return dataRepository.save(dataModel);
    }
}
