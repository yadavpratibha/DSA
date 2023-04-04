package lecture02;
import java.util.*;
public class Pattern_question_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=n-1;
		int star = 1;
		int num=1;
		while(row<=n) {
			
			//print space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//print star
				num=1;
				while(num<=star) {
				System.out.print(num+" ");
				num++;
				}

			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
