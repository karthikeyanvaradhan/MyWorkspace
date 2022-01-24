package com.SeleniumJava.Practise;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	private static List<Student> studentList = null;

	static {

		studentList = new ArrayList<Student>();
		Student s = new Student();
		s.setStudentGender("Male");
		s.setStudentId(10382);
		s.setStudentName("Karthikeyan");

		Student s1 = new Student();
		s1.setStudentGender("FEMALE");
		s1.setStudentId(100);
		s1.setStudentName("Raji");

		studentList.add(s);
		studentList.add(s1);
	}
	
	public Student getStudentIfo(int id){
		
		
		Student student=getStudentDataById(id);
				
		return student;
		
			
	}
	
	
	private Student getStudentDataById(Integer id){
		
		for(Student s: studentList)
		{
			if(s.getStudentId()==id);
			{
				
				return s;
			}
			
		}
		return null;
		
	}
	
	
}