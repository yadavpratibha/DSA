package lecture01;
import java.util.Scanner;
public class Number_is_divisible_2_and_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%2==0 && n%3==0) {
			System.out.println("divisible by 6");
		}
		else {
			System.out.println("not divisible by 6");
		}
		
	}

}
