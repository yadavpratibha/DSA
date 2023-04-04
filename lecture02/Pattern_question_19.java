package lecture02;
import java.util.*;
public class Pattern_question_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space=1;
		int star=n/2;
		while(row<=n) {
			
			//print first and last row
			if(row==1 || row==n) {
				int i=1;
				while(i<=n) {
					System.out.print("* ");
					i++;
				}
			}
			//print hollow rhombus
			else {
				//print left star
				int i=1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
				
				//print space
				int j=1;
				while(j<=space) {
					System.out.print("  ");
					j++;	
				}
				
				//print right star
				int k=1;
				while(k<=star) {
					System.out.print("* ");
					k++;
				}
				
				//mirroring
				if(row<=n/2) {
					star--;
					space+=2;
				}
				else {
					star++;
					space-=2;
				}
			}
			row++;
			System.out.println();
		}
	}

}
