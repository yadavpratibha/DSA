package lecture04;
import java.util.*;
public class Pattern_double_sided_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		int midspace=-1;
		while (row <=n) {
			// print space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// print left star
			int j = 1;
			int lval=row;
			if(row>n/2){
				lval=n-row+1;
			}
			while (j <= star) {
				System.out.print(lval+" ");
				lval--;
				j++;
			}

			//print mid space
			int k=1;
			
			while(k<=midspace) {
				System.out.print("  ");
				k++;
			}
			
			//print right star
			int l=1;
			int rval=1;
			if(row==1 || row==n) {
				l=2;
			}
			while(l<=star) {
				System.out.print(rval+" ");
				l++;
				rval++;
			}
			
			// mirroring
			if (row < n/2+1) {
				space -= 2;
				star++;
				midspace+=2;
			} else {
				space += 2;
				star--;
				midspace-=2;
			}
			row++;
			System.out.println();
		}
	}

}
