
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	
	public class ArrayManupulation 
	{

	    // Complete the arrayManipulation function below.
	    static long arrayManipulation(int n, int[][] q) 
	    {
	        long array[]=new long[n+2];
	        
	        for(int i=0;i<q.length;i++)
	        {
	            int a=q[i][0];
	            int b=q[i][1];
	            int k=q[i][2];
	            array[a]=array[a]+k;
	            array[b+1]=array[b+1]-k;
	            
	        }
	        long max=Long.MIN_VALUE;
	        long sum=0;
	        for(int i=0;i<array.length;i++)
	        {
	            sum=sum+array[i];
	            max=Math.max(sum,max);
	        }
	        return max;

	    }

	    public static void main(String[] args) throws IOException {
	       
	    	int temp[][]= {{1, 2, 100},{2 ,5 ,100}, {3, 4, 100}};
	    	int n=10;
	    	System.out.println("Max: "+arrayManipulation(n,temp));
	    }
	}


