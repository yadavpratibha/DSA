package lecture02;

import java.util.Scanner;

public class Pattern_question_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=n-1;
		int star = 1;
		while(row<=n) {
			
			//print left space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//print star
			int j=1;
			int val=n-row+1;
			while(j<=star) {
				
				if(j<=(star+1)/2) {
					if(j==(star+1)/2) {
						System.out.print("0 ");
						val--;
					}
					else {
					System.out.print(val+" ");
				
					val++;
					}
				}
				else {
					System.out.print(val+" ");
					val--;
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
