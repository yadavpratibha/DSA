package lecture11;

import java.util.Scanner;

public class Leetcode_53_Maximum_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) { //input array
			arr[i] = sc.nextInt();
		}
		System.out.println(Max_sum(arr));;
	
	}
	public static int Max_sum(int[] arr) {
		int ans = Integer.MIN_VALUE; //taking the min value as the sum
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j]; //sum of sub array
				ans=Math.max(ans, sum); //choosing the max value from sum and previous max ans
			}
		}
		return ans;
	}

}
