package Logic;

public class makeChocolate {
	/* We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and 
	 * big bars (5 kilos each). Return the number of small bars to use, assuming we always use big 
	 * bars before small bars. Return -1 if it can't be done. */
	
	public static void main(String[] args) {
		int answer = new makeChocolate().makeChocolate(4,1,9);
		System.out.println(answer);
	}
	
	public int makeChocolate(int small, int big, int goal) {
		  int count = 0;
		  for (int i=0 ; i<big ; i++) {
		    count = count + 5;
		    if (count > goal) {
		      count = count - 5;
		      break;
		    }
		  }
		  if (count <= goal) {
		    if (goal-count<=small) return goal-count;
		  }
		  return -1;
	}
	
}
