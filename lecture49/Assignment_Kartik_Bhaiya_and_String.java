package lecture49;

import java.util.Scanner;

public class Assignment_Kartik_Bhaiya_and_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		int flipa=MaxPerfectness(str, k, 'a');
		int flipb=MaxPerfectness(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));
		
	}
	
	public static int MaxPerfectness(String str,int k,char ch) {
		int si=0;
		int ei=0;
		
		int ans=0;
		int flip=0;
		
		while(ei<str.length()) {
			//growing
			if(str.charAt(ei)==ch) {
				flip++;
			}
			
			//Shrinking
			while(flip>k && si<=ei) {
			if(str.charAt(si)==ch) {
				flip--;
			}
			si++;
			}
			
			//Answer Calculate
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
