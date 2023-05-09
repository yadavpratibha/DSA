package lecture05;

import java.util.*;

public class Assignment_odd_and_even_back_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int rem;

		for (int i = 1; i <= n; i++) {
			int num = scan.nextInt();
			int sumodd = 0;
			int sumeven = 0;
			while (num != 0) {

				rem = num % 10;
				if (rem % 2 != 0) {
					sumodd = sumodd + rem;

				} else if (rem % 2 == 0) {
					sumeven = sumeven + rem;
				}
				num =num/ 10;
			}

			if (sumodd % 3 == 0 || sumeven % 4 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}