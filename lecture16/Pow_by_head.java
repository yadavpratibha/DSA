package lecture16;
import java.util.*;
public class Pow_by_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(calculate(n,m));;
	}
	public static int calculate(int n, int m) {
		if(m==0) {
			return 1;
		}
		int fn=calculate(n,m-1);
		return fn*n;
	}

}
