import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class MigratoryBirds2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter list items: ");
		List<Integer> list = new ArrayList<Integer>(n);
		for (int i = 1; i <= n; i++) {
			list.add(sc.nextInt());
		}
		int k = migratoryBirds(list);
		System.out.println(k);

	}

//	static int migratoryBirds(List<Integer> ar) {
//		// Collections.sort(ar);
//		int max = 0;
//
//		for (int i = 0; i < ar.size(); i++) {
//			int count = 0;
//			for (int j = i + 1; j < ar.size(); j++) {
//				if (ar.get(i) == ar.get(j)) {
//					count++;
//				}
//			}
//			if (count > max) {
//				max = ar.get(i);
//			}
//		}
//		return max;
//	}
	
	static int migratoryBirds(List<Integer> ar)
	{
		 HashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
	       for(int i=0;i<ar.size();i++)
	       {
	           if(map.get(ar.get(i))!=null)
	           {
	               map.put(ar.get(i),map.get(ar.get(i))+1);
	           }
	           else
	           {
	               map.put(ar.get(i),1);
	           }
	       }
		int max=0;
		Iterator<Integer>iter=map.keySet().iterator();
		while(iter.hasNext())
		{
			int key=iter.next();
			if(map.get(key)>max)
			{
				max=key;
			}
		}
		return max;
	}

}
