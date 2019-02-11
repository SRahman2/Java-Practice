package String;

import Logic.luckySum;

public class countYZ {
	/* Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" 
	 * and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say 
	 * that a y or z is at the end of a word if there is not an alphabetic letter immediately 
	 * following it. */
	
	public static void main(String[] args) {
		int answer1 = new countYZ().countYZ("fez day");
		int answer2 = new countYZ().countYZ("DAY abc XYZ");
		System.out.printf("Answer 1: %d\nAnswer 2: %d", answer1, answer2);
	}
	
	public int countYZ(String str) {
		  int count = 0;
		  for (int i=0 ; i<str.length()-1 ; i++) {
		    if (str.toLowerCase().charAt(i)=='y' || str.toLowerCase().charAt(i)=='z') {
		      if (!Character.isLetter(str.charAt(i+1))) {
		        count++;
		      }
		    }
		  }
		  if (str.toLowerCase().charAt(str.length()-1)=='y' || 
		          str.toLowerCase().charAt(str.length()-1)=='z') {
		    count++;
		  }
		  return count;
	}
	
}
