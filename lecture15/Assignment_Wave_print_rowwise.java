package lecture15;
import java.util.*;
public class Assignment_Wave_print_rowwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //row
		int m = sc.nextInt();//column
		int[][] arr = new int[n][m];
		for(int i=0;i<arr.length;i++) { //input
			for(int j = 0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Display(arr);
	}
	//Wave print
	public static void Display(int[][] brr) {
		for(int row=0;row<brr.length;row++) {
			if(row%2==0) {
				for(int col=0;col<brr[0].length;col++) { //for 2nd, 4th it goes upward
				System.out.print(brr[row][col]+", ");
			}
		}
			else {
				for(int col=brr[0].length-1;col>=0;col--) { //for 1st, 3rd column it goesdownward
					System.out.print(brr[row][col]+", ");
				}
			}
			
	}
		System.out.print("END");
	}
}
