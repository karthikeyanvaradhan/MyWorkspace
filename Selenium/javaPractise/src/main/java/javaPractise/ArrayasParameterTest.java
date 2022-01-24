package javaPractise;

public class ArrayasParameterTest {
	
	
	private void arrPara(String []name,int age) throws ArrayIndexOutOfBoundsException{
		
		int i=0;
		
		while(!name[i].isEmpty()){
			
			try{
			System.out.println(name[i]);
			}
			catch(Exception e){
				System.out.println("The Exception"+e);
			}
			i++;
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayasParameterTest arp = new ArrayasParameterTest();
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		arp.arrPara(cars, 35);
		
		
	}

}
