package lecture01;
import java.util.Scanner;
public class Divisible_by_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%6==0) {
			System.out.println("Divisible by 6");
		}
		else {
			System.out.println("Not divisible by 6");
		}
	}

}
