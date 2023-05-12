package lecture05;
import java.util.*;
public class Assignment_replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long num=0;
		
		
		//if n is zero
		if(n==0) {
			num=5;
		}
		
		//if n>0
		else {
			long mul=1;
			while(n>0) {
			long rem=n%10;
			if(rem==0) {
				rem=5;
			}
			
			num=num+rem*mul;
			mul=mul*10;
			n=n/10;
			}
		}
		System.out.println(num);
	}

}
