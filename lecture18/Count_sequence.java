package lecture18;

public class Count_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		Subsequence(ques, "");
		System.out.println(count);
	}

	static int count = 0;

	public static void Subsequence(String ques, String ans) {
		if (ques.length() == 0) {
			
			count++;
			return;
		}
		char ch = ques.charAt(0);
		Subsequence(ques.substring(1), ans);
		Subsequence(ques.substring(1), ans + ch);
	}

}
