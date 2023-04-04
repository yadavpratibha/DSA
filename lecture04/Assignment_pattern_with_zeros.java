package lecture04;
import java.util.*;
public class Assignment_pattern_with_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int row=1;
	        int star=1;
	        int val=1;
	        while(row<=n) {

	            //print star
	            int i=1;
	            val=row;
	            while(i<=star) {
	                if(i==1 || i==row) {
	                System.out.print(val+"\t");
	                }
	                else {
	                    System.out.print("0\t");
	                }
	                i++;
	            }

	            //preparation for next
	            val++;
	            star++;
	            row++;
	            System.out.println();
	        }
	    }
	}