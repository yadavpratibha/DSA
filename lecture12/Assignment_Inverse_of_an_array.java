package lecture12;
import java.util.*;
public class Assignment_Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Inverse(arr);
	
	}
	
	public static void Inverse(int[] brr) {
		int[] arr = new int[brr.length];
		for(int j=0;j<brr.length;j++) {
			arr[brr[j]] =j; //putting  the index as element in array
		}
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
