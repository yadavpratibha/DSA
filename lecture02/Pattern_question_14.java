package lecture02;
import java.util.Scanner;
public class Pattern_question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star=1;
		int space=n-1;
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
			
			//next row
			row++;
			
			//space
			if(row<=n) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			System.out.println();
			
		}
	}

}
