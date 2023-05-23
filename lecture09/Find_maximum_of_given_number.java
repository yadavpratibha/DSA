package lecture09;

import java.util.*;

public class Find_maximum_of_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(Max(arr));
	}

	public static int Max(int[] brr) {
		int max = brr[0];
		for (int i = 1; i < brr.length; i++) {
			if (brr[i] > max) {
				max = brr[i];
			}

		}
		return max;
	}
}
