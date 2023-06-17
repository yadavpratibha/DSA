package lecture14;
import java.util.Scanner;
public class Assignment_String_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Replace(s);
	}
	
	public static void Replace(String s) {
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.print(((char)(1+s.charAt(i))));
			}
			else {
				System.out.print(((char)(-1+s.charAt(i))));
			}
		}
	}

}
