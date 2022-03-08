package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;


public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
		
	student.setStudentid(12);
	student.setName("Ajay");
	student.setName1("Mechanics");
	student.setName2("Pune");
	student.setmobileNo(8567225426L);
	service.addStudent(student);
		
	
		
		
	// Retrieve Operation
	//	service.findStudentById(104);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
		//student  =service.findStudentById(1);
		//student.setName("Ruchita_Rasal ");
		//service.updateStudent(student);
		
		
		
		
	/*	service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		
		*/
		/* Delete Operation
		student=service.findStudentById(4);
		service.removeStudent(student);
		System.out.println("Row removed");
		
		*/
	}

}