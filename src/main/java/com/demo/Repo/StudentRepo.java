package com.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
