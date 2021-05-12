package com.expertise.demo.controller;

import com.expertise.demo.entity.Program;
import com.expertise.demo.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:8081","null"},allowCredentials = "true")
@RestController
@RequestMapping(value="/program",method = {RequestMethod.GET, RequestMethod.PUT,RequestMethod.DELETE, RequestMethod.POST})
public class ProgramController {
    @Autowired
    private ProgramService programservice;

    @GetMapping(value = "/get_all")
    public List<Program> findAll()
    {
        return programservice.findAll();
    }

    @PostMapping(value = "/insert")
    public Program insert(@RequestBody Program program){
        return programservice.insert(program);
    }

    @GetMapping(value = "/find/{name}")
    public Optional<Program> findById(@PathVariable(value = "id") Integer id)
    {
        return programservice.findById(id);
    }

}
