package lecture05;
import java.util.*;
public class Assignment_decimal_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i = 0;
		int rem=0;
		while (n != 0) {
			rem = n % 8;
			n = n / 8;
			sum = (int) (sum+rem*Math.pow(10, i));
			i++;
		}
		System.out.println(sum);
	}

}