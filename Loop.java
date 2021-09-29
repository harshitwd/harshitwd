package cb;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the nth time you want");
		int j = scn.nextInt();
		int n = 0;
		int o = 0;
		while(n<=j) {
			
			o = o+n;
			n = n+ 1;
			System.out.println("sum is " + o);
			
		}

	}

}
