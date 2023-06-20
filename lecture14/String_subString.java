package lecture14;
import java.util.Scanner;
public class String_subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		substring(str);
	}
	public static void substring(String str) {
		int l = str.length();
		for(int i=0;i<l;i++) {
			for(int j=i;j<l;j++) {
				System.out.print(str.substring(i,j+1)+" ");
			}
		}
	}

}
