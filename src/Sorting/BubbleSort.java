package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {6,5,2,8,9,4,-2,100,0};
		int size = nums.length;
		int temp =0;
		
		//before sorting
		System.out.println("before sortng...");
		for(int num: nums) {
			System.out.print(num + " ");
		}
		
		
		//create loop
		for(int i=0;i<size;i++) {
			
			//check value and swapping 
			for(int j=0;j<size-1;j++) {
				
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]= temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("After sortng...");
		for(int num: nums) {
			System.out.print(num+ " ");
		}

	}

}
