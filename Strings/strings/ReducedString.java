package strings;

import java.util.Scanner;

public class ReducedString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		System.out.println("Reduced string: "+reducedString(s));

	}
	
	 static String reducedString(String s) 
	 {

	        for(int i=1;i<s.length();i++)
	        {
	           if(s.charAt(i)==s.charAt(i-1))
	           {
	        	   s=s.substring(0,i-1)+s.substring(i+1);
	        	   i=0;
	           }
	        }
	        if(s.length()!=0)
	        {
	            return s;
	        }
	        else
	        {
	            return "Empty String";
	        }
	 }


}
