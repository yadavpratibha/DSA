package lecture12;
import java.util.*;
public class Assignment_Target_sum_pairs_optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		int i=0;
		int j=n-1;
		while(i<j) {
			if((arr[i]+arr[j]==target)) {
				System.out.println(arr[i]+" and "+arr[j]);
				i++;
				j--;
			}
			else if((arr[i]+arr[j])<target) {
				i++;
			}
			else {
				j--;
			}
		}
	}

}
