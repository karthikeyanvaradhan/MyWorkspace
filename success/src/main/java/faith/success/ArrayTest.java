package faith.success;

import java.util.Arrays;
import java.util.Scanner;

import javax.rmi.CORBA.StubDelegate;

public class ArrayTest {

	int[] stdID = new int[] { 1, 2, 3, 4, 5, 6 };

	// String[] stdName = new String[] {"gopal","raja","stephen"};

	String[] stdName = new String[6];

	public void storeArray() {

		for (int i = 0; i < stdID.length; i++) {

			stdName[i] = String.valueOf(stdID[i]);
		}
		System.out.println(stdID);
		System.out.print(Arrays.toString(stdName));
	}

	public static void main(String[] args) {

		ArrayTest ar = new ArrayTest();
		ar.storeArray();

	}

}

/*
 * public void arrInput() {
 * 
 * for (int i = 0; i < stdName.length; i++) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int j=1;
 * 
 * System.out.print("Please Enter the Name of" + " " + "Student" + " " + j + " "
 * + ":");
 * 
 * String nameofstd = sc.next();
 * 
 * stdName[i] = nameofstd;
 * 
 * //System.out.println(stdName[i]);
 * 
 * j=j+1;
 * 
 * }
 * 
 * System.out.println(stdName); }
 * 
 */
