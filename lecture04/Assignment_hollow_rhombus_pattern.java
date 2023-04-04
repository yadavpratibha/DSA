package lecture04;
import java.util.*;
public class Assignment_hollow_rhombus_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star=n;
        int space=n-2;
        int leftspace=n;

        while(row<=n) {

            //print left space
            int i=1;
            while(i<leftspace) {
                System.out.print(" ");
                i++;
            }

            //for first and last row
            if(row==1 || row==n) {
                int j=1;
                while(j<=n) {
                    System.out.print("*");
                    j++;
                }
            }

            //for rows in between
            else {
                System.out.print("*");
                int k=1;
                while(k<=space) {
                    System.out.print(" ");
                    k++;
                }
                System.out.print("*");

            }
            row++;
            leftspace--;
            System.out.println();
        }
    }
}