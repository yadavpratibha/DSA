package lecture02;
import java.util.*;
public class Pattern_question_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int lspace = 0;
		int mspace = n - 2;
		while (row <= n) {
			// print left space
			int i = 1;
			while (i <= lspace) {
				System.out.print("  ");
				i++;
			}

			// print left star
			System.out.print("* ");

			// print middle space
			int j = 1;
			while (j <= mspace) {
				System.out.print("  ");
				j++;
			}

			// print right star
			if(row!=(n/2)+1) {
			System.out.print("* ");
			}

			//preparation for next
			if(row<=n/2) {
				lspace++;
				mspace-=2;
			}
			else {
				lspace--;
				mspace+=2;
			}
			row++;
			System.out.println();
		}
	}

}
