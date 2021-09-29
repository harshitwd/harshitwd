package thinkQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashArray {

	public static void main(String[] args) {
		HashMap<Integer, ArrayList<String>> hp = new HashMap<>();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("HEYYY");
		al1.add("Howwww");
		
		ArrayList<String> alist2 = new ArrayList<String>();
		alist2.add("YOUUU");
		alist2.add("doinnn!");
		
		hp.put(1, al1);
		hp.put(2, alist2);
		Set<Entry<Integer,ArrayList<String>>> set = hp.entrySet();
		for(Entry<Integer, ArrayList<String>> a : set) {
			System.out.println(a.getKey() + " :" + a.getValue());
			//System.out.println(a.getValue());
			int key = a.getKey();
			ArrayList<String> at = a.getValue();
			for(String i : at) {
				System.out.println(i);
			}
		}

	}

}
