package lecture08;
import java.util.*;
public class Array_swap_two_number_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] other = {100,200,300,400,500};
		swap(arr,other);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<other.length;i++) {
			System.out.print(other[i]+" ");
		}
	}
	//swap elements of arr with elements of others
	public static void swap(int[] a, int[] oth) { 
		for(int i=0;i<a.length;i++) {
			int temp = a[i];
			a[i] = oth[i];
			oth[i] = temp;
		}
	}

}
