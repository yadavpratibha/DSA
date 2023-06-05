package lecture12;
import java.util.*;
public class Assignment_Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //number of testcases
		for(int i=1;i<=t;i++) { 
			int n = sc.nextInt();//number of digits in the integer
			int[] arr = new int[n];
			for(int j=0;j<arr.length;j++) { //input digits
				arr[j] = sc.nextInt();
			}
			Next_permutation(arr);
			
		}
	}
	public static void Next_permutation(int[] arr) {
		int i=arr.length-2;
		while(arr[i]>arr[i+1]) {
			i--;
		}
		int j=i+1;
		int min=arr[i+1];
		while(j<arr.length) {
			if(arr[j]>arr[i] && min>arr[j]) {
				min=arr[j];
				break;
			}
			j++;
		}
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		Reverse(arr,i+1,arr.length);
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");}
	}
	
	public static void Reverse(int[] arr,int i,int j) {
		for(; i<j;i++,j--) {
			int temp=arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			}
		
		}
	}


