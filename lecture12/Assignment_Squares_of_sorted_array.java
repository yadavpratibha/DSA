package lecture12;
import java.util.*;
public class Assignment_Squares_of_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; //input array
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		square_of_array(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
	}
	public static void square_of_array(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i] * arr[i]; //squaring elements
		}
		Arrays.sort(arr); //sort resultant array
	}

}
