/**
 Sample Input

	2
	abcd ->4
	abab ->2
	
 
 */
package strings;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class StringConstruction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		System.out.println("String: ");
		int count=constCount1(s);
		System.out.println("Count: "+count);
		sc.close();

	}

	private static int constCount(String s) {
		
		int count=0;
		String res="";
		int index=0;
		while(!(s.equals(res)))
		{
			if(res.contains(""+s.charAt(index)))
			{
				res=res+s.charAt(index);
			}
			else
			{
				res=res+s.charAt(index);
				count++;
			}
			index++;
		}
		return count;
	}
	
	
	private static int constCount1(String s)
	{
		int[]count=new int[26];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)-'a']++;
		}
		
		int res=0;
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				res++;
			}
		}
		return res;
	}
	
	

}
