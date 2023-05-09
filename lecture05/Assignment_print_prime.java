package lecture05;

import java.util.*;

public class Assignment_print_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, counter;
		for (i = 2; i <= n; i++) {
			counter = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2)
				System.out.println(i);
		}
	}
}