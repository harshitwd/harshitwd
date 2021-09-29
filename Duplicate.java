package thinkQ;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(11);
		li.add(121);
		li.add(11);
		li.add(141);
		li.add(115);
		li.add(116);
		
		List<Integer> li2 = new ArrayList<Integer>();
		int len = li.size();
		for(int i = 0; i<li.size(); i++) {
			for(int j = i+1; i<len-1; j++) {
			
				if(li.get(i) == li.get(j)) {
					
					li.remove(j);
				}else {
					li2.add(li.get(i));
				}
			}
			
			System.out.println(li2);
		}

	}

}
