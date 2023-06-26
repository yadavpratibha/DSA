package lecture17;

public class Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		Subsequence(ques,"");
	}
	public static void Subsequence(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		Subsequence(ques.substring(1),ans);
		Subsequence(ques.substring(1),ans+ch);
	}

}
