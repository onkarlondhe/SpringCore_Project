package com.mzos.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.mzos.bean.Student;

@Repository
public class StudRepo {

	ArrayList<Student> array = new ArrayList<Student>(Arrays.asList(new Student(1,"Ram",85), new Student(2, "Sham", 90)));
	
	public boolean addStudent(Student stud) {
		
		return array.add(stud);
		
	}
	
	public ArrayList<Student> selectAllEmployee() {
		return array;
	}
	
	 public Optional<Student> selectStudById(int studId) {
		  
		return array.stream().filter(stud->stud.getStudId()==studId).findFirst();
	 }
}
