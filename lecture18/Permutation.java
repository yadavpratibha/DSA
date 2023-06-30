package lecture18;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Per(s, "");
	}

	public static void Per(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		for (int i = 0; i < s.length(); i++) {

			Per(s.substring(0, i)+s.substring(i+1), ans + s.charAt(i));
		}
	}

}
