package lecture11;

public class Leetcode_42_Trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(traping(arr));
		
	}
	public static int traping(int[] arr) {
		int n = arr.length;
		//for finding max from left
		int[] left = new int [n];
		left[0] = arr[0];
		for(int i =1;i<left.length;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		
		//for finding max from right
		int[] right = new int [n];
		right[n-1] = arr[n-1];
		for(int i =n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		
		//trapped water
		int sum=0;
		for(int i=0;i<right.length;i++) {
			sum=sum+Math.min(left[i],right[i])-arr[i];
		}
		return sum;
	}

}
