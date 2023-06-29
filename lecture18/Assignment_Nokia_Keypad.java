package lecture18;

import java.util.Scanner;

public class Assignment_Nokia_Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		KeyPad(s, "");
		System.out.println();
		System.out.println(count);

	}
	static int count=0;
	static String[] keypad = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx","yz" };

	public static void KeyPad(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		char ch = ques.charAt(0); // 1-->49
		String pressString = keypad[ch - 48]; // ch-->49
		for (int i = 0; i < pressString.length(); i++) {
			KeyPad(ques.substring(1), ans + pressString.charAt(i));
		}
		

	}
}
