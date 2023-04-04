package lecture02;

import java.util.Scanner;

public class Pattern_question_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=n-1;
		int num = 1;
		int value=1;
		while(row<=n) {
			
			//print left space
			int i=1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			
			//print number
			int j=1;
			while(j<=num) {
				if(value>=10) {
					System.out.print(value+" ");
				}
				else {
					System.out.print(value+"  ");
				}
				j++;
				value++;
			}
			
			
			row++;
			num+=2;
			space--;
			System.out.println();
		}
	}

}
