package lecture05;
import java.util.*;
public class Assignment_simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			int sum=0;
			while(sum>=0) {
				int n = sc.nextInt();
				sum=sum+n;
	            if(sum>=0) {
				System.out.println(n);
	            }
			}
		}

	}
