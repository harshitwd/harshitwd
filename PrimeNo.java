package cb;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = 2;
		boolean flag = true;
		while (d < n) {
			if (n % d == 0) {
				flag = false;
			}
			d = d+1;
			
		}
		
		if (flag == true) {
			System.out.println("the no. is a prime no.");
		}
		else {
			System.out.println("the no. is not a prime no.");
		}
	}
}