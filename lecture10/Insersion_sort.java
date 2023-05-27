package lecture10;
import java.util.*;
public class Insersion_sort {

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
		//The first single element is sorted in itself. So we start from i=1
		for(int i=1;i<brr.length;i++) {
			int temp=brr[i]; //remember the elements that needs to be sorted
			int j=i-1; //element needs to be compared from starting with previous element
			while(j>=0 && brr[j]>temp) {
				brr[j+1]=brr[j]; //shifting if number is greater
				j--;
			}
			//since we have reached a position which is not greater than the element
			//we need to j++ to reach the correct position
			j++;
			brr[j]=temp; //putting the element so that the array is sorted
		}
	}

}
