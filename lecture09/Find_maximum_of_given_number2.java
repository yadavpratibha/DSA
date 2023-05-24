package lecture09;

public class Find_maximum_of_given_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,9,7,11,8};
		System.out.println(Max(arr,5));
		
	}
	
	public static int Max(int[] arr, int j) {
			int max =Integer.MIN_VALUE;
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			
			}
			return max;
		}
	}

