package Array;

import java.util.Arrays;

public class squareUp {
	/* Given n>=0, create an array length n*n with the following pattern, shown here for 
	 * n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).  */
	
	public static void main(String[] args) {
		int[] answer1 = new squareUp().squareUp(3);
		int[] answer2 = new squareUp().squareUp(2);
		System.out.printf("Answer 1: %s\nAnswer 2: %s", Arrays.toString(answer1), Arrays.toString(answer2));
	}
	
	public int[] squareUp(int n) {
		  int[] arr = new int[n*n];
		    
		  if(n == 0) return arr;
		              
		  for(int i = n - 1; i < arr.length; i += n) {
		    for(int j = i; j >= i - i / n; j--)
		      arr[j] = i - j + 1;
		  }
		                              
		  return arr;
	}

}
