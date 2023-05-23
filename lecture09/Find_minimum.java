package lecture09;

import java.util.*;

public class Find_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int y = minimum(arr);
		System.out.println(y);
	}
	
	public static int minimum(int[] brr) {
		int min = brr[0];
		for(int i=0;i<brr.length;i++) {
			if(brr[i]<min) {
				min=brr[i];
			}
		}
		return min;
	}

}
