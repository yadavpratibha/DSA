package lecture02;
import java.util.*;
public class Pattern_question_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space=n/2;
		int midspace=0;
		while(row<=n) {	
			
			//print left space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			System.out.print("* ");
			if(row>1 || row<n) {
			
				//print mid space
				int j=1;
				while(j<midspace) {
					System.out.print("  ");
					j++;
				}
				
				//print right star
				if(row==1 || row==n) {
					
				}
				else {
				System.out.print("* ");
				}
				//mirroring
				if(row<=n/2) {
					space--;
					midspace+=2;
					}
				else {
					space++;
					midspace-=2;
				}
			}
			else {
				System.out.print("* ");
			}
			row++;
			System.out.println();
	}
	}


			}
			