package lecture18;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(count);
	}
	
	static int count=0;
	
	public static int PrintPath(int cr,int cc,int er,int ec,ArrayList<String>ll) {
		if(cr==er && cc==ec) {
			System.out.println(ll);
			count++;
			return count;
		}
		
		PrintPath(cr+1, cc, er, ec, ll);
		PrintPath(cr, cc+1, er, ec, ll);
		return count;
	}

}
