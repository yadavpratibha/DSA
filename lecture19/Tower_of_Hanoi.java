package lecture19;

import java.util.Scanner;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TOH(n, "Source", "Helper", "Destination");
	}
	
	public static void TOH(int n,String src,String hlp,String dstn) {
		if(n==0) {
			return;
		}
		TOH(n-1, src, dstn, hlp);
		System.out.println("Move "+n+"th disk from "+src+" to "+dstn);
		TOH(n-1, hlp, src,dstn);
		
	}

}
