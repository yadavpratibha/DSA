package lecture12;
import java.util.*;
public class Assignment_Rain_water_trapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			int[] larr = new int[n];
			int rmax = Integer.MIN_VALUE;
			larr[0]=arr[0];
			for(int i=1;i<larr.length;i++) {
				larr[i] = Math.max(larr[i-1], arr[i]);
			}
			rmax = arr[n-1];
			int cost=0;
			for(int i=n-2;i>=1;i--) {
				cost=cost+Math.min(larr[i-1],rmax);
			}
			System.out.println(cost);
			
		}
	}

}
