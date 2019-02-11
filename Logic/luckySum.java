package Logic;

public class luckySum {
	/* Given 3 int values, a b c, return their sum. However, if one of the values is 13 then 
	 * it does not count towards the sum and values to its right do not count. So for example, 
	 * if b is 13, then both b and c do not count. */
	
	public static void main(String[] args) {
		int answer1 = new luckySum().luckySum(10,13,15);
		int answer2 = new luckySum().luckySum(10,12,15);
		System.out.printf("Answer 1: %d\nAnswer 2: %d", answer1, answer2);
	}
	
	public int luckySum(int a, int b, int c) {
		  int sum1 = 0;
		  int[] array1;
		  array1 = new int[3];
		  array1[0] = a;
		  array1[1] = b;
		  array1[2] = c;
		  for (int i=0 ; i<array1.length ; i++) {
		    if (array1[i] == 13) break;
		    sum1 = sum1 + array1[i];
		  }
		  return sum1;
	}

}
