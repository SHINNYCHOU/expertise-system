package com.expertise.demo.service;

import com.expertise.demo.entity.Expert;

import java.util.Date;
import java.util.List;

public interface ExpertService {
     Expert insert(String name, String gender, Date birth, String type, String area, String company, boolean secret);
     List<Expert> findAll();
     Expert findByName(String name);
}
