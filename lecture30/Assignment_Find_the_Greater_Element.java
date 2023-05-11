package lecture30;
import java.util.Scanner;
import java.util.Stack;
public class Assignment_Find_the_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[2*n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			arr[n+i]=arr[i];
		}
		Greater_Element(arr);
		
	}
	public static void Greater_Element(int[] arr) {
		int[] ans=new int[arr.length];
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty()&& arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		
		for(int i=0;i<(arr.length/2);i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
