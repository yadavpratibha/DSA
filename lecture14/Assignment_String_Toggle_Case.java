package lecture14;
import java.util.Scanner;
public class Assignment_String_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		ToggleCase(in);
	}
	
	public static void ToggleCase(String in) {
		for(int i=0;i<in.length();i++) {
			if((int)(in.charAt(i))<91) {
				System.out.print((char)(32+in.charAt(i)));
			}
			else {
				System.out.print((char)(-32+in.charAt(i)));
			}
		}
	}

}
