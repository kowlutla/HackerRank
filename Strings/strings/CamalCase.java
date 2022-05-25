package strings;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class CamalCase {
	  static int camelcase(String s) {

	        int count=0;
	        if(s.charAt(0)>='a' && s.charAt(0)<='z')
	        {
	            count++;
	        }
	        for(int i=1;i<s.length();i++)
	        {
	            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	            {
	                count++;
	            }
	        }
	        return count;


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        
	    	System.out.print("Enter String: ");
	        String s = scanner.nextLine();

	        int result = camelcase(s);
	        System.out.println("No of words: "+result);


	        scanner.close();
	    }
}




/*Alice wrote a sequence of words in CamelCase as a string of letters,

having the following properties:

   It is a concatenation of one or more words consisting of English letters.
   All letters in the first word are lowercase.
   For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.*/

