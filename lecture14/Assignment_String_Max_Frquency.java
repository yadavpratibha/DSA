package lecture14;
import java.util.Scanner;

public class Assignment_String_Max_Frquency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(MaxFrequency(s));
	}

	public static char MaxFrequency(String s) {
		char max=s.charAt(0);
		int count=1;
		int ansmax=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
				if(ansmax<count) {
					ansmax=count;
					max=s.charAt(i);
				}
			}
			else {
				count=1;
			}
		}
		return max;
	}
	
}
