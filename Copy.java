package thinkQ;

import java.util.ArrayList;
import java.util.List;

public class Copy {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("hey");
		li.add("how");
		li.add("u");
		li.add("doinnnn!");
		System.out.println(" First list :" );
		System.out.println( li + " ");
		
		
		List<String> li2 = new ArrayList<String> ();
		
		li2.addAll(li);
		//for(String sh : li2) {
			
			System.out.print( li2 + " ");
		//}
	}

}
