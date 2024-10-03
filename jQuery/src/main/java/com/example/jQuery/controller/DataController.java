package com.example.jQuery.controller;

import com.example.jQuery.model.DataModel;
import com.example.jQuery.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/data")
    public List<DataModel> getData() {
        return dataService.getAllData();
    }

    @PostMapping("/data")
    public DataModel addData(@RequestBody String newData) {
        return dataService.addData(newData);
    }
}
