package lecture04;
import java.util.*;public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		
		System.out.println(fact);
	}

}
