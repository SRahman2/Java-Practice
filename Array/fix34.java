package Array;

import java.util.Arrays;

import String.notReplace;

public class fix34 {
	/* Return an array that contains exactly the same numbers as the given array, but rearranged 
	 * so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number 
	 * may move. The array contains the same number of 3's and 4's, every 3 has a number after it 
	 * that is not a 3, and a 3 appears in the array before any 4. */
	
	public static void main(String[] args) {
		int[] arg1 = {1, 3, 1, 4, 4, 3, 1};
		int[] answer1 = new fix34().fix34(arg1);
		int[] arg2 = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
		int[] answer2 = new fix34().fix34(arg2);
		System.out.printf("Answer 1: %s\nAnswer 2: %s", Arrays.toString(answer1), Arrays.toString(answer2));
	}
	
	public int[] fix34(int[] nums) {
		  int count = 0;
		  int hold = 0;
		  for (int i=0 ; i<nums.length ; i++) {
		    if (nums[i]==3) count++; 
		  }
		  int[] array3 = new int[count];
		  int[] array4 = new int[count];
		  int count3 = 0;
		  int count4 = 0;
		  for (int i=0 ; i<nums.length ; i++) {
		    if (nums[i]==3) {
		      array3[count3] = i;
		      count3++;
		    }
		    if (nums[i]==4) {
		      array4[count4] = i;
		      count4++;
		    }
		  }
		  for (int i=0 ; i<count ; i++) {
		    hold = nums[array3[i]+1];
		    nums[array3[i]+1] = 4;
		    nums[array4[i]] = hold;
		  }
		  return nums;
		}

}
