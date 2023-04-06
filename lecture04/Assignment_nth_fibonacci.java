package lecture04;
import java.util.*;
public class Assignment_nth_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a=0;
	        int b=1;
	        int i=1;
	        while(i<=n) {
	            int num = a+b;
	            a=b;
	            b=num;
	            i++;
	        }
	        System.out.print(a);
	    }
	}
