package lecture16;
import java.util.*;
public class Factorial_by_tail_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n,1));;
	}
	public static int fact(int n,int ans) {
		//Tail recursion
		//Factorial is being formed while going up
		if(n==0) {
			return ans;
		}
		return fact(n-1,ans*n);
		
	}

}
