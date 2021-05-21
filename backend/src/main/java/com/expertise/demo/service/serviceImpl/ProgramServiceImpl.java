package com.expertise.demo.service.serviceImpl;

import com.expertise.demo.entity.Program;
import com.expertise.demo.entity.Record;
import com.expertise.demo.repository.ProgramRepository;
import com.expertise.demo.service.ExpertService;
import com.expertise.demo.service.ProgramService;
import com.expertise.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramServiceImpl implements ProgramService {
    @Autowired
    private ProgramRepository programrepository;

    @Autowired
    private RecordService recordservice;

    @Autowired
    private ExpertService expertservice;

    public Program insert(Program program){
        return programrepository.save(program);
    }

//    public Program
    public List<Program> findAll(){
        return programrepository.findAll();
    }

    @Override
    public Program findById(Integer id) {
        return programrepository.findById(id);
    }

    @Override
    public void autoChoose(Integer id) {
        Program p = programrepository.findById(id);
        for (int i=0;i<p.getNumber();i++){
            //找合适的专家 insert record
            Record record =new Record();
            record.setProgramID(id);
            //如果专家数量小于所需number 会越界
            Integer EId=expertservice.findAll().get(i).getId();
            record.setExpertID(EId);
            record.setTime(p.getTime());
            recordservice.insert(record);
        }
    }


}
