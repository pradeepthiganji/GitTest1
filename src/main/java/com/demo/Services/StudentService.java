package com.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Model.Student;
import com.demo.Repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
