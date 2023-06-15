package lecture14;
import java.util.Scanner;
public class Assignment_Count_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println(isPalindromeSubstring(str));

	}
	static int count=0;
	public static int isPalindromeSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String s=str.substring(i, j+1);
				if(isPalindrome(s)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static boolean isPalindrome(String s) {
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
