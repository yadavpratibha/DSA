package lecture02;

import java.util.Scanner;

public class Pattern_question_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		while (row <= n) {

			// print star
			int i = 1;
			while (i <= star) {
				if(i==n-row+1) {
					System.out.print("* ");
				}
				else {
				System.out.print(n-i+1+" ");
				}
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
