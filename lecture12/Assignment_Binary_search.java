package lecture12;
import java.util.*;
public class Assignment_Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) { //input array
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt(); //target elements to be searched
		System.out.print(Binary_search(arr,m));
	}
	public static int Binary_search(int[] arr, int m) {
		int low = 0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(m==arr[mid]) {
				return mid;
			}
			else if(m<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

}
