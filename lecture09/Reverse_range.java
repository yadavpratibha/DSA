package lecture09;

public class Reverse_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,9,7,1,17,5,8};
		Reverse(arr,2,6);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Reverse(int[] arr,int i,int j) {
			for(; i<j;i++,j--) {
				int temp=arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				}
			
			}
		}
