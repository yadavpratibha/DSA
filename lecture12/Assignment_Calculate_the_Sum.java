package lecture12;

import java.util.*;

public class Assignment_Calculate_the_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		int q = sc.nextInt();
		sum=(int) (sum*Math.pow(q, 2));
		for(int i=0;i<q;i++) {
			int k=sc.nextInt();
		}
		
		sum=sum%1000000007;
		System.out.print(sum);
	}

}
