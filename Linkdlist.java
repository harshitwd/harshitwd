package thinkQ;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Linkdlist {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		ArrayList<String> ls= new ArrayList<String>(); 
		ls.add("hey");
		ls.add("man");
		ls.add("what");
		ls.add("are");
		ls.add("you");
		ls.add("doing");
		
		System.out.println(ls);
		
		System.out.println("Enter  index you want to add at:");
		int n = scn.nextInt();
		
		System.out.println("Enter the string: ");
		String str = scn.next();
		
		ls.add(n,str);
		System.out.println(ls);
	}
}
