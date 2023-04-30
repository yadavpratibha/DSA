package lecture01;
import java.util.Scanner;
public class Number_greater_than_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>25) {
			System.out.println(n+" greater than 25");
		}
		else if (n==25) {
			System.out.println(n+" is equal to 25");
		}
		else {
			System.out.println(n+" is less than 25");
		}
		
	}

}
		
