package lecture02;

import java.util.*;

public class Pattern_question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while (row <= (2 * n - 1)) {

			//star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

				System.out.println();
			row++;
			
			//condition for increasing and decresing
			if(row<=n) {
				star++;
			}
			else
			{
				star--;
			}
		}
	}

}
