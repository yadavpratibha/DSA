package lecture04;
import java.util.*;
public class Pattern_inverted_hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 3;
		int val=n;
		while (row <=2*n+1) {

			// print left star
			int i = 1;
			int a=val;
			while (i <= star) {
				System.out.print(a+" ");
				if(i<star) {
					a--;
				}
				else {
					a++;
				}
				i++;
			}

			// print space
			int j = 1;
			while (j <= space+2) {
				System.out.print("  ");
				j++;
			}

			// print right star
			int k = 1;
			int b;
			if(row<=n) {
			b=n-(row-1);
			}
			else if(row==n+1) {
				b=1;
			}
			else {
				b=row-(n+1);
			}
			if (row == n+1) {
				k = 2;
			}
			while (k <= star) {
				System.out.print(b+" ");
				if(i<star) {
					b--;
				}
				else {
					b++;
				}
				k++;
			}
			
			//next
			if(row<=n) {
			star++;
			space -= 2;
			}
			else {
				star--;
				space+=2;
			}
			row++;
			System.out.println();
		}

	}

}
