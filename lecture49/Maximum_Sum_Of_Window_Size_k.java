package lecture49;

public class Maximum_Sum_Of_Window_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 7, 5, 11, 3, 2, 1 };
		int k=3;
		System.out.println(MaxSum(arr, k));
	}
	
	public static int MaxSum(int[] arr,int k) {
		int sum=0;
		
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		
		int ans=sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i]-arr[i-k];
			ans=Math.max(ans, sum);
		}
		
		return ans;
	}

}
