package sampleJavaProject;

public class Fibo {

	public static void fiboSeries() {

		int t1 = 0;
		int t2 = 1;
		int fibMax = 10;

		for (int i = 1; i <= fibMax; i++) {

			System.out.print(t1 + "+");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}

	}

	public static void main(String[] args) {

		Fibo.fiboSeries();

	}

}
