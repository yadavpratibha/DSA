package lecture09;

import java.util.*;

public class Linear_search_return_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) { //input array items
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(Search(arr,m));
	}



	public static int Search(int[] brr,int k) {
		for(int j=0;j<brr.length;j++) {
			if(brr[j]==k) { //searching array
				return j; //return index of the item to be searched
			}
		}
		return 0;
	}
}