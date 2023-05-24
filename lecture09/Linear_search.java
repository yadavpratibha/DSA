package lecture09;
import java.util.*;
public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) { //input array
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt(); //item to be searched
		System.out.println(Search(arr,m));
	}
	
	public static boolean Search(int[] brr, int k) {
		for(int j=0;j<brr.length;j++) {
			if(k==brr[j]) {
				return true; //return true if item is present
			}
		}
		return false; //return false if item is not present
	}

}
