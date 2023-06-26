package lecture17;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Fibonacci(n));
	}
	public static int Fibonacci(int n) {
		if(n==0||n==1) {
			return n;
		}
		int f1 = Fibonacci(n-1);
		int f2 = Fibonacci(n-2);
		return f1+f2;
	}
	

}
