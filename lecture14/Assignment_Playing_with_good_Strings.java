package lecture14;

import java.util.Scanner;

public class Assignment_Playing_with_good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(GoodString(str));

	}
	
	public static int GoodString(String str) {
	
		int ans=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String s=str.substring(i, j+1);
				if(isGoodString(s)) {
					int length=s.length();
					ans=Math.max(ans, length);
				}
			}
		}
		return ans;
	}
	
	public static boolean isGoodString(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				
			}
			else {
				return false;
			}
		}
		return true;
	}

}
