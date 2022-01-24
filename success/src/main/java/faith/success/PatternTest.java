package faith.success;

public class PatternTest {

	public void pattern(int n) {

		// Square Pattern

		/*
		 * for (int i = 1; i <=n; i++) { for (int j = 1; j <= n; j++) {
		 */

		/*
		 * for (int i = 1; i <=n; i++) {
		 * 
		 * for (int j = 1; j <= i; j++) {
		 * 
		 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5
		 */

		/*
		 * for(int i=1;i<=n;i++){
		 * 
		 * for(int j=1;j<=n;j++){
		 * 
		 * /* 1 2 3 4 5 2 3 4 5 3 4 5 4 5 5
		 */

		/*
		 * for(int i=1;i<=5;i++){
		 * 
		 * for(int j=i;j<=n;j++){
		 * 
		 * System.out.print(" "); }
		 * 
		 * for(int j1=1;j1<=i;j1++){ System.out.print("*");
		 * 
		 * }
		 *
		 **
		 ***
		 ****
		 *****
		 * 
		 * 
		 * 
		 */

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}

			/*for (int j = 1; j < n; j++) {
				System.out.print("");
			}*/

			System.out.println();
		}
	}

	public static void main(String[] args) {

		PatternTest pt = new PatternTest();
		pt.pattern(5);
	}

}
