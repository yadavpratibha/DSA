package lecture18;

public class Count_subsequence_by_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n"+ Subsequence1("abc",""));
	}

	static int count = 0;

	public static int Subsequence1(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans+" ");
			count++;
			return 1;
		}
		char ch = ques.charAt(0);
		int a1 = Subsequence1(ques.substring(1), ans);
		int b1 = Subsequence1(ques.substring(1), ans + ch);
		return a1+b1;
	}

}
