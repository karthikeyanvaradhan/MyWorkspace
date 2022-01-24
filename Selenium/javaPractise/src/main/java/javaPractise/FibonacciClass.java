package javaPractise;

import java.util.Scanner;

public class FibonacciClass {

	int previousNumber = 0;
	int nextNumber = 1;

	private void FibonacciClass(int num) {

		
		if (num > 0) {

			System.out.println("The Number to which the Fibonacci Series to be generated is:" + " " + num);

			for (int i = 1; i < num; i++) {

				System.out.print(previousNumber + " ");
				int sum = previousNumber + nextNumber;
				previousNumber = nextNumber;
				nextNumber = sum;

			}
		} else if (num == 1) {
			System.out.println("Entered Number One");
		}

		else {
			System.out.println("Entered Number Zero");
		}

	}

	public static void main(String[] args) {

		FibonacciClass fcl = new FibonacciClass();
		/*fcl.FibonacciClass(0);
		fcl.FibonacciClass(1);
		fcl.FibonacciClass(10);*/
		// fcl.fibonacci(11);

		/*
		 * int maxNumber = 0; int previousNumber = 0; int nextNumber = 1;
		 * 
		 * System.out.println("How many numbers you want in Fibonacci:");
		 * Scanner scanner = new Scanner(System.in); maxNumber =
		 * scanner.nextInt();
		 * System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
		 * 
		 * for (int i = 1; i <= maxNumber; ++i) {
		 * System.out.print(previousNumber+" "); On each iteration, we are
		 * assigning second number to the first number and assigning the sum of
		 * last two numbers to the second number
		 * 
		 * 
		 * 
		 * int sum = previousNumber + nextNumber; previousNumber = nextNumber;
		 * nextNumber = sum;
		 * 
		 */
		// TODO Auto-generated method stub
		/*
		 * FibonacciClass fbc = new FibonacciClass(); fbc.fibonacci(10);
		 */
	}

}
