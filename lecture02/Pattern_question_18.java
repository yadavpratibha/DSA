package lecture02;
import java.util.*;
public class Pattern_question_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=1;
		int space=n/2;
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
				System.out.print("* ");
				j++;
			}
			
			//mirroring
			if(row<=n/2) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			
			row++;
			System.out.println();
			
		}
	}

}
