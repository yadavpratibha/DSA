package lecture01;

import java.util.Scanner;

public class Grade_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if (m >= 81) {
			System.out.println("A");
		} else if (m < 81 && m >= 65) {
			System.out.println("B");
		} else if (m < 65 && m >= 55) {
			System.out.println("C");
		} else if (m < 55 && m >= 45) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}

}
