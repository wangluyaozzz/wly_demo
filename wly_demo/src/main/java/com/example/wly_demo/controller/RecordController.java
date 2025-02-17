package com.example.wly_demo.controller;

import com.example.wly_demo.Service.RecordService;
import com.example.wly_demo.dao.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;
    @GetMapping("/record/{id}")
    public Record findRecordbyId(@PathVariable long id){
        return recordService.findRecordbyId(id);
    }
}
