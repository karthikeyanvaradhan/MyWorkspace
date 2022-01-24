package javaTestPgms;

public class UsesEncapGetSet {

	public static void main(String[] args) {
		
	EncapTest en = new EncapTest();
	en.setStuAge(36);
	en.setStudName("Karthikeyan Varadhan");
	System.out.println(en.getStudName());
	System.out.println(en.getStuAge());
	}

}
