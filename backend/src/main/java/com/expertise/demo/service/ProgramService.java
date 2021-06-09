package com.expertise.demo.service;

import com.expertise.demo.entity.Program;

import java.util.List;

public interface ProgramService {
    Program insert(Program program);
    List<Program> findAll();
//    Optional<Program> findById(Integer id);
    Program findById(Integer id);
    String autoChoose(Integer id);
}
