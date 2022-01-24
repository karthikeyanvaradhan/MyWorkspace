package interviewPractise;

import java.util.Arrays;

public class SortPgm {

	int listNo[] = new int[6];

	String[] listName = { "jack", "mac", "rack", "pack" };

	public void sortMethod() {

		listNo[0] = 50;
		listNo[1] = 20;
		listNo[2] = 90;
		listNo[3] = 22;
		listNo[4] = 15;
		listNo[5] = 60;

		System.out.println(listName.length);


		for (int i = 0; i < listNo.length; i++) {

			for (int j = i + 1; j < listNo.length; j++) {

				if (listNo[i] < listNo[j]) {

					int temp = listNo[i];
					listNo[i] = listNo[j];
					listNo[j] = temp;

				}

			}
			
			System.out.println(listNo[i]);
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortPgm sortArray = new SortPgm();
		sortArray.sortMethod();

	}

}
