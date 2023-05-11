package lecture30;

import java.util.Scanner;
import java.util.Stack;

public class Assignment_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {
		int ans = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int rmin = i;
				int h = arr[st.pop()];
				if (st.isEmpty()) {
					int area = h * rmin;
					ans = Math.max(ans, area);
				} else {
					int lmin = st.peek();
					int area = h * (rmin - lmin - 1);
					ans = Math.max(ans, area);
				}
			}
			st.push(i);
		}

		// calculating seperately for last index
		// as there is no element on right so
		// rmin does not exist
		int rmin=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				int area=h*rmin;
				ans=Math.max(ans, area);
			}
			else {
				int lmin=st.peek();
				int area=h*(rmin-lmin-1);
				ans=Math.max(ans, area);
			}
			
		}
		return ans;
	}

}
