package finalstudy;

public class binary_Search {

	public static void main(String[] args) {
		int[] nums= {-1,0,3,5,9,12};
		System.out.println(binarySearch(nums,9));
		
		
	}
	public static int binarySearch(int [] nums, int target) {
		if(nums.length==0) return -1;
		
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int midpoint=left+ (right-left)/2;
			if(nums[midpoint]==target) {
				return midpoint;
				
			}else if(nums[midpoint]>target) {
				right=midpoint-1;
				
			}else {
				left=midpoint+1;
			}
		}
		return -1;
	}

}
