package lecture02;

import java.util.Scanner;

public class Pattern_question_30 {

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
				System.out.print(n-i+1+" ");
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
