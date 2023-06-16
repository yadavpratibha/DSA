package lecture14;
import java.util.Scanner;
public class Assignment_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		CompressedString(in);
	}
	public static void CompressedString(String in) {
		int count=1;
		System.out.print(in.charAt(0));
		for(int i=1;i<in.length();i++) {
			if(in.charAt(i)==in.charAt(i-1)) {
				count++;
			}
			else {
				System.out.print(count);
				System.out.print(in.charAt(i));
				count=1;
			}
		}
		System.out.println(count);
	}

}
