package lecture08;
import java.util.*;
public class Array_Swap_two_number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		swap(arr);
		System.out.print(arr[0]+" "+arr[1]);
	}
	public static void swap(int[] arr) {
		// swap two numbers in their indexes
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

}
