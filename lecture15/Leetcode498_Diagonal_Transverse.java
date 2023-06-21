package lecture15;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode498_Diagonal_Transverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i : DiagonalTraverse(mat)) {
			System.out.print(i + " ");
		}
	}

	public static int[] DiagonalTraverse(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int[] ans = new int[n * m];
		int i = 0;
		for (int d = 0; d < n + m - 1; d++) {
			int row = 0;
			int col = 0;
			if (d < m) {
				row = 0;
				col = d;
			} else {
				row = d - m + 1;
				col = m - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (row < n && col >= 0) {
				list.add(mat[row][col]);
				row++;
				col--;
			}
			if (d % 2 == 0) {
				Collections.reverse(list);
			}
			for (int val : list) {
				ans[i] = val;
				i++;
			}
		}
		return ans;
	}

}
