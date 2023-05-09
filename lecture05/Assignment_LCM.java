package lecture05;
import java.util.*;
public class Assignment_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int lcm=0;
		for(int i=1;i<=n*m;i++) {
			if(i%n==0 && i%m==0) {
				lcm=i;
				break;
			}
		}
				System.out.println(lcm);

	}

}
