package ninja;

import java.util.Scanner;

public class AbandantNO {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a number : ");				
		int number = scn.nextInt();
		//declare a variable to store sum of factors of the number
		int sum = 0;
		//loop for calculating sum of factors of the number
		for(int i = 1 ; i < number ; i++)
		{
			if(number % i == 0)
				sum = sum + i;
		}
		//condition for checking whether the sum is greater than number or not
		if(sum > number)
		        System.out.println("Abundant Number");
		else
		        System.out.println("Not an Abundant Number");

	}}
