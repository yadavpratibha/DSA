package lecture18;

import java.util.Scanner;

public class Assignment_Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Generate_Parenthesis(n, 0, 0, "");
	}

	public static void Generate_Parenthesis(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.print(ans + " ");
			return;
		}

		if (open < n) {
			Generate_Parenthesis(n, open + 1, close, ans + "(");
		}
		if (close < open) {
			Generate_Parenthesis(n, open, close + 1, ans + ")");
		}
	}
}
