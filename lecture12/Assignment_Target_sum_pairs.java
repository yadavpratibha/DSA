package lecture12;

import java.util.*;

public class Assignment_Target_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) { // input array
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt(); // target
		sumpairs(arr, t);
	}

	public static void sumpairs(int[] arr, int t) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == t) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
					System.out.println(Math.min(arr[i], arr[j]) + " and " + Math.max(arr[i], arr[j]));
				}
			}
		}
	}

}
