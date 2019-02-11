package Logic;

public class makeBricks {
	/* We want to make a row of bricks that is goal inches long. 
	 * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
	 * Return true if it is possible to make the goal by choosing from the given bricks.
	 */
	public static void main(String[] args) {
		boolean ans = new makeBricks().makeBricks(4,5,20);
		if (ans) {
			System.out.println("Possible");
		} else {
			System.out.println("Not possible");
		}
	}
	public boolean makeBricks(int small, int big, int goal) {
		  int big1 = 5;
		  int bigall = big*5;
		  if (goal < big1) {
		    if (goal <= small) return true;
		  }
		  if (goal==big1 && big>=1) return true;
		  if (goal > big1) {
		    if (goal/big1 < big && goal%big1 <= small) return true;
		    if (goal/big1 == big && goal%big1 <= small) return true;
		    if (goal/big1 > big) {
		      if (small+(big*5)>=goal) return true;
		    }
		  }
		  return false; 
		}
}
