import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class BonAppetit {

	// Complete the bonAppetit function below.
    static void bonAppetit(ArrayList<Integer> bill, int k, int b) {

        int totalsum=0;
        for(int i=0;i<bill.size();i++)
        {
            totalsum=totalsum+bill.get(i);
        }
        int share=totalsum-bill.get(k);
        int bactual=share/2;
        if(bactual==b)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            System.out.println(b-bactual);
        }


    }

    public static void main(String[] args) throws IOException {
    
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter bill lenght: ");
    	int n=sc.nextInt();
    	System.out.print("enter item anna doesn't eat: ");
    	int k=sc.nextInt();
    	ArrayList<Integer> bill=new ArrayList<Integer>(n);
    	for(int i=0;i<n;i++)
    	{
    		bill.add(sc.nextInt());
    	}
    	System.out.print("Enter Anna paid bill: ");
    	int b=sc.nextInt();
    	bonAppetit(bill, k, b);
    	sc.close();
    	
    }

}





//Anna and Brian are sharing a meal at a restuarant and they agree to split the bill equally.
// Brian wants to order something that Anna is allergic to though, and they agree that Anna won't pay for that item.
// Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

