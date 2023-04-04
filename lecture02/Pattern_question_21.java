
package lecture02;
import java.util.*;
public class Pattern_question_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 3;
		while (row <= n) {

			// print left star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			// print space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// print star
			int k = 1;
			if (row == n) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			row++;
			star++;
			space -= 2;
			System.out.println();
		}

	}

}
