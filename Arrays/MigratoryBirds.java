import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter list items: ");
		List<Integer> list = new ArrayList<Integer>(n);
		for (int i = 1; i <= n; i++) {
			list.add(sc.nextInt());
		}
		int k = migratoryBirds(list);
		System.out.println(k);

	}

//		static int migratoryBirds(List<Integer> ar) {
//			// Collections.sort(ar);
//			int max = 0;
	//
//			for (int i = 0; i < ar.size(); i++) {
//				int count = 0;
//				for (int j = i + 1; j < ar.size(); j++) {
//					if (ar.get(i) == ar.get(j)) {
//						count++;
//					}
//				}
//				if (count > max) {
//					max = ar.get(i);
//				}
//			}
//			return max;
//		}

	static int migratoryBirds(List<Integer> ar)
	{

        int counter[]=new int[6];
        for(int i=0;i<ar.size();i++)
        {
            counter[ar.get(i)]++;
        }

        int max=0;int result=0;
        for(int i=1;i<=5;i++)
        {
            if(counter[i]>max)
            {
                result=i;
                max=counter[i];
            }
        }
        return result;
	}

}
