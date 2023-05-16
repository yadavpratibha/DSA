package lecture07;
import java.util.*;
public class Assignment_is_armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Isarmstrong(n));
	}
	
	//function to count digits
	 public static int countofdigits(int n) {
		int count =0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	 }
	
	 //function to check if number is Armstrong
	 public static boolean Isarmstrong(int n) {
		 int d=countofdigits(n);
		 int temp=n;
		 int sum=0;
		 while(n!=0) {
			 int rem=n%10;
			 sum=(int) (sum+Math.pow(rem, d));
			 n=n/10;
		 }
		 if(temp==sum) {
			 return true;
		 }
		 else {
			 return false;
		 }
		 
	 }
	 
}
