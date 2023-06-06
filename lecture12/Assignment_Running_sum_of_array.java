package lecture12;
import java.util.*;
public class Assignment_Running_sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Running_sum(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Running_sum(int[] arr ) {
		for(int i=1;i<arr.length;i++) {
			arr[i] = arr[i] + arr[i-1];
		}
	}

}
