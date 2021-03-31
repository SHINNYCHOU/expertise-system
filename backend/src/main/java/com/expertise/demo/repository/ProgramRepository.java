package com.expertise.demo.repository;

import com.expertise.demo.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program,String> {
}
