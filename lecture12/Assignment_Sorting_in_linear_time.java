package lecture12;
import java.util.*;
public class Assignment_Sorting_in_linear_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) { //taking input
			arr[i]=sc.nextInt();
		}
		Sort(arr);
		for(int i=0;i<arr.length;i++) {//print output
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Sort(int[] brr) {
		//for bubble and selection it show time limit exceeded
		//using insertion sort
		for(int i=1;i<brr.length;i++) { 
			int temp=brr[i]; 
			int j=i-1; 
			while(j>=0 && brr[j]>temp) {
				brr[j+1]=brr[j]; //shifting if number is greater
				j--;
			}
			j++;
			brr[j]=temp; //putting the element so that the array is sorted
		}
	}

}
