package lecture07;
import java.util.*;
public class Assignment_shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int alim = sc.nextInt();	//at most for aayush
			int hlim = sc.nextInt();	//at most for harshit
			int aa=0;
			int hh=0;
			int j=1;
			while(true) {
				aa+=j;
				j++;
				if(aa>alim) {
					System.out.println("Harshit");
					break;
				}
				hh+=j;	
				j++;
				if(hh>hlim) {
					System.out.println("Aayush");
					break;
				}
			}			
		}
	}

}
