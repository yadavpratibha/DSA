package lecture01;
import java.util.Scanner;
public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		if (n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}

}
