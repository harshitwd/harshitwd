package thinkQ;

import java.util.Scanner;

public class ArthmeticExp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first no.");
		int n = scn.nextInt();
		
		System.out.println("Enter the second no.");
		int j = scn.nextInt();
		
		try {
			System.out.println("result = " + n/j);
		} catch(ArithmeticException e) {
			System.out.println("Exception" + e);
		}
	}

}
