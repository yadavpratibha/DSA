package lecture14;
import java.util.Scanner;	

public class Assignment_String_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		RemoveDuplicate(s);
	}
	
	public static void RemoveDuplicate(String s) {
		System.out.print(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				//do nothing
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
