package lecture14;

import java.util.Scanner;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = "hello"; //created in pool
		String str1 = "hello"; //created in pool
		
		String str2 = new String("hello"); //in heap but not in pool
		String str3 = new String("hello"); //in heap but not in pool
		
		String st = sc.nextLine(); //user input
		
		System.out.println(st);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str3==str2);
		System.out.println(str1==str);
		if(str == str1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
