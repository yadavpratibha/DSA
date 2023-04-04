package lecture02;

import java.util.Scanner;

public class Pattern_question_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int val=1;
		while (row <= (2 * n - 1)) {

			//star
			int i = 1;
			while (i <= star) {
				if(i%2==0) {
				System.out.print("* ");
				}
				else {
					System.out.print(val+" ");
				}
				i++;
			}

				System.out.println();
			row++;
			
			//condition for increasing and decresing
			if(row<=n) {
				star+=2;
				val++;
			}
			else
			{
				star-=2;
				val--;
			}
		}
	}

}
