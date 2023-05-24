package lecture09;

import java.util.*;

public class Leetcode_189_Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //input=no. of elements in array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) { //input of elements
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		rotate(arr, k);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void rotate(int[] brr, int k) {
		k = k % brr.length;
		//at row=brr.length we would get same array.
		while (k > 0) {
			int temp = brr[brr.length - 1]; //save last element of the array
			for (int i = brr.length - 2; i >= 0; i--) {
				brr[i + 1] = brr[i]; //shifting elements to the right
			}
			brr[0]=temp;
			k--;
		}
	}

}
