package lecture09;
import java.util.*;
public class Leetcode_189_Reversal_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		rotate(arr,k);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotate(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		reverse(arr,n-k,n-1); //reverse last k elements
		reverse(arr,0,n-1-k); //reverse 1st n-k elements
		reverse(arr,0,n-1); //reverse complete array
	}
	
	
	public static void reverse(int[] arr,int i,int j) {
		for(;i<j;i++,j--) { //reversing elements in a range
			int temp=arr[i]; 
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

}
