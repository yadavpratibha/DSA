package lecture04;
import java.util.*;
public class Assignment_pattern_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int space =n-1;
	        int star=1;
	        int row=1;
	        int val=1;
	        while(row<=n) {

	            //print space
	            int i=1;
	            while(i<=space) {
	                System.out.print("\t");
	                i++;
	            }

	            //print star
	            int j=1;
	            val=row;
	            while(j<=star) {
	                System.out.print(val+"\t");
	                j++;
	                if(j<=row) {
	                val++;
	                }
	                else {
	                    val--;
	                }
	            }

	            row++;
	            star+=2;
	            space--;
	            System.out.println();
	        }
	    }
	}