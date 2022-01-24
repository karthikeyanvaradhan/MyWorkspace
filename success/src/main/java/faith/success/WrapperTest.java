package faith.success;

public class WrapperTest {

	public static void main(String[] args) {

		String i ="100";
		String j ="200";
		
		System.out.println("The Premitive Datatype" + i);
		
		System.out.println("The Wrapper Datatype"+ j);
		
		
		int k = Integer.parseInt(i);
		int l = Integer.parseInt(j);
		
		int sum = k+l;
		
		System.out.println("The Sum is" +sum);
		
		
/*Auto Boxing		
*/		
		int m=100;
		Integer n = m;
		System.out.println(n);
		
			
		
/*--Boxing*/
	
		int x=50;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		
		String val ="100.00";
		Double val1 = Double.parseDouble(val);
		System.out.println(val1);
		
	
/*		Unboxing 
*/		
		Integer age = 50;
		int ages = age.intValue();
		System.out.println(ages);
		
		/*		Auto Unboxing 
		*/		
		
		Integer vals = 8962;
		int conprim = vals;
		System.out.println(conprim);
				
		
	}

}
