package lecture13;

import java.util.Scanner;

public class Assignment_Spiral_Clockwise_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) { //taking input
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Spiral_clockwise(arr);
	}

	public static void Spiral_clockwise(int[][] arr) {
		int total=arr.length*arr[0].length;
		int count=0;
		int minrow=0;
		int maxrow=arr.length-1;
		int mincol=0;
		int maxcol=arr[0].length-1;
		while(count<total) {
		for(int i=mincol;i<=maxcol;i++) {
			System.out.print(arr[minrow][i]+", ");
			count++;
		}
		minrow++;
		
		for(int i=minrow;i<=maxrow;i++) {
			System.out.print(arr[i][maxcol]+", ");
			count++;
		}
		maxcol--;
		
		for(int i=maxcol;i>=mincol;i--) {
			System.out.print(arr[maxrow][i]+", ");
			count++;
		}
		maxrow--;
		
		for(int i=maxrow;i>=minrow;i--) {
			System.out.print(arr[i][mincol]+", ");
			count++;
		}
		mincol++;
		}
		System.out.print("END");
	}

}
