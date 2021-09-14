package thinkQ;
import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the no. between 1 to 9 ");
		int amount = scn.nextInt();
		int orgNumber = amount;
		int twentyFive_Pcoin = amount/25;
		amount = amount%25;
		int ten_Pcoin = amount/10;
		amount = amount%10;
		int five_Pcoin = amount/5;
		amount = amount%5;
		int one_Pcoin = amount;
		
		System.out.println(orgNumber +" in coins:");
		System.out.println(twentyFive_Pcoin + " Twenty Five coins");
		System.out.println(ten_Pcoin + " Ten coins");
		System.out.println(five_Pcoin +" Five coins");
		System.out.println(one_Pcoin +" one coins");

	}

}
