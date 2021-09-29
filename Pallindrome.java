package ninja;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String st = scn.next();
		int len = st.length();
		String str1 = "";
		for(int i  = 0; i<len; i++ ) {
			
			char ch =st.charAt(i);
			str1 = ch + str1 ;	
		}
		if(st.equals(str1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("NOt palindrome");
		}
	}

	
	}

