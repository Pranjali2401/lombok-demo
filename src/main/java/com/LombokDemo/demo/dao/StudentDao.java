package com.LombokDemo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LombokDemo.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>{

}
