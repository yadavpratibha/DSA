package lecture13;
import java.util.*;
public class Assignment_Form_Biggest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n= sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<arr.length;j++) {
				arr[j] = sc.nextInt();
			}
			Biggest_number(arr);
		}
	}
	public static void Biggest_number(int[] arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
