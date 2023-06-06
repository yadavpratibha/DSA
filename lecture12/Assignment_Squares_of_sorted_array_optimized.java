package lecture12;
import java.util.*;
public class Assignment_Squares_of_sorted_array_optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int narr[] = new int[n];
		int i=0;
		int k=n-1;
		int j=n-1;
		while(i<=j) {
			if(Math.abs(arr[i])>Math.abs(arr[j])) {
				narr[k]=(arr[i]*arr[i]);
				i++;
				k--;
			}
			else {
				narr[k]=(arr[j]*arr[j]);
				k--;
				j--;
			}
		}
		System.out.println(Arrays.toString(narr));
	}

}
