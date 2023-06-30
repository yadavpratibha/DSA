package lecture18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode17_Letter_Combinations_of_Phone_Number {

	public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
				if(digits.length()==0) {
					return ll;
				}
        KeyPad(digits,"",ll);
        return ll;
    }
    	static String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

public static void KeyPad(String ques, String ans, List<String> ll) {
		if (ques.length() == 0) {
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);
		String pressString = keypad[ch - '0'];
		for (int i = 0; i < pressString.length(); i++) {
			KeyPad(ques.substring(1), ans + pressString.charAt(i), ll);
		}
		return;
	}

}
