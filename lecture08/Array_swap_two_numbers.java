package lecture08;

import java.util.*;

public class Array_swap_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] other = arr;
		swap(arr[0], arr[1]); //sending values saved in arr
		System.out.println(arr[0]+" "+arr[1]); //print value saved in address array at index 0,1
	}
	public static void swap(int a, int b) { //Receiving value from main
		int temp = a; //the values are swapped locally
		a = b;
		b= temp;
	}

}
