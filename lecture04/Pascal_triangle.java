package lecture04;

import java.util.*;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// for rows
		int row = 0;
		int star = 1;
		while (row < n) {
			
			//for printing star
			int i=0;
			int ncr=1;
			while(i<star) {
				System.out.print(ncr+" ");
				ncr=ncr*(row-i)/(i+1);
				
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}

}
