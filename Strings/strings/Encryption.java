package strings;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.println("Original message: "+s);
		System.out.println("Encrypted Message: "+encryptString(s));
		//System.out.println("Encrypted msg: "+enc);

	}

	private static String encryptString(String s) {
		int len = s.length();
		double srt = Math.sqrt(len);
		int low = (int) Math.floor(srt);
		int high = (int) Math.ceil(srt);
		String temp = "";
		for(int i=0;i<high;i++)
		{
			int j=0;
			while(i+j<s.length())
			{
				temp=temp+s.substring(i+j, i+j+1);
				j=j+high;
				
			}
			temp=temp+" ";
			//System.out.println(temp);
		}
		return temp;
		
	}

}
