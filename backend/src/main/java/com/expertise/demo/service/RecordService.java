package com.expertise.demo.service;

import com.expertise.demo.entity.Record;

import java.util.List;

public interface RecordService {
    Record insert(Record record);
    List<Record> findByExpert(Integer eid);
    List<Record> findByProgram(Integer pid);
    String delete(Integer id);
}
