package com.expertise.demo.service.serviceImpl;

import com.expertise.demo.entity.Program;
import com.expertise.demo.repository.ProgramRepository;
import com.expertise.demo.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramServiceImpl implements ProgramService {
    @Autowired
    private ProgramRepository programrepository;

    public Program insert(Program program){
        return programrepository.save(program);
    }

//    public Program
    public List<Program> findAll(){
        return programrepository.findAll();
    }

    @Override
    public Optional<Program> findById(Integer id) {
        return programrepository.findById(id);
    }


}
