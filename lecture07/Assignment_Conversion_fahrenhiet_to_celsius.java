package lecture07;
import java.util.*;
public class Assignment_Conversion_fahrenhiet_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int step = sc.nextInt();
		
		for(int i=min;i<=max;i=i+step) {
			int c = ((i-32)*5)/9;
			System.out.println(i+"\t"+c);
		}
	}

}
