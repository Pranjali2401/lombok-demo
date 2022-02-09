package com.LombokDemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LombokDemo.demo.dto.StudentDto;
import com.LombokDemo.demo.model.Student;
import com.LombokDemo.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/")
	public ResponseEntity<Student> addStudent(@RequestBody StudentDto student) {
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<Student>> allStudent() {

		return new ResponseEntity<List<Student>>(studentService.allStudent(), HttpStatus.OK);
	}

}
