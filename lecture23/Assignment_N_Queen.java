package lecture23;

import java.util.Scanner;

public class Assignment_N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[][] board=new boolean[n][n];
		PrintPath(board, n, 0);
		System.out.println();
		System.out.println(count);
	}
	
	static int count=0;
	
	public static void PrintPath(boolean[][] board,int tq,int row) {
		if(tq==0) {
			Display(board);
			count++;
			return;
		}
		
		
		for(int col=0;col<board[0].length;col++) {
			if(isSafe(board, row, col)==true) {
				board[row][col]=true;
				PrintPath(board, tq-1, row+1);
				board[row][col]=false;
			}
		}
	}
	
	public static boolean isSafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		int r = row;

		// up
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		// right diagonal
		r = row;
		int c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
			r--;
		}
		// left diagonal
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}
		return true;
	}	
	
	
	public static void Display(boolean[][]board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==true) {
					int row=i+1;
					int col=j+1;
					System.out.print("{"+row+"-"+col+"}");
				}
			}
			System.out.print(" ");
		}
	}

}
