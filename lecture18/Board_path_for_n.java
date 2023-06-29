package lecture18;
import java.util.*;
public class Board_path_for_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int des = 4;
		int curr = 0;
		System.out.println("\n" +PrintPath(curr,des,""));;
	}

	public static int PrintPath(int curr, int des, String ans) {
		if (curr == des) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > des) {
			return 0;
		}

//		int a1=PrintPath(curr + 1, des, ans + 1);
//		int b1=PrintPath(curr + 2, des, ans + 2);
//		int c1=PrintPath(curr + 3, des, ans + 3);
//		return a1+b1+c1;
		int count=0;
		for(int dice=1;dice<=3;dice++) {
			count = count+PrintPath(curr+dice,des,ans+dice);
		}
		return count;
	}

}
