package lessonPractise;

public class ReverseArray {

	
	static void reverse(int a[], int n) 
	    { 
	        int[] b = new int[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) { 
	            b[j - 1] = a[i]; /*inserting values to b array*/
	            j = n - 1; /*decreasing the array index*/
	        } 
	  
	        /*printing the reversed array*/
	        System.out.println("Reversed array is: \n"); 
	        for (int k = 0; k < n; k++) { 
	            System.out.println(b[k]); 
	        } 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        int [] arr = {10, 20, 30, 40, 50}; 
	        reverse(arr, arr.length); 
	        System.out.println(arr.length);
	        
	    } 
	} 