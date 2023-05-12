package lecture05;
import java.util.*;
public class Assignment_Von_neumann_loves_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int m = sc.nextInt();
			int sum = 0;
			int j = 0;
			int rem=0;
			while (m != 0) {
				rem = m % 10;
				m = m / 10;
				sum = (int) (sum + rem*Math.pow(2,j));
				j++;
			}
			System.out.println(sum);
		}
		
	}

}