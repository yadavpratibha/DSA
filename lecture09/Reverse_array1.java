package lecture09;

import java.util.*;

public class Reverse_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr); // calling function
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void reverse(int[] brr) {
		for (int i = 0,j=brr.length-1; i < j; i++, j--) {
			int temp = brr[i]; // start swapping from first and last element
			brr[i] = brr[j];
			brr[j] = temp;
		}

	}

}
