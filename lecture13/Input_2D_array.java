package lecture13;
import java.util.*;
public class Input_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //row
		int m = sc.nextInt(); //column
		int[][] arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Display(arr);
	}
	public static void Display(int[][] brr) {
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[0].length;j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
			System.out.println(brr[i]); //print address of row[i]
		}
	}

}
