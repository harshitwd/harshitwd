package ninja;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int n = number;
		int sum = 0;
		while(n!=0) {
			int t = n%10;
			 int z = t*t*t;
			 sum = sum+z;
			 n = n/10;
		}
		if(sum == number) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not a arm");
		}
		
	}

}
