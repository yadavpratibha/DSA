package lecture18;

import java.util.Scanner;

public class Permutation_Stop_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Permutation_StopDuplicate(s, "");
	}

	public static void Permutation_StopDuplicate(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			boolean char_exists = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == ch) {
					char_exists = true;
					break;
				}
			}
			if (char_exists == false) {
				Permutation_StopDuplicate(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
			}
		}
	}

}
