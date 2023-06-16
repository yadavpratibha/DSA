package lecture14;
import java.util.Scanner;
public class Assignment_String_is_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isPalindrome(s));;
	}

	public static boolean isPalindrome(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				//do nothing
			}
			else {
				return false;
			}
		}
		return true;
	}
	
}
