package thinkQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(2);
		
		al.remove(3);
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("arter sort");
		System.out.println(al);
		System.out.println("after reverse");
		for(int i = al.size()-1; i>=0;i--) {
			System.out.print( al.get(i) + " ");
		}
		System.out.println();
		System.out.println("After suffle");
		Collections.shuffle(al);
		System.out.println(al);
		
		System.out.println("after swap");
		Collections.swap(al, 0, 3);
		System.out.println(al);

		
	}

}
