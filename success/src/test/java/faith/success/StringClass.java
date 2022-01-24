package faith.success;

public class StringClass {

/*String Variables are Immutable i.e The value cannot be changed, 
on change value a new object reference is created for the same	
*/	
	
public void strStoreMem(){
	
int l =1;
System.out.println(l);
l=5;
System.out.println("after" +l);
	String i ="karthikeyan";
	String j ="karthikeyan";
	
	System.out.println("The value of i:"+" "+i);
	System.out.println("The value of j:"+" "+j);
	
	
	String k = new String("Hello");
	System.out.println("The value of k after New Object:"+" "+k);
	
	k="raja";
	System.out.println("The value of k update Reference:"+" "+k);
}

	public static void main(String[] args) {

		StringClass strclass = new StringClass();
		strclass.strStoreMem();
		
	}

}
