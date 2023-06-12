package lecture13;

import java.util.Scanner;

public class Assignment_Transpose_of_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Transpose(arr);
		// print resultant array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	//function for transpose of input matrix
	public static void Transpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			// swap elements only on one side of the diagonal so j=i+1
			for (int j = i + 1; j < arr[0].length; j++) {
				int temp = arr[i][j]; // swap elements at arr[i][j] and arr[j][i]
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
}
