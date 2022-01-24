package javaPractise;

public class SwapTest {
	
	int x,y;
	
	
	/*int	previous = 0;
	int next = 1;

	int sum=previous+next;
	previous=next;
	sum=next;
*/	
	
	private void swapNo(int x,int y){
		
		System.out.println("Before swap the value of X"+" "+x);
		System.out.println("Before swap the value of Y"+" "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap the value of X"+" "+x);
		System.out.println("After swap the value of Y"+" "+y);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapTest stest = new SwapTest();
		stest.swapNo(5,10);

	}

}
