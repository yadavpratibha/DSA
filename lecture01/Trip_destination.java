package lecture01;
import java.util.Scanner;
public class Trip_destination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>=80) {
			System.out.println("Dubai");
		}
		else {
			if (n<80 && n>=50) {
				System.out.println("Maldives");
			}
			else {
				System.out.println("Goa");
			}
		}
	}

}
