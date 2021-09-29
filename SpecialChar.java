package thinkQ;

import java.util.Scanner;

public class SpecialChar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		int UpperCase = 0; 
		int Number = 0;
		int lowerCase = 0;
		int specialChar = 0;
		
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) >= 'A' &&  str.charAt(i) <= 'Z' ) {
				UpperCase ++;
			}
			else if(str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z' ) {
				lowerCase ++;
			}
			else if(str.charAt(i) >= '0' &&  str.charAt(i) <= '9' ) {
				Number ++;
			}
			else {
				specialChar ++;
			}
		}
		System.out.println("UpperCase: " +UpperCase);
		System.out.println("lowerCase: " +lowerCase);
		System.out.println(" Number: " + Number);
		System.out.println("specialChar: " +specialChar);

	}

}
