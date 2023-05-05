package lecture02;
import java.util.*;
public class Pattern_question_16 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space=n-1;
		int star=n;
		while(row<=2*n-1) {
			//print space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//print star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			
			//mirroring
			if(row<n) {
				space--;
				star--;
			}
			else {
				space++;
				star++;
			}
			row++;
			System.out.println();
		}
	}

}
