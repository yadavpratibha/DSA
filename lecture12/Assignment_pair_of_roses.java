package lecture12;
import java.util.*;
public class Assignment_pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int target = sc.nextInt();
			Arrays.sort(arr);
			int i = 0;
			int j = n - 1;
			int diff = Integer.MAX_VALUE;
			int s1 = -1;
			int s2 = -1;
			while (i < j) {
				if ((arr[i] + arr[j] == target)) {
					if ((arr[j] - arr[i] < diff)) {
						s1 = arr[i];
						s2 = arr[j];
						diff = arr[j] - arr[i];
					}
					
					i++;
					j--;
				}
				else if ((arr[i] + arr[j]) > target) {
					j--;
				} else {
					i++;
				}
			}
			System.out.println("Deepak should buy roses whose prices are " + s1 + " and " + s2+".");
		}
	}

}
