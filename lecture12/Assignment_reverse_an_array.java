package lecture12;
import java.util.*;
public class Assignment_reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void reverse(int[] brr) {
		int l=brr.length;
		for(int i=0,k=l-1;i<k;i++,k--) {
			int temp=brr[i];
			brr[i]=brr[k];
			brr[k]=temp;
		}
	}

}
