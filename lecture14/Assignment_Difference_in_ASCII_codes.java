package lecture14;
import java.util.Scanner;
public class Assignment_Difference_in_ASCII_codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		DiffASCII(in);
	}

	public static void DiffASCII(String in) {
		System.out.print(in.charAt(0));
		for(int i=1;i<in.length();i++) {
			int diff=((int)(in.charAt(i)))-((int)(in.charAt(i-1)));
			System.out.print(diff);
			System.out.print(in.charAt(i));
		}
	}
	
}
