package String;

public class notReplace {
	/* Given a string, return a string where every appearance of the lowercase word "is" has 
	 * been replaced with "is not". The word "is" should not be immediately preceeded or followed 
	 * by a letter -- so for example the "is" in "this" does not count. */
	
	public static void main(String[] args) {
		String answer1 = new notReplace().notReplace("This is right");
		String answer2 = new notReplace().notReplace("Dis is bliss is");
		System.out.printf("Answer 1: %s\nAnswer 2: %s", answer1, answer2);
	}
	
	public String notReplace(String str) {
		String str1 = "";
		if (str.length()>1) {
		  if (str.length()==2) {
		    if (str.equals("is")) {
		      str1 = "is not";
		    } else {
		      str1 = str;
		    }
		  }
		  if (str.length()>2) {
		    for (int i=0 ; i<str.length()-2 ; i++) {
		      if (str.charAt(i)=='i' && str.charAt(i+1)=='s') {
		        if (i-1 >= 0) {
		          if (!Character.isLetter(str.charAt(i-1)) && 
		                              !Character.isLetter(str.charAt(i+2))) {
		                                str1 = str1 + "is not";
		                                i++;
		                              } else {
		                                str1 = str1 + String.valueOf(str.charAt(i));
		                              }
		        } else {
		          if (!Character.isLetter(str.charAt(i+2))) {
		              str1 = str1 + "is not";
		              i++;
		          } else {
		              str1 = str1 + String.valueOf(str.charAt(i));
		          }
		        }
		      } else {
		        str1 = str1 + String.valueOf(str.charAt(i));
		      }
		    }
		      for (int j=str.length()-2 ; j<str.length() ; j++) {
		        if (str.charAt(j)=='i' && str.charAt(j+1)=='s') {
		          if (!Character.isLetter(str.charAt(j-1))) {
		            str1 = str1 + "is not";
		            j++;
		          } else {
		            str1 = str1 + String.valueOf(str.charAt(j));
		          }
		        } else {
		          str1 = str1 + String.valueOf(str.charAt(j));
		        }
		      }
		  }
		} else {
		  str1 = str;
		}
		  return str1;
		}


}
