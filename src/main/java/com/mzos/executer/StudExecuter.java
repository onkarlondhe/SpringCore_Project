package com.mzos.executer;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
import com.mzos.bean.Student;
import com.mzos.config.StudentCofig;
import com.mzos.service.StudService;
 
public class StudExecuter {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentCofig.class);
		StudService service = context.getBean(StudService.class);
		
		System.out.println("getting all student");
		service.selectAllStud();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insert studId, studName, studMark");
		service.addStudent(new Student(sc.nextInt(), sc.next(), sc.nextInt()));
		
		System.out.println("enter studId for search ");
		service.selectStudById(sc.nextInt());
	}

}
