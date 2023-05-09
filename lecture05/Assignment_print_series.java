package lecture05;
import java.util.*;
public class Assignment_print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int i=1;
		int x=1;
		while(x<=n1) {
			int num=3*i+2;
			if(num%n2!=0) {
				System.out.println(num);
				i++;
				x++;
				}
			else {
				i++;				
			}
		}
	}

}
