package com.SeleniumJava.Practise;

public class Test {

	public static void main(String[] args) {
		
		StudentDao st = new StudentDao();
		Student s = st.getStudentIfo(10382);
		System.out.println("Student Name"+" : "+s.getStudentName()+"\n"+"Student Id"+" : "+s.getStudentId()+"\n"+"Student Gender"+" : "+s.getStudentGender());
		
	}

}
