package com.LombokDemo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LombokDemo.demo.dao.StudentDao;
import com.LombokDemo.demo.dto.StudentDto;
import com.LombokDemo.demo.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public Student addStudent(StudentDto student) {

		Student stud = new ObjectMapper().convertValue(student, Student.class);
		Student st = studentDao.save(stud);

		return st;
	}

	public List<Student> allStudent() {
		return studentDao.findAll();
	}

}
