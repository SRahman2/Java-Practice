package Array;

public class linearIn {
	/* Given two arrays of ints sorted in increasing order, outer and inner, return true if 
	 * all of the numbers in inner appear in outer. The best solution makes only a single 
	 * "linear" pass of both arrays, taking advantage of the fact that both arrays are already 
	 * in sorted order. */
	
	public static void main(String[] args) {
		int[] out1 = {1, 2, 4, 6};
		int[] in1 = {2, 4};
		boolean answer1 = new linearIn().linearIn(out1, in1);
		int[] out2 = {1, 2, 4, 6};
		int[] in2 = {2, 3, 4};
		boolean answer2 = new linearIn().linearIn(out2, in2);
		System.out.printf("Answer 1: %s\nAnswer 2: %s", answer1, answer2);
	}
	
	public boolean linearIn(int[] outer, int[] inner) {
		  int count=0;
		  for (int j=0 ; j<inner.length ; j++) {
		    for (int i=0 ; i<outer.length ; i++) {
		      if (outer[i]==inner[j]) {
		        count++;
		        break;
		      } 
		    }
		  }
		  if (count >= inner.length) return true;
		  return false;
	}


}
