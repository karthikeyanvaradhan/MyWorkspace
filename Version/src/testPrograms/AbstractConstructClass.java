package testPrograms;

public abstract class AbstractConstructClass {
	
	public AbstractConstructClass(String name) {
		
		System.out.println("I am a constructor in Parent Class" +name);
		
	}

	abstract void age();
	
	public int classStudying(int classgrp){
		return classgrp;
		
	}
	
	public String schoolName(String schoolName){
		return schoolName;
		
	}
	
}

class School extends AbstractConstructClass{

	public School(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void age() {
		// TODO Auto-generated method stub
		int age=10;
	}

	@Override
	public int classStudying(int classgrp) {
		// TODO Auto-generated method stub
		return super.classStudying(classgrp);
	}
	
	@Override
	public String schoolName(String schoolName) {
		// TODO Auto-generated method stub
		return super.schoolName(schoolName);
	}
	
}

