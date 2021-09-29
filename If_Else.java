package cb;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		float y = scn.nextFloat();
		System.out.println("this is the float no." + y);
		
		if(x == 0) {
			System.out.println("enter the valid no.");
		}
		else if(x %2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}
