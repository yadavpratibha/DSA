package lecture02;
import java.util.*;
public class Pattern_question_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=n-1;
		int one = 1;
		while(row<=n) {
			
			//print left space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//print 1
			int j=1;
			while(j<=one) {
				System.out.print("1 ");
				j++;
			}
			
			row++;
			one+=2;
			space--;
			System.out.println();
		}
	}

}
