package lecture02;
import java.util.*;
public class Pattern_question_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=n;
		int space=0;
		while(row<=n) {
			 
			//print left star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			//print space
			int j=1;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
			
			//print star
			int k=1;
			if(row==1) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
			row++;
			star--;
			space+=2;
			System.out.println();
		}
				
	}

}
