package lecture05;
import java.util.*;
public class Assignment_sum_of_odd_even_placed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumodd=0;
		int sumeven=0;
		int i=1;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			if(i%2!=0) {
			sumodd=sumodd+rem;
			}
			else {
				sumeven=sumeven+rem;
			}
			i++;
		}
		System.out.println(sumodd);
		System.out.println(sumeven);
	}

}
