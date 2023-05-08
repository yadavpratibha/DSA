package lecture05;
import java.util.Scanner;
public class Assignment_chewbecca_and_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long num=0;
		long mul=1;
		while(n!=0) {
			long rem=n%10;
			if(rem>=5) {
				rem=9-rem;
			}
			n=n/10;
			num=num+rem*mul;
			mul=mul*10;
		}
		System.out.println(num);
	}

}
