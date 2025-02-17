package com.example.wly_demo.Service;

import com.example.wly_demo.dao.Record;
import com.example.wly_demo.dao.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService{
    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Record findRecordbyId(long id) {
        Record record =  recordRepository.findById(id).orElseThrow(RuntimeException::new);
        return record;
    }

}
