package javaPractise;


@org.testng.annotations.Test



public class Test {
	
	int i = 10,j=2;
	
		int k=j=i;
	
	public void eval(){
		System.out.println(k);
	}

	
	public static void main(String args[]){
		
		Test t = new Test();
		t.eval();
		
	}

}
