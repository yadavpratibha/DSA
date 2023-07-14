package lecture49;

public class Leetode713_Subarray_Product_Less_Than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,5,2,6};
		int k = 100;
		System.out.println(SubarrayProductLessThank(nums, k));
	}
	
	public static int SubarrayProductLessThank(int[] nums,int k) {
		int si=0;
		int ei=0;
		
		int p=1;
		int count=0;
		//growing
		while(ei<nums.length) {
			p=p*nums[ei];
			
			//shrinking
			while(p>=k && si<=ei) {
				p=p/nums[si];
				si++;
			}
			
			count=count+ei-si+1;
			ei++;
		}
		return count;
	}

	
}
