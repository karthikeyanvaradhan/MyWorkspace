package faith.success;

import java.util.Arrays;

//Test for Pull Request auto Merge
public class ReverseArrayTest {

	/*
	 * String[] orgArr = new String[] { "m", "a", "d", "a", "m" }; String[]
	 * revArr = new String[5]; String[] temArr = new String[5];
	 */

	String val = "Karthikeyan";
	String temp = "";

	public void revString() {

		// System.out.println("The Orginal Array" +Arrays.toString(orgArr));

		int n = val.length();

		for (int i = n - 1; i >= 0; i--) {

			temp = temp + val.charAt(i);

		}

		System.out.print(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseArrayTest arrTest = new ReverseArrayTest();
		arrTest.revString();

	}

}
