package lecture12;
import java.util.*;
public class Assignment_Array_Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int m= sc.nextInt();
		System.out.println(Search(arr,m));
		
	}
	
	public static int Search(int[] brr,int k) {
		for(int l=0;l<brr.length;l++) {
			if(brr[l]==k) {
				return l; //return index
			}
		}
		return -1;
	}

}
