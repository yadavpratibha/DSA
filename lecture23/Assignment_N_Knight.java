package lecture23;

import java.util.Scanner;

public class Assignment_N_Knight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[][] Grid=new boolean[n][n];
		Position(Grid, n, 0, 0);
		System.out.println();
		System.out.println(count);
	}
	
	static int count =0;
	
	public static void Position(boolean[][] board,int tk,int row,int col) {
		if(tk==0) {
			Display(board);
			System.out.print(" ");
			count++;
			return;
		}
		
		for(int r=row;r<board.length;r++) {
			for(int c=col;c<board[0].length;c++) {
				if(isSafe(board, r, c)==true) {
					board[r][c]=true;
					Position(board, tk-1, row+1, col+1);
					board[r][c]=false;
				}
			}
		}
	}
	
	public static boolean isSafe(boolean[][] board,int row,int col) {
		if(row>1 && col>0 && board[row-2][col-1]==true ) {
			return false;
		}
		
		if(row>1 && col<board.length-2 && board[row-2][col+1]==true) {
			return false;
		}
		
		if(row>0 && col>1 && board[row-1][col-2]==true) {
			return false;
		}
		
		if(row>0 && col<board.length-3 && board[row-1][col-2]==true) {
			return false;
		}
		return true;
	}
	
	public static void Display(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==true) {
					System.out.print("{"+i+"-"+j+"}");
				}
			}
			System.out.print("");
		}
	}

}
