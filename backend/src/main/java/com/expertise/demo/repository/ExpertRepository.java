package com.expertise.demo.repository;

import com.expertise.demo.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<Expert,String> {
    Expert findByName(String name);

}
