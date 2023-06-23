package lecture16;
import java.util.*;
public class Print_n_decreasing_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}

	public static void print(int n) {
		//answer is getting formed as we go up in call stack
		if (n == 0) {
			return;
		}
		System.out.print(n+" ");

		print(n - 1);
	}
}
