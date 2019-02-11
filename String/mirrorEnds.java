package String;

public class mirrorEnds {
	/* Given a string, look for a mirror image (backwards) string at both the beginning and end 
	 * of the given string. In other words, zero or more characters at the very beginning of the 
	 * given string, and at the very end of the string in reverse order (possibly overlapping). 
	 * For example, the string "abXYZba" has the mirror end "ab". */
	
	public static void main(String[] args) {
		String answer1 = new mirrorEnds().mirrorEnds("123and then 321");
		String answer2 = new mirrorEnds().mirrorEnds("band andab");
		System.out.printf("Answer 1: %s\nAnswer 2: %s", answer1, answer2);
	}
	
	public String mirrorEnds(String string) {
	    String str1 = "";
	  if (string.length()>0) {
	    for (int i=0 ; i<string.length() ; i++) {
	      if (string.charAt(i)==string.charAt(string.length()-1-i)) {
	        if (i==string.length()-1-i) {
	          str1 = string;
	          break;
	        } else {
	          str1 = str1 + String.valueOf(string.charAt(i)); 
	        }
	      } else {
	        break;
	      }
	    }
	  }
	  return str1;
	}

}
