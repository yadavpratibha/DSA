package lecture13;

import java.util.Scanner;

public class Assignment_Maximum_Sum_Path_of_two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] narr = new int[n];
			int m = sc.nextInt();
			int[] marr = new int[m];
			for (int j = 0; i < n; i++) {
				narr[j] = sc.nextInt();
			}
			for (int j = 0; j < m; j++) {
				marr[j] = sc.nextInt();
			}
			System.out.println(SumPath(narr, marr));
			;
		}
	}

	public static int SumPath(int[] narr, int[] marr) {
		int result = 0;
		int sumn = 0;
		int summ = 0;

		int i = 0; // for n
		int j = 0; // for m

		while (i < narr.length && j < marr.length) {

			if (narr[i] < marr[j]) {
				sumn = sumn + narr[i];
				i++;
			} else if (marr[j] < narr[i]) {
				summ = summ + marr[j];
				j++;
			} else {
				sumn = sumn + narr[i];
				summ = summ + marr[j];
				result = Math.max(summ, sumn);
				i++;
				j++;

			}

		}

		if (i == narr.length-1) {
			for (int p = j; p < marr.length; p++) {
				result = result + marr[p];
			}
		}
		if (j == marr.length-1) {
			for (int p = i; p < narr.length; p++) {
				result = result + narr[p];
			}
		}
		return result;

	}

}
