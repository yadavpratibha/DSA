package lecture17;
import java.util.Scanner;
public class Assignment_Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();  //item
		FirstIndex(arr, arr.length-1, m);
	}
	
	public static void FirstIndex(int[] arr,int idx,int m) {
		if(idx<0) {
			System.out.println(-1);
			return;
		}
		if(arr[idx]==m) {
			System.out.println(idx);
			return ;
		}
		
		FirstIndex(arr, idx-1, m);
		
	}

}
