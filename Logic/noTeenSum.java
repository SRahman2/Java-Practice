package Logic;

public class noTeenSum {
	/* Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the 
	 * range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. 
	 * Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns 
	 * that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times 
	 * (i.e. "decomposition"). Define the helper below and at the same indent level as the main 
	 * noTeenSum().*/
	
	public static void main(String[] args) {
		int answer = new noTeenSum().noTeenSum(2,13,1);
		System.out.println(answer);
	}
	
	public int noTeenSum(int a, int b, int c) {
		int[] array1;
		  int sum1 = 0;
		  array1 = new int[3];
		  array1[0] = a;
		  array1[1] = b;
		  array1[2] = c;
		  for (int i=0 ; i<array1.length ; i++) {
		    if (array1[i]>=13 && array1[i]<=19) {
		      int teen1 = fixTeen(array1[i]);
		      sum1 = sum1 + teen1;
		    } else {
		    sum1 = sum1 + array1[i];
		    }
		  }
		  return sum1;
		}

		public int fixTeen(int n) {
		    if (n==15 || n==16) return n;
		    return 0;
		}
	
}
