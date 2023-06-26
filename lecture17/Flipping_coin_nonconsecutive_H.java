package lecture17;

import java.util.Scanner;

public class Flipping_coin_nonconsecutive_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Coin_Non_Consecutive_H(n, "");
	}

	public static void Coin_Non_Consecutive_H(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (ans.length()==0 || ans.charAt(ans.length() - 1) != 'H') {
			Coin_Non_Consecutive_H(n - 1, ans + "H");
		}
		Coin_Non_Consecutive_H(n - 1, ans + "T");
	}
}
