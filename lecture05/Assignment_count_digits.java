package lecture05;
import java.util.*;
public class Assignment_count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int count=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			n=n/10;
			if(a!=0) {
			if (rem/a==1 && rem%a==0) {
				count++;
			}
			}
			else {
				if(rem==0) {
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
