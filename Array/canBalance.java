package Array;

import java.util.Arrays;

import String.notReplace;

public class canBalance {
	/* Given a non-empty array, return true if there is a place to split the array so 
	 * that the sum of the numbers on one side is equal to the sum of the numbers on 
	 * the other side. */
	
	public static void main(String[] args) {
		int[] arg1 = {1, 2, 3, 1, 0, 2, 3};
		boolean answer1 = new canBalance().canBalance(arg1);
		int[] arg2 = {1, 2, 3, 1, 0, 1, 3};
		boolean answer2 = new canBalance().canBalance(arg2);
		System.out.printf("Answer 1: %s\nAnswer 2: %s", answer1, answer2);
	}
	
	public boolean canBalance(int[] nums) {
		  if (nums.length > 1) {
		    int left = nums[0];
		    int right = 0;
		    for (int i=1 ; i<nums.length ; i++) {
		      right = right + nums[i];
		    }
		    for (int i=1 ; i<nums.length ; i++) {
		      if (left == right) {
		        return true;
		      } else {
		        left = left + nums[i];
		        right = right - nums[i];
		      }
		    }
		  }
		  return false;
	}

}
