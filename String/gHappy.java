package String;

public class gHappy {
	/* We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately 
	 * to its left or right. Return true if all the g's in the given string are happy. */
	
	public static void main(String[] args) {
		boolean answer1 = new gHappy().gHappy("xxggxx");
		boolean answer2 = new gHappy().gHappy("xxggyygxx");
		System.out.printf("Answer 1: %b\nAnswer 2: %b", answer1, answer2);
	}
	
	public boolean gHappy(String str) {
		  boolean b1 = true;
		  boolean b2 = true;
		  boolean b3 = true;
		  if (str.length()>1) {
		    if (str.charAt(0)=='g') {
		      if (str.charAt(1)!='g') b1 = false; 
		    }
		    for (int i=1 ; i<str.length()-1 ; i++) {
		     if (str.charAt(i)=='g') {
		      if (str.charAt(i-1)!='g' && str.charAt(i+1)!='g') {
		        b2 = false;
		        break;
		      }
		     }
		    }
		    if (str.charAt(str.length()-1)=='g') {
		      if (str.charAt(str.length()-2)!='g') b3 = false; 
		    }
		    if (b1==false || b2==false || b3==false) return false;
		  }
		  if (str.length()==1 && str=="g") return false;
		  return true;
	}

}
