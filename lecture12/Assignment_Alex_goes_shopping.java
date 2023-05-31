package lecture12;

import java.util.*;

public class Assignment_Alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		// input prices of different items
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// input queries
		int q = sc.nextInt();
		// input 'm' money and 'k' items that can be purchased
		for (int j = 1; j <= q; j++) {
			int A = sc.nextInt();
			int k = sc.nextInt();
			check(arr, A, k);
		}
	}

	public static void check(int[] arr, int A, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (A % arr[i] == 0) { //check if money'm' is completely used up
				count++;
			}
		}
		if (count >= k) { //he has at least ‘k’ items she can choose from
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
