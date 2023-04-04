package lecture02;

import java.util.Scanner;

public class Pattern_question_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=n-1;
		int star = 1;
		while(row<=n) {
			
			//print space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//print star
				int j=1;
				while(j<=star) {
				if(j==1 || j==star) {
					System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
				j++;
				}

			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
