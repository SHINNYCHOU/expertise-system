package com.expertise.demo.service;

import com.expertise.demo.entity.Expert;

import java.util.Date;
import java.util.List;

public interface ExpertService {
     Expert insert(String name, String gender, Date birth, String phone, String type, String area, String company, String secret);
     Expert insert(Expert expert);
     List<Expert> findAll();
     Expert findByName(String name);
     Expert findById(Integer id);
}
