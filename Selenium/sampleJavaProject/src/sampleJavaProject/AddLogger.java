package sampleJavaProject;

import com.webappui.ReportLogger;

public class AddLogger extends ReportLogger{
	
	private int a,b;
	
	public int add(int a, int b){
		this.a = a;
		this.b=b;
		int c=a+b;
		System.out.println(c);
		info("Test");	
		return c;

	}
	
	public static void ele(){
		info("Test");
	}
	
	public static void main(String args[]){
		
		AddLogger adlog = new AddLogger();
		adlog.a=10;
		adlog.b=5;
		
		adlog.add(adlog.a, adlog.b);
		info("Test");
		
	}
	

}
