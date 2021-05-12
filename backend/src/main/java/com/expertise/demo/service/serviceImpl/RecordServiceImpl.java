package com.expertise.demo.service.serviceImpl;

import com.expertise.demo.entity.Record;
import com.expertise.demo.repository.RecordRepository;
import com.expertise.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordRepository recordRepository;

    public Record insert(Record record){
        return recordRepository.save(record);
    }

    public List<Record> findByExpert(Integer eid){
        return recordRepository.findByExpertID(eid);
    }
    public List<Record> findByProgram(Integer pid){
        return recordRepository.findByProgramID(pid);
    }

    public String delete(Integer id){
         recordRepository.deleteById(id.toString());
         return "success";
    }

}
