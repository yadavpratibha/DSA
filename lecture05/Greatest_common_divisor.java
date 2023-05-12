package lecture05;
import java.util.*;
public class Greatest_common_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i;
		int divisor=1;
		for(i=1;i<=n||i<=m;i++) {
			if(n%i==0 && m%i==0) {
				divisor=i;
			}
		}
		System.out.println(divisor);
	}

}
