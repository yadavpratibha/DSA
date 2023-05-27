package lecture10;
import java.util.*;
public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) { //taking input
			arr[i] = sc.nextInt();
		}
		Selection_sort(arr);
		for(int j=0;j<arr.length;j++) { //print sorted array
			System.out.print(arr[j]+" ");
		}
		
	}
	
	public static void Selection_sort(int[] brr) {
		for(int i=0;i<brr.length;i++) {
			int min_index=i; //assume first element to be minimum
			for(int j=i+1;j<brr.length;j++) { //(j+1) as we search minimum from rest of the array
				if(brr[j]<brr[min_index]) {
				min_index=j; //finding minimum from rest of he array
				}
			}
			int temp=brr[i]; //swap if number is less than minimum
			brr[i]=brr[min_index];
			brr[min_index]=temp;
		
		}
	}
}
