package lecture12;

import java.util.*;

public class Assignment_Maximum_circular_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(Max_circular_sum(arr));
		}
	}

	public static int Max_circular_sum(int[] arr) {
		//for linear array
		int anslinear = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			anslinear = Math.max(anslinear, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		
		//for circular array
		int totalsum=0;
		for(int i=0;i<arr.length;i++) {
			totalsum=totalsum+arr[i];
			arr[i]=-1*arr[i];
		}
		int maxsumcircular=Integer.MIN_VALUE;
		sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];

			maxsumcircular = Math.max(maxsumcircular, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		int anscircular=totalsum+maxsumcircular;
		
		return Math.max(anslinear,anscircular);
	}

}
