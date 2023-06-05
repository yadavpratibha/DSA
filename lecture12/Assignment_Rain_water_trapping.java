package lecture12;
import java.util.*;
public class Assignment_Rain_water_trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<arr.length;j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(trapping_water(arr));;
			
		}
		
	}
	public static int trapping_water(int[] arr) {
		int l = arr.length;
		//for finding maximum in left
		int[] left = new int[l];
		left[0]=arr[0];
		for(int i=1;i<l;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		
		//for finding maximum in right
		int[] right = new int[l];
		right[l-1]=arr[l-1];
		for(int i=l-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		
		//for total rain water trapped
		int sum=0;
		for(int i=0;i<l;i++) {
			sum=sum+Math.min(left[i], right[i])-arr[i];
		}
		
		return sum;
	}

}
