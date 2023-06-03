package lecture12;
import java.util.*;
public class Assignment_Max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(Max(arr));
	}
	
	public static int Max(int[] brr) {
		int max = brr[0]; //take first element as maximum
		for(int i=1;i<brr.length;i++) {
			if(brr[i]>max) {  //compare each element with max
				max=brr[i]; //store if greater than max
			}
		}
		return max;
	}

}
