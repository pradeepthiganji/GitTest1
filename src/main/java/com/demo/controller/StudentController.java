package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.Student;
import com.demo.Services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student s){
		Student student = service.addStudent(s);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping("/getStudentDetails")
	public ResponseEntity<List<Student>> getStudent(){
		List<Student> student = service.getStudent();
		return new ResponseEntity<List<Student>>(student,HttpStatus.OK);
	}
}
