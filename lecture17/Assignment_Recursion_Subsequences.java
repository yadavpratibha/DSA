package lecture17;
import java.util.Scanner;
public class Assignment_Recursion_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		SubSequence(str, "");
		System.out.println();
		System.out.print(count);

	}

	static int count = 0;

	public static void SubSequence(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		char ch = str.charAt(0);
		SubSequence(str.substring(1), ans);
		SubSequence(str.substring(1), ans + ch);

	}

}
