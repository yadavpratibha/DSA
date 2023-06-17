package lecture14;

import java.util.Scanner;

public class Assignment_Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		CompressedString(in);
	}
	
	public static void CompressedString(String in) {
		int count=1;
		for(int i=0;i<in.length()-1;i++) {
			
			if(in.charAt(i)==in.charAt(i+1)) {
				count++;
			}
			if(in.charAt(i)!=in.charAt(i+1) && count!=1) {
				
				System.out.print(in.charAt(i));
				System.out.print(count);
				count=1;
			}
			else if(in.charAt(i)!=in.charAt(i+1) && count==1){
				
				System.out.print(in.charAt(i));
				count=1;
			}
		}
		
		System.out.print(in.charAt(in.length()-1));
		if(count>1) {
			System.out.print(count);
		}
	}

}
