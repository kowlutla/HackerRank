package strings;
import java.util.*;
public class CountingValleys 
{

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your pattern: ");
        String s = sc.next();
        int valleys=countValleys(s);
        System.out.println("No of Valleys formed Using '"+s+"' Patterns are: "+valleys);
        int mountains=countMountains(s);
        System.out.println("No of Mountains formed Using '"+s+"' Patterns are: "+mountains);
        //to get total valleys and mountains add above both results or if we want to compute directly use below method
        int valleysandmountains=countValleysAndMountains(s);
        System.out.println("Total Mountains and Valleys formed using "+s+" patterns are: "+valleysandmountains);
       
    }

	private static int countValleysAndMountains(String s) 
	{
		int level=0;
		int valmounts=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='U'  || s.charAt(i)=='u')
			{
				level++;
			}
			if(s.charAt(i)=='D' || s.charAt(i)=='d')
			{
				level--;
			}
			if(level==0)
			{
				valmounts++;
			}
		}
		return valmounts;
	}

	private static int countMountains(String s) 
	{
		int level=0;
		int mountains=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='U' || s.charAt(i)=='u')
			{
				level++;
			}
			if(s.charAt(i)=='D' || s.charAt(i)=='d')
			{
				level--;
			}
			if(level==0 && s.charAt(i)=='D' || level==0 && s.charAt(i)=='d')
			{
				mountains++;
			}
		}
		return mountains;
		
	}

	private static int countValleys(String s) 
	{
		int level=0;
	    int valleys=0;
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)=='U' || s.charAt(i)=='u')
	        {
	        	++level;
	        }
	        if(s.charAt(i)=='D' || s.charAt(i)=='d')
	        {
	        	--level;
	        }
	        if(level==0 && s.charAt(i)=='U' || level==0 && s.charAt(i)=='u')
	        {
	        	++valleys;
	        }
	    }
	    return valleys;
	}
	

}
