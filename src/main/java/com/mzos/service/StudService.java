package com.mzos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzos.bean.Student;
import com.mzos.dao.StudRepo;

@Service
public class StudService {
	@Autowired
	StudRepo repo;
	
	public void addStudent(Student stud) {
		if(repo.addStudent(stud))
			System.out.println("Student Added "+stud);
	}
	
	public void selectAllStud() {
		repo.selectAllEmployee().forEach(stud->System.out.println(stud));
	}
	
	public void selectStudById(int studId) {
		if(repo.selectStudById(studId).isPresent())
			System.out.println(repo.selectStudById(studId).get());
		else 
			System.out.println("Wrong studId");
	}
}
