package lecture02;
import java.util.*;
public class Pattern_question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			
			//print star
			int i=1;
			while (i<=star) {
				System.out.print("* ");
				i++;
			}
			//preparation of next
			star++;
			row++;
			System.out.println();
		}
	}

}
