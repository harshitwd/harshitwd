package thinkQ;

import java.util.Scanner;

public class StringFriqu {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scn.nextLine();
		
		System.out.println("Enter the Letter :");
		String l = scn.next();
		
		int count = 0;
		for(int i = 0; i<str.length();i++) {
			if(l.charAt(0) == str.charAt(i)) {
				count += 1;
			}
		}
		System.out.println("frequency of letter is: " + count);
	}

}
