import java.util.Scanner;

public class NewYearChoas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		newYearChoas(array);

	}

	private static void newYearChoas(int[] q)
	{
		 int count=0;
	        for(int i=0;i<q.length;i++)
	        {
	            for(int j=i+1;j<q.length;j++)
	            {
	                if(q[i]>q[j])
	                {
	                	if(q[i]-q[j]>2)
	                	{
	                		System.out.println("Too Choastic");
	                		return;
	                	}
	                	else
	                	{
	                		int temp=q[i];
	                		q[i]=q[j];
	                		q[j]=temp;
	                		count++;
	                	}
	                }
	            }
	        }
	        System.out.println(count);
	        

		
	}

}
