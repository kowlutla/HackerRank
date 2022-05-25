/**
Louise and Richard have developed a numbers game. They pick a number and check to see if it is a power of 2
If it is, they divide it by 2. If not, they reduce it by the next lower number which is a power of 2. 
Whoever reduces the number to  1 wins the game. Louise always starts.


Given an initial value, determine who wins the game.

	Sample Input 0
	
	1
	6
	
	Sample Output 0
	
	Richard
	
	
	Explanation 0

6 is not a power of 2 so Louise reduces it by the largest power of 2 less than 6: 6-4=2;
.
2 is a power of so Richard divides by to get and wins the game.


 */
package counterGame;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class CounterGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		long n=sc.nextLong();
		
		String winner=counterGame(n);
		
		System.out.println("Winner : "+winner);
		
		//System.out.println("Next power: "+nextPower(n));
		winner=counterGame1(n);
		System.out.println("Winner: "+winner);
		
		

	}
	
	
	
	private static String counterGame1(long n)
	{
		int counter=0;
		n--;
		while(n>0)
		{
			n=n&(n-1);
			counter++;
		}
		if((counter&1)==0)
		{
			return "Rathod";
		}
		else
		{
			return "Louise";
		}
	}
	
	private static long nextPower(long n)
	{
		int count_bits=countBits(n);
		n=(int)Math.pow(2,(count_bits-1));
		System.out.println("Bist: "+count_bits);
		return n;
	}

	private static String counterGame(long n) {
		 int counter=0;

	        while(n>=1)
	        {
	            if((n&(n-1))==0)
	            {
	                n=n/2;
	              
	                if(n==1)
	                {
	                    break;
	                }
	                  counter=counter^1;
	            }
	            else
	            {
	                int count_bits=countBits(n);
	                n=n-(int)Math.pow(2,(count_bits-1));
	               
	                if(n==1)
	                {
	                    break;
	                }
	                 counter=counter^1;
	            }
	        }


	        if(counter==1)
	        {
	            return "Richard";
	        }
	        else
	        {
	            return "Louise";
	        }
	    }

	private static int countBits(long n) {
		long temp=n;
        int count=0;
        while(temp>0)
        {
            count++;
            temp=temp>>1;
        }
        return count;
		
	}
}


