package lecture13;

public class Palindrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naman";
		System.out.println(palindrome(str));;
	}
	public static boolean palindrome(String s) {
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
